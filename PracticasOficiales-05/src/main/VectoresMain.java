package main;

import java.util.Scanner;

//Realizar un programa  que  permita cargar 10 números en un vector.Una vez cargados,
//se necesita que el programa cuente e informe por pantalla cuántas veces se cargo el número 3

public class VectoresMain {

	public static void main(String[] args) {
		
		//creacion de mi vector
		int vector[] = new int [10];
		
		Scanner teclado = new Scanner(System.in);
		
		//Cargar nuestro vector
		
		for (int i = 0; i <10; i++) {
			System.out.println("Ingrese un numero para el vector");
			vector[i] = teclado.nextInt();
			
		}
		
		//recorrer y contar cuántos numeros 3 hay
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			if(vector[i] == 3) {
				cont = cont +1;
			}
			
		}
		teclado.close();
		System.out.println("la cantidad de  número 3  que hay en el vector : " + cont);

	}

}
