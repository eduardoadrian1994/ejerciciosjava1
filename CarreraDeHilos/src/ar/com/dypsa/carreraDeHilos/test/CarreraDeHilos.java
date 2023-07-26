package ar.com.dypsa.carreraDeHilos.test;

/*Esta l�nea importa las clases necesarias del paquete java.util.concurrent para utilizar mecanismos de sincronizaci�n y ejecuci�n de hilos.*/
import java.util.concurrent.*;

/*Se define una clase p�blica llamada CarreraDeHilos.*/
public class CarreraDeHilos {
	/*
	 * Se define el m�todo principal main que es el punto de entrada del programa.
	 */
	public static void main(String[] args) {
		/*
		 * Se define una variable entera numCorredores y se le asigna el valor 5. Esta
		 * variable representa el n�mero de corredores en la carrera.
		 */
		int numCorredores = 5;
		/*
		 * Se crea una instancia de CyclicBarrier llamada barrera y se le pasa como
		 * argumento el n�mero de corredores. Esta barrera se utilizar� para asegurarse
		 * de que todos los corredores comiencen al mismo tiempo.
		 */
		CyclicBarrier barrera = new CyclicBarrier(numCorredores);
		/*
		 * Se crea un ExecutorService llamado executor utilizando el m�todo est�tico
		 * newFixedThreadPool de la clase Executors. Se le pasa como argumento el n�mero
		 * de corredores. Este ExecutorService se utilizar� para ejecutar los hilos que
		 * representan a los corredores.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(numCorredores);
		/*
		 * Se utiliza un bucle for para crear y ejecutar los hilos que representan a los
		 * corredores. En cada iteraci�n del bucle, se crea una instancia de la clase
		 * Corredor pas�ndole como argumentos el �ndice del bucle (que representa el id
		 * del corredor) y la barrera creada anteriormente. Luego, se utiliza el m�todo
		 * execute del ExecutorService para ejecutar el hilo que representa al corredor.
		 */
		for (int i = 0; i < numCorredores; i++) {
			Corredor corredor = new Corredor(i, barrera);
			executor.execute(corredor);
		}
		/*
		 * Despu�s del bucle, se llama al m�todo shutdown del ExecutorService para
		 * indicar que no se aceptar�n m�s tareas y que debe terminar su ejecuci�n una
		 * vez que todas las tareas en curso hayan terminado. Luego, se cierra el m�todo
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
	 * Se define un constructor p�blico para la clase Corredor que toma como
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
	 * Se sobrescribe el m�todo run de la interfaz Runnable. Este m�todo se
	 * ejecutar� cuando se ejecute el hilo que representa al corredor.
	 */
	@Override
	public void run() {
		/*
		 * Dentro del m�todo run, se utiliza un bloque try-catch para manejar posibles
		 * excepciones. Dentro del bloque try, primero se imprime un mensaje indicando
		 * que el corredor est� listo. Luego, se llama al m�todo await de la barrera
		 * para indicar que el corredor ha llegado a la barrera y debe esperar a que
		 * todos los dem�s corredores lleguen antes de continuar. Despu�s de que todos
		 * los corredores hayan llegado a la barrera, se imprime un mensaje indicando
		 * que el corredor ha comenzado a correr. Luego, se utiliza el m�todo est�tico
		 * sleep de la clase Thread para simular el tiempo que tarda el corredor en
		 * llegar a la meta. El tiempo se genera aleatoriamente utilizando el m�todo
		 * est�tico random de la clase Math. Finalmente, se imprime un mensaje indicando
		 * que el corredor ha llegado a la meta.
		 * 
		 * Dentro del bloque catch, se capturan las posibles excepciones
		 * InterruptedException y BrokenBarrierException y se utiliza el m�todo
		 * printStackTrace para imprimir informaci�n sobre la excepci�n.
		 */

		try {
			System.out.println("Corredor " + id + " est� listo.");
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
 * Este c�digo crea una carrera con 5 corredores representados por hilos.
 * Utiliza una CyclicBarrier para asegurarse de que todos los corredores
 * comiencen al mismo tiempo. Cada corredor espera en la barrera hasta que todos
 * est�n listos y luego comienzan a correr. El tiempo que tarda cada corredor en
 * llegar a la meta se simula con un Thread.sleep() aleatorio.
 * 
 */