package main;

import java.util.Scanner;

public class MatricesCargaMain {

	public static void main(String[] args) {
		
		//Declaración
		
		int matriz [][] = new int[3][3];
		
		Scanner teclado = new Scanner(System.in);
		
		//asginación (manual)
		
		for (int fil = 0; fil < 3; fil++) {
			for (int col=0; col<3; col++) {
				System.out.println("ingrese el valor de la  posicion fila: " + fil + " columna " + col);
				matriz[fil][col]= teclado.nextInt();
			}
		
		}
		
		teclado.close();
		
		//Recorrido
		
		for (int fil = 0; fil < 3; fil++) {
			for (int col=0; col<3; col++) {
				System.out.println("El valor de la  posicion fila: " + fil + " columna " + col);
				System.out.println("es de: " + matriz[fil][col]);
			}
		}	

	}
}
