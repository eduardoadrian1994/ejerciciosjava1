package ar.com.dypsa.calculoDeNumerosPrimos.test;

//Importamos las clases necesarias para utilizar un pool de hilos y una lista
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Definimos la clase principal CalculoDeNumerosPrimos
public class CalculoDeNumerosPrimos {
	// Definimos el método principal
	public static void main(String[] args) {
		// Creamos una lista para almacenar los resultados
		List<Integer> numerosPrimos = new ArrayList<>();
		// Creamos un pool de hilos con 5 hilos utilizando el método newFixedThreadPool
		// de la clase Executors
		ExecutorService executor = Executors.newFixedThreadPool(5);
		// Creamos y ejecutamos 5 tareas para verificar si los números en el rango son
		// primos utilizando el método execute del pool de hilos
		for (int i = 0; i < 5; i++) {
			executor.execute(new TareaVerificarPrimalidad(numerosPrimos, i * 10, (i + 1) * 10));
		}
		// Apagamos el pool de hilos utilizando el método shutdown y esperamos a que
		// todas las tareas se completen utilizando el método awaitTermination
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Imprimimos los resultados utilizando System.out.println
		System.out.println("Números primos en el rango: " + numerosPrimos);
	}
}

//Definimos la clase TareaVerificarPrimalidad que implementa la interfaz Runnable para poder ejecutarse en un hilo separado
class TareaVerificarPrimalidad implements Runnable {
	private List<Integer> numerosPrimos;
	private int inicio;
	private int fin;

	// Definimos el constructor de la clase TareaVerificarPrimalidad que recibe como
	// argumentos una referencia a la lista de resultados y el rango que debe
	// verificar
	public TareaVerificarPrimalidad(List<Integer> numerosPrimos, int inicio, int fin) {
		this.numerosPrimos = numerosPrimos;
		this.inicio = inicio;
		this.fin = fin;
	}

	// Definimos el método run que se ejecuta cuando se inicia el hilo
	@Override
	public void run() {
		// Utilizamos un bucle for para verificar si cada número en el rango es primo
		// utilizando el método privado esPrimo
		for (int i = inicio; i < fin; i++) {
			if (esPrimo(i)) {
				// Si un número es primo, lo agregamos a la lista de resultados utilizando una
				// sección sincronizada para evitar condiciones de carrera
				synchronized (numerosPrimos) {
					numerosPrimos.add(i);
				}
			}
		}
	}

	// Definimos un método privado esPrimo que verifica si un número es primo o no
	private boolean esPrimo(int n) { // Define una función llamada esPrimo que toma un entero n como argumento y devuelve un valor booleano
	    if (n <= 1) // Si n es menor o igual a 1
	        return false; // Devuelve falso, ya que 1 no es un número primo
	    for (int i = 2; i <= Math.sqrt(n); i++) { // Itera desde 2 hasta la raíz cuadrada de n
	        if (n % i == 0) // Si n es divisible por i
	            return false; // Devuelve falso, ya que n no es un número primo
	    }
	    return true; // Si el bucle for termina sin encontrar un divisor, devuelve verdadero, ya que n es un número primo
	}
}

/*
 * Este programa crea una lista para almacenar los resultados y un pool de hilos
 * con 5 hilos. Luego, crea y ejecuta 5 tareas para verificar si los números en
 * el rango son primos utilizando el método execute del pool de hilos. Cada
 * tarea es responsable de verificar la primalidad de una parte del rango. La
 * clase TareaVerificarPrimalidad tiene un método run que utiliza un bucle para
 * verificar si cada número en el rango es primo utilizando el método privado
 * esPrimo. Si un número es primo, se agrega a la lista de resultados utilizando
 * una sección sincronizada para evitar condiciones de carrera. Finalmente, el
 * programa apaga el pool de hilos utilizando el método shutdown y espera a que
 * todas las tareas se completen utilizando el método awaitTermination. Luego,
 * imprime los resultados.
 */