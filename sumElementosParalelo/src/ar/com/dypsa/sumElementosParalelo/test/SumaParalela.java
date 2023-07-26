package ar.com.dypsa.sumElementosParalelo.test;

import java.util.concurrent.*;

public class SumaParalela {
	public static void main(String[] args) throws Exception {
		// Define el arreglo de elementos y el n�mero de hilos
		int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numHilos = 2;

		// Crea un objeto ExecutorService con un tama�o fijo igual al n�mero de hilos
		ExecutorService executor = Executors.newFixedThreadPool(numHilos);

		// Calcula el tama�o de cada parte del arreglo dividiendo su longitud entre el
		// n�mero de hilos
		int tamanoParte = (int) Math.ceil(arreglo.length / (double) numHilos);

		// Crea un arreglo de objetos Future para almacenar los resultados parciales
		@SuppressWarnings("unchecked")
		Future<Integer>[] resultados = new Future[numHilos];

		// Utiliza un bucle para dividir el arreglo en partes y asignar hilos separados
		// para sumar cada parte
		for (int i = 0; i < numHilos; i++) {
			// Calcula el �ndice de inicio y fin de la parte
			int inicio = i * tamanoParte;
			int fin = Math.min(inicio + tamanoParte, arreglo.length);

			// Env�a una tarea al ExecutorService utilizando el m�todo submit
			resultados[i] = executor.submit(new SumaParcial(arreglo, inicio, fin));
		}

		// Crea una variable para almacenar la suma total e inicial�zala en cero
		int sumaTotal = 0;

		// Utiliza un bucle para recorrer el arreglo de objetos Future y sumar los
		// resultados parciales a la suma total
		for (Future<Integer> resultado : resultados) {
			sumaTotal += resultado.get();
		}

		// Imprime la suma total
		System.out.println("Suma total: " + sumaTotal);

		// Cierra el ExecutorService utilizando el m�todo shutdown
		executor.shutdown();
	}
	/*
	 * Para crear el c�digo anterior que calcula la suma de elementos en un arreglo
	 * en paralelo en Java, pasos: 0. crear "ar.com.dypsa.sumElementosParalelo.test"
	 * paquete 1. Define el arreglo de elementos y el n�mero de hilos que deseas
	 * utilizar. 2. Crea un objeto `ExecutorService` con un tama�o fijo igual al
	 * n�mero de hilos. 3. Calcula el tama�o de cada parte del arreglo dividiendo su
	 * longitud entre el n�mero de hilos. 4. Crea un arreglo de objetos `Future`
	 * para almacenar los resultados parciales. 5. Utiliza un bucle para dividir el
	 * arreglo en partes y asignar hilos separados para sumar cada parte. Para cada
	 * parte, calcula el �ndice de inicio y fin, y env�a una tarea al
	 * `ExecutorService` utilizando el m�todo `submit`, pasando un objeto
	 * `SumaParcial` con los par�metros adecuados. 6. Crea una variable para
	 * almacenar la suma total e inicial�zala en cero. 7. Utiliza un bucle para
	 * recorrer el arreglo de objetos `Future` y sumar los resultados parciales a la
	 * suma total utilizando el m�todo `get`. 8. Imprime la suma total. 9. Cierra el
	 * `ExecutorService` utilizando el m�todo `shutdown`.
	 * 
	 */
}

/*
 * 
 * Tambi�n necesitar�s definir la clase `SumaParcial` que implementa la interfaz
 * `Callable<Integer>`. Esta clase debe tener un constructor que reciba como
 * par�metros el arreglo, el �ndice de inicio y el �ndice de fin de la parte a
 * sumar. Tambi�n debe implementar el m�todo `call`, que calcula y devuelve la
 * suma parcial de los elementos en la parte especificada del arreglo.
 * 
 */
// Define la clase SumaParcial que implementa la interfaz Callable<Integer>
class SumaParcial implements Callable<Integer> {
	private int[] arreglo;
	private int inicio;
	private int fin;

	// Constructor que recibe como par�metros el arreglo, el �ndice de inicio y el
	// �ndice de fin de la parte a sumar
	public SumaParcial(int[] arreglo, int inicio, int fin) {
		this.arreglo = arreglo;
		this.inicio = inicio;
		this.fin = fin;
	}

	// Implementa el m�todo call que calcula y devuelve la suma parcial de los
	// elementos en la parte especificada del arreglo
	@Override
	public Integer call() throws Exception {
		int sumaParcial = 0;
		for (int i = inicio; i < fin; i++) {
			sumaParcial += arreglo[i];
		}
		return sumaParcial;
	}
	/*en resumen:
	 * Este c�digo divide el arreglo en partes y asigna hilos separados para sumar
	 * cada parte utilizando la clase ExecutorService. Luego, combina los resultados
	 * parciales para obtener la suma total.
	 */
}
