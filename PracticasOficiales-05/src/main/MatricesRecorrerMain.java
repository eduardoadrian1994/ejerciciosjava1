package main;

public class MatricesRecorrerMain {

	public static void main(String[] args) {
		
		//Declaración
		
		int matriz [][] = new int[3][3];
		
		//asginación (manual)
		
		matriz [0][0] = 5;
		matriz [0][1] = 13;
		matriz [0][2] = 96;
		matriz [1][0] = 35;
		matriz [1][1] = 33;
		matriz [1][2] = 71;
		matriz [2][0] = 446;
		matriz [2][1] = 228;
		matriz [2][2] = 24;
		
		
		//Recorrido
		
		for (int fil = 0; fil < 3; fil++) {
			for (int col=0; col<3; col++) {
				System.out.println("El valor de la  posicion fila: " + fil + "columna" + col);
				System.out.println("es de: " + matriz[fil][col]);
			}
		}	

	}

}
