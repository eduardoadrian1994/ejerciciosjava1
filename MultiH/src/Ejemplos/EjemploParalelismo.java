package Ejemplos;

import java.util.ArrayList;
import java.util.List;

/*
 * El paralelismo en Java se refiere a la capacidad de ejecutar múltiples tareas
 * simultáneamente en diferentes procesadores o núcleos para mejorar el
 * rendimiento de un programa. Aquí tienes un ejemplo sencillo de cómo utilizar
 * paralelismo:
 */

public class EjemploParalelismo {
	public static void main(String[] args) {
		// Crear una lista de números
		List<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			numeros.add(i);
		}

		// Calcular la suma de los números utilizando un stream secuencial
		long inicio = System.currentTimeMillis();
		int sumaSecuencial = numeros.stream().reduce(0, Integer::sum);
		long fin = System.currentTimeMillis();
		System.out.println("Suma secuencial: " + sumaSecuencial + " (tiempo: " + (fin - inicio) + " ms)");

		// Calcular la suma de los números utilizando un stream paralelo
		inicio = System.currentTimeMillis();
		int sumaParalela = numeros.parallelStream().reduce(0, Integer::sum);
		fin = System.currentTimeMillis();
		System.out.println("Suma paralela: " + sumaParalela + " (tiempo: " + (fin - inicio) + " ms)");
	}
}

/*
 * En este ejemplo, se utiliza un Stream paralelo para calcular la suma de una
 * lista de números en paralelo. Primero, se crea una lista de números y se
 * calcula la suma utilizando un Stream secuencial. Luego, se calcula la suma
 * utilizando un Stream paralelo y se comparan los tiempos de ejecución. Cuando
 * se ejecuta el programa en una máquina con múltiples núcleos, el cálculo
 * utilizando el Stream paralelo debería ser más rápido que el cálculo
 * utilizando el Stream secuencial. Un Stream en Java es una secuencia de
 * elementos que se pueden procesar de manera declarativa para realizar
 * operaciones como filtrado, mapeo, reducción, entre otras. Un Stream no
 * almacena datos, sino que opera sobre una fuente de datos, como una colección
 * o un arreglo, para producir un resultado. Los Streams pueden ser secuenciales
 * o paralelos, y se pueden crear a partir de diferentes fuentes de datos
 * utilizando métodos como stream() o parallelStream() en colecciones, o
 * utilizando métodos estáticos en la clase Stream, como of() o iterate()
 * 
 * 
 */