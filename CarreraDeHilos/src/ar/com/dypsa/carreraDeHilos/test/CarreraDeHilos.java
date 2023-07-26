package ar.com.dypsa.carreraDeHilos.test;

/*Esta línea importa las clases necesarias del paquete java.util.concurrent para utilizar mecanismos de sincronización y ejecución de hilos.*/
import java.util.concurrent.*;

/*Se define una clase pública llamada CarreraDeHilos.*/
public class CarreraDeHilos {
	/*
	 * Se define el método principal main que es el punto de entrada del programa.
	 */
	public static void main(String[] args) {
		/*
		 * Se define una variable entera numCorredores y se le asigna el valor 5. Esta
		 * variable representa el número de corredores en la carrera.
		 */
		int numCorredores = 5;
		/*
		 * Se crea una instancia de CyclicBarrier llamada barrera y se le pasa como
		 * argumento el número de corredores. Esta barrera se utilizará para asegurarse
		 * de que todos los corredores comiencen al mismo tiempo.
		 */
		CyclicBarrier barrera = new CyclicBarrier(numCorredores);
		/*
		 * Se crea un ExecutorService llamado executor utilizando el método estático
		 * newFixedThreadPool de la clase Executors. Se le pasa como argumento el número
		 * de corredores. Este ExecutorService se utilizará para ejecutar los hilos que
		 * representan a los corredores.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(numCorredores);
		/*
		 * Se utiliza un bucle for para crear y ejecutar los hilos que representan a los
		 * corredores. En cada iteración del bucle, se crea una instancia de la clase
		 * Corredor pasándole como argumentos el índice del bucle (que representa el id
		 * del corredor) y la barrera creada anteriormente. Luego, se utiliza el método
		 * execute del ExecutorService para ejecutar el hilo que representa al corredor.
		 */
		for (int i = 0; i < numCorredores; i++) {
			Corredor corredor = new Corredor(i, barrera);
			executor.execute(corredor);
		}
		/*
		 * Después del bucle, se llama al método shutdown del ExecutorService para
		 * indicar que no se aceptarán más tareas y que debe terminar su ejecución una
		 * vez que todas las tareas en curso hayan terminado. Luego, se cierra el método
		 * main y la clase CarreraDeHilos.
		 */
		executor.shutdown();
	}
}

/*
 * Se define una clase llamada Corredor que implementa la interfaz Runnable.
 * Esta clase representa a un corredor en la carrera
 */

class Corredor implements Runnable {
	/*
	 * Se definen dos variables privadas: un entero llamado id que representa el id
	 * del corredor y una instancia de CyclicBarrier llamada barrera que representa
	 * la barrera que deben esperar los corredores antes de comenzar a correr.
	 */
	private int id;
	private CyclicBarrier barrera;

	/*
	 * Se define un constructor público para la clase Corredor que toma como
	 * argumentos un entero que representa el id del corredor y una instancia de
	 * CyclicBarrier. Dentro del constructor, se asignan los valores de los
	 * argumentos a las variables de instancia correspondientes utilizando la
	 * palabra clave this.
	 */
	public Corredor(int id, CyclicBarrier barrera) {
		this.id = id;
		this.barrera = barrera;
	}

	/*
	 * Se sobrescribe el método run de la interfaz Runnable. Este método se
	 * ejecutará cuando se ejecute el hilo que representa al corredor.
	 */
	@Override
	public void run() {
		/*
		 * Dentro del método run, se utiliza un bloque try-catch para manejar posibles
		 * excepciones. Dentro del bloque try, primero se imprime un mensaje indicando
		 * que el corredor está listo. Luego, se llama al método await de la barrera
		 * para indicar que el corredor ha llegado a la barrera y debe esperar a que
		 * todos los demás corredores lleguen antes de continuar. Después de que todos
		 * los corredores hayan llegado a la barrera, se imprime un mensaje indicando
		 * que el corredor ha comenzado a correr. Luego, se utiliza el método estático
		 * sleep de la clase Thread para simular el tiempo que tarda el corredor en
		 * llegar a la meta. El tiempo se genera aleatoriamente utilizando el método
		 * estático random de la clase Math. Finalmente, se imprime un mensaje indicando
		 * que el corredor ha llegado a la meta.
		 * 
		 * Dentro del bloque catch, se capturan las posibles excepciones
		 * InterruptedException y BrokenBarrierException y se utiliza el método
		 * printStackTrace para imprimir información sobre la excepción.
		 */

		try {
			System.out.println("Corredor " + id + " está listo.");
			barrera.await();
			System.out.println("Corredor " + id + " ha comenzado a correr.");
			Thread.sleep((long) (Math.random() * 10000));
			System.out.println("Corredor " + id + " ha llegado a la meta.");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
/*
 * 
 * Este código crea una carrera con 5 corredores representados por hilos.
 * Utiliza una CyclicBarrier para asegurarse de que todos los corredores
 * comiencen al mismo tiempo. Cada corredor espera en la barrera hasta que todos
 * estén listos y luego comienzan a correr. El tiempo que tarda cada corredor en
 * llegar a la meta se simula con un Thread.sleep() aleatorio.
 * 
 */