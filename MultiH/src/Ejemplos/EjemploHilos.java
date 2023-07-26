
package Ejemplos;
/*
 * Un hilo (Thread) en Java es una unidad de ejecución independiente dentro de
 * un programa que puede ejecutar código en paralelo con otros hilos.
 * 
 * 
 * Los hilos en Java permiten ejecutar múltiples tareas en paralelo dentro de un
 * mismo programa. Un hilo es una unidad de ejecución independiente que tiene su
 * propia pila de llamadas y puede ejecutar código en paralelo con otros hilos.
 * Para crear un hilo en Java, se puede extender la clase Thread y sobrescribir
 * el método run() para definir el código que se ejecutará en el hilo, o se
 * puede implementar la interfaz Runnable y pasar un objeto Runnable al
 * constructor de la clase Thread. Una vez creado el hilo, se puede iniciar
 * llamando al método start() del objeto Thread. También es posible utilizar el
 * framework de ejecución de tareas Executor para gestionar la creación y
 * ejecución de hilos de manera más eficiente.
 * 
 * un ejemplo sencillo de cómo crear y ejecutar hilos en Java:
 */
public class EjemploHilos {
	public static void main(String[] args) {
		// Crear un objeto Runnable
		MiRunnable miRunnable = new MiRunnable();

		// Crear un hilo y pasarle el objeto Runnable
		Thread hilo = new Thread(miRunnable);

		// Iniciar el hilo
		hilo.start();

		// Ejecutar código en el hilo principal
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo principal: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MiRunnable implements Runnable {
	@Override
	public void run() {
		// Código que se ejecutará en el hilo
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo secundario: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

