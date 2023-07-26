package Ejemplos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * La concurrencia en Java se refiere a la capacidad de ejecutar múltiples
 * tareas en paralelo, ya sea mediante el uso de múltiples hilos dentro de un
 * mismo programa o mediante la distribución de tareas entre múltiples
 * procesadores o núcleos.
 * 
 * 
 * Aquí tienes un ejemplo sencillo de cómo utilizar la concurrencia en Java para
 * ejecutar múltiples tareas en paralelo:
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
		// Código que se ejecutará en el hilo
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
 * En este ejemplo, se utiliza un ExecutorService para ejecutar múltiples tareas
 * en paralelo. La clase Tarea implementa la interfaz Runnable y sobrescribe el
 * método run() para definir el código que se ejecutará en cada tarea. En el
 * método main, se crea un ExecutorService con un pool de hilos fijo de tamaño 2
 * y se envían dos tareas para ejecutar en paralelo. Cuando se ejecuta el
 * programa, cada tarea imprimirá su ID y un contador en la consola. Al final,
 * se finaliza el ExecutorService.
 */
