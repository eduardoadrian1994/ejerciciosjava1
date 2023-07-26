package main;

import java.util.Scanner;

public class VectoresRecorridoMain {

	public static void main(String[] args) {
		//Declaración de vectores
		int vector [] = new int [4];
		
		
		//Asignacion por teclado
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<vector.length; i++) {
			System.out.println("ingrese el valor para el indice " + i);
			vector[i]=teclado.nextInt();
		}
		
		//recorrido de mi Vector
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Estoy en el índice :" + i);
			System.out.println("Tengo guardado un " + vector[i]);
			System.out.println("--------------------");
		}
		teclado.close();
	}

}
