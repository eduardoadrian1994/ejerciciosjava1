package ar.com.dypsa.barCarCon.test;

//Importamos las clases necesarias para utilizar un pool de hilos y un AtomicInteger
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//Definimos la clase principal BarraDeCargaConcurrente
public class BarraDeCargaConcurrente {
	// Definimos el método principal
	public static void main(String[] args) {
		// Creamos una barra de carga con un tamaño de 100
		BarraDeCarga barraDeCarga = new BarraDeCarga(100);
		// Creamos un pool de hilos con 5 hilos utilizando el método newFixedThreadPool
		// de la clase Executors
		ExecutorService executor = Executors.newFixedThreadPool(10);
		// Creamos y ejecutamos 10 tareas para actualizar la barra de carga utilizando el
		// método execute del pool de hilos
		for (int i = 0; i < 10; i++) {
			executor.execute(new TareaActualizarBarra(barraDeCarga, i * 10, (i + 1) * 10));
		}
		// Apagamos el pool de hilos utilizando el método shutdown y esperamos a que
		// todas las tareas se completen utilizando el método awaitTermination
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//Definimos la clase BarraDeCarga que representa la barra de carga
class BarraDeCarga {
	// Definimos un AtomicInteger para mantener el progreso actual de la barra y
	// garantizar que no se generen condiciones de carrera al actualizar el progreso
	private AtomicInteger progreso;
	// Definimos una variable para almacenar el tamaño de la barra
	private int tamanio;

	// Definimos el constructor de la clase BarraDeCarga que recibe como argumento
	// el tamaño de la barra
	public BarraDeCarga(int tamanio) {
		// Inicializamos el AtomicInteger progreso en 0
		this.progreso = new AtomicInteger(0);
		// Asignamos el valor del argumento tamanio a la variable tamanio de la clase
		this.tamanio = tamanio;
	}

	// Definimos el método actualizar que actualiza el progreso de la barra en un
	// rango especificado por los argumentos inicio y fin
	public void actualizar(int inicio, int fin) {
		// Utilizamos un bucle for para actualizar el progreso en el rango especificado
		for (int i = inicio; i < fin; i++) {
			try {
				// Hacemos que el hilo duerma durante 100 milisegundos para simular el tiempo
				// que tarda en actualizar el progreso
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Incrementamos el progreso en 1 utilizando el método incrementAndGet del
			// AtomicInteger y luego llamamos al método privado imprimirProgreso para
			// imprimir el progreso actual de la barra
			progreso.incrementAndGet();
			imprimirProgreso();
		}
	}

	// Definimos un método privado imprimirProgreso que imprime el progreso actual
	// de la barra en la consola
	private void imprimirProgreso() {
		// Utilizamos un StringBuilder para construir una cadena que representa la barra
		// de carga
		StringBuilder sb = new StringBuilder();
		sb.append("\r[");
		int p = progreso.get() * tamanio / 100;
		for (int i = 0; i < tamanio; i++) {
			if (i < p) {
				sb.append("=");
			} else if (i == p) {
				sb.append(">");
			} else {
				sb.append(" ");
			}
		}
		sb.append("] ");
		sb.append(progreso.get());
		sb.append("%");
		// Imprimimos la cadena utilizando System.out.print para sobrescribir la línea
		// anterior en la consola
		System.out.print(sb.toString());
	}
}

//Definimos la clase TareaActualizarBarra que implementa la interfaz Runnable para poder ejecutarse en un hilo separado
class TareaActualizarBarra implements Runnable {
	private BarraDeCarga barraDeCarga;
	private int inicio;
	private int fin;

	// Definimos el constructor de la clase TareaActualizarBarra que recibe como
	// argumentos una referencia a la barra de carga y el rango que debe actualizar
	public TareaActualizarBarra(BarraDeCarga barraDeCarga, int inicio, int fin) {
		this.barraDeCarga = barraDeCarga;
		this.inicio = inicio;
		this.fin = fin;
	}

	// Definimos el método run que se ejecuta cuando se inicia el hilo
	@Override
	public void run() {
		// Llamamos al método actualizar de la barra de carga para actualizar el
		// progreso en el rango especificado
		barraDeCarga.actualizar(inicio, fin);
	}
}
/*
 * Este programa crea una BarraDeCarga con un tamaño de 50 y un pool de hilos
 * con 5 hilos. Luego, crea y ejecuta 5 tareas para actualizar la barra de
 * carga. Cada tarea es responsable de actualizar una parte de la barra de
 * carga. La clase BarraDeCarga utiliza un AtomicInteger para mantener el
 * progreso actual de la barra y garantizar que no se generen condiciones de
 * carrera al actualizar el progreso.
 */
