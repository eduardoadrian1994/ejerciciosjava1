
package Ejemplos;
/*
 * Un hilo (Thread) en Java es una unidad de ejecuci�n independiente dentro de
 * un programa que puede ejecutar c�digo en paralelo con otros hilos.
 * 
 * 
 * Los hilos en Java permiten ejecutar m�ltiples tareas en paralelo dentro de un
 * mismo programa. Un hilo es una unidad de ejecuci�n independiente que tiene su
 * propia pila de llamadas y puede ejecutar c�digo en paralelo con otros hilos.
 * Para crear un hilo en Java, se puede extender la clase Thread y sobrescribir
 * el m�todo run() para definir el c�digo que se ejecutar� en el hilo, o se
 * puede implementar la interfaz Runnable y pasar un objeto Runnable al
 * constructor de la clase Thread. Una vez creado el hilo, se puede iniciar
 * llamando al m�todo start() del objeto Thread. Tambi�n es posible utilizar el
 * framework de ejecuci�n de tareas Executor para gestionar la creaci�n y
 * ejecuci�n de hilos de manera m�s eficiente.
 * 
 * un ejemplo sencillo de c�mo crear y ejecutar hilos en Java:
 */
public class EjemploHilos {
	public static void main(String[] args) {
		// Crear un objeto Runnable
		MiRunnable miRunnable = new MiRunnable();

		// Crear un hilo y pasarle el objeto Runnable
		Thread hilo = new Thread(miRunnable);

		// Iniciar el hilo
		hilo.start();

		// Ejecutar c�digo en el hilo principal
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
		// C�digo que se ejecutar� en el hilo
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

