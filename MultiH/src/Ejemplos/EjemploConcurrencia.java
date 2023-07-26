package Ejemplos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * La concurrencia en Java se refiere a la capacidad de ejecutar m�ltiples
 * tareas en paralelo, ya sea mediante el uso de m�ltiples hilos dentro de un
 * mismo programa o mediante la distribuci�n de tareas entre m�ltiples
 * procesadores o n�cleos.
 * 
 * 
 * Aqu� tienes un ejemplo sencillo de c�mo utilizar la concurrencia en Java para
 * ejecutar m�ltiples tareas en paralelo:
 * 
 */

public class EjemploConcurrencia {
	public static void main(String[] args) {
		// Crear un ExecutorService con un pool de hilos fijo
		ExecutorService executor = Executors.newFixedThreadPool(2);

		// Enviar tareas para ejecutar en paralelo
		executor.execute(new Tarea(1));
		executor.execute(new Tarea(2));

		// Finalizar el ExecutorService
		executor.shutdown();
	}
}

class Tarea implements Runnable {

	private int id;

	public Tarea(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// C�digo que se ejecutar� en el hilo
		for (int i = 0; i < 5; i++) {
			System.out.println("Tarea " + id + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



/*
 * En este ejemplo, se utiliza un ExecutorService para ejecutar m�ltiples tareas
 * en paralelo. La clase Tarea implementa la interfaz Runnable y sobrescribe el
 * m�todo run() para definir el c�digo que se ejecutar� en cada tarea. En el
 * m�todo main, se crea un ExecutorService con un pool de hilos fijo de tama�o 2
 * y se env�an dos tareas para ejecutar en paralelo. Cuando se ejecuta el
 * programa, cada tarea imprimir� su ID y un contador en la consola. Al final,
 * se finaliza el ExecutorService.
 */
