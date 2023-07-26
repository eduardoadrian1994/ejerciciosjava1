package entidades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entidades.VectorI;

public class VectorImpl implements VectorI {

	@Override
	public void mayorVector(int[] vector) {
		int mayor;
		mayor = vector[0]; 
		for (int i = 0; i < vector.length; i++) {
			
			if(vector[i]>mayor){
				mayor = vector[i];
			}
			System.out.println("el mayor :" + mayor);
			System.out.println("--------------------");
		}
		
	}

	@Override
	public int sumarVector(int[] vector) {
		int sum = 0;
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Estoy en el índice :" + i);
			System.out.println("Tengo guardado un " + vector[i]);
			sum = sum + vector[i];
			
			System.out.println("--------------------");
		}
		System.out.println("la suma es : " + sum);
		return sum;
	}

	@Override
	public void ordernarVector(int[] vector) {
		Arrays.sort(vector);
		for (int num : vector) {
		    System.out.print(num + " ");
		}
		
	}

	@Override
	public void eliminarDuplicadosVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			
			for (int j = 0; j < vector.length; j++) {
				
				if(i !=j ) {
					if(vector[i]==(vector[j])) {
						
						vector[j]=' ';
						
					}
				}
			}
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.println("\n--------------------");
			System.out.println("[" + vector[i] + "]");
			
		}
		
	}

	@Override
	public void BuscarElementoVector(int[] vector) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		int n = teclado.nextInt();
		
		int pos = -1;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]==n) {
				pos=i;
			}
		}
		if (pos == -1) {
			
			System.out.println("No se encontró el número");
			
		}else {
			System.out.println("La posición de " + n +" es " + pos);
		}
		teclado.close();
		
	}

	@Override
	public void CalcularPromedioVector(int[] vector, int sumaTotal) {
		
		float promedio = sumaTotal / vector.length;
		int resultado = Math.round(promedio);
		System.out.printf("Suma: %d. Promedio: %d ", sumaTotal, resultado);
		System.out.println("\n--------------------");
	
	}

	@Override
	public void ContarOcurrenciasVector(int[] vector) {
		Map<Integer, Integer> conteo = new HashMap<>();
		
		for (int n : vector) {
			if (conteo.containsKey(n)) {
				conteo.put(n, conteo.get(n)+1);
			}else {
				conteo.put(n,1);
			}
		}	
		
		for (Map.Entry<Integer, Integer>ocurrencia : conteo.entrySet()) {
			System.out.println("--------------------");
			System.out.printf("%d ---> %d%n", ocurrencia.getKey(), ocurrencia.getValue());
			System.out.println("--------------------");
			
		}
		
	}

	@Override
	public void ComprobarOrdenVector(int[] vector) {
		boolean ordenado = true;
		int aux = vector[0];
		for (int i = 0; i < vector.length; i++) {

			while (ordenado && i < vector.length - 1) {
				i++;
				if (aux < vector[i]) {
					ordenado = false;
	 
				}
				aux = vector[i];
	 
			}
	 
			if (ordenado) {
				System.out.println("--------------------");
				System.out.println("La lista NO está ORDENADA DE MAYOR A MENOR : " + vector[i]);
				System.out.println("--------------------");
	 
			}else {
				System.out.println("--------------------");
				System.out.println("La lista está ORDENADA DE MAYOR A MENOR :" + vector[i]);
				System.out.println("--------------------");
	 
			}
		}
		
	}

	@Override
	public void RotarElementosVector(int[] vector) {
		int primero = vector[0];
		for (int i = 0; i < vector.length-1; i++) {
			
				primero=vector[i+1];
				vector[i+1]=vector[0];
				vector[0]=primero;
			
		} for(int i=0;i<vector.length;i++){
			   System.out.println("--------------------------------------");
		       System.out.println("elemntos rotados : " + vector[i]);
		       System.out.println("--------------------------------------");
		   }
		
	}

	@Override
	public void Combinarvectores(int[] vector ) {
		
		int[] vector1 = {32, 13, 64, 18, 87, 90, 34};
		
		int longitudTotal = vector.length + vector.length;
	    
		
		int[] combinado = new int[longitudTotal];
		
		int index = 0;
		int  j = 0;
		int  i = 0;
		while(i<vector.length && j < vector1.length ){
			combinado[index++] = vector[i++];
			combinado[index++] = vector1[j++];
		}
		while( i < vector.length ) {
			combinado[index++] = vector[i++];
			
		}
		while(j < vector.length) {
			combinado[index++] = vector1[j++];
		}
		System.out.println("Vector: " + Arrays.toString(vector));
        System.out.println("Vector 1: " + Arrays.toString(vector1));
        System.out.println("combinado: " + Arrays.toString(combinado));
	}
	

}
