package Ejemplos;

import java.util.ArrayList;
import java.util.List;

/*
 * El paralelismo en Java se refiere a la capacidad de ejecutar m�ltiples tareas
 * simult�neamente en diferentes procesadores o n�cleos para mejorar el
 * rendimiento de un programa. Aqu� tienes un ejemplo sencillo de c�mo utilizar
 * paralelismo:
 */

public class EjemploParalelismo {
	public static void main(String[] args) {
		// Crear una lista de n�meros
		List<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			numeros.add(i);
		}

		// Calcular la suma de los n�meros utilizando un stream secuencial
		long inicio = System.currentTimeMillis();
		int sumaSecuencial = numeros.stream().reduce(0, Integer::sum);
		long fin = System.currentTimeMillis();
		System.out.println("Suma secuencial: " + sumaSecuencial + " (tiempo: " + (fin - inicio) + " ms)");

		// Calcular la suma de los n�meros utilizando un stream paralelo
		inicio = System.currentTimeMillis();
		int sumaParalela = numeros.parallelStream().reduce(0, Integer::sum);
		fin = System.currentTimeMillis();
		System.out.println("Suma paralela: " + sumaParalela + " (tiempo: " + (fin - inicio) + " ms)");
	}
}

/*
 * En este ejemplo, se utiliza un Stream paralelo para calcular la suma de una
 * lista de n�meros en paralelo. Primero, se crea una lista de n�meros y se
 * calcula la suma utilizando un Stream secuencial. Luego, se calcula la suma
 * utilizando un Stream paralelo y se comparan los tiempos de ejecuci�n. Cuando
 * se ejecuta el programa en una m�quina con m�ltiples n�cleos, el c�lculo
 * utilizando el Stream paralelo deber�a ser m�s r�pido que el c�lculo
 * utilizando el Stream secuencial. Un Stream en Java es una secuencia de
 * elementos que se pueden procesar de manera declarativa para realizar
 * operaciones como filtrado, mapeo, reducci�n, entre otras. Un Stream no
 * almacena datos, sino que opera sobre una fuente de datos, como una colecci�n
 * o un arreglo, para producir un resultado. Los Streams pueden ser secuenciales
 * o paralelos, y se pueden crear a partir de diferentes fuentes de datos
 * utilizando m�todos como stream() o parallelStream() en colecciones, o
 * utilizando m�todos est�ticos en la clase Stream, como of() o iterate()
 * 
 * 
 */