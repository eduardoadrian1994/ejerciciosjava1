package Main;

import entidades.matricesI;

import entidades.matricesImpl;

public class MatricesPantalla {

	public static void main(String[] args) {
		
		
		int Matriz [][] = new int[3][3];
        
		matricesI  matricesImpl = new  matricesImpl();
		
		
		matricesImpl.sumarMatrices(Matriz);
		matricesImpl.multiplicarMatrices(Matriz);
		matricesImpl.transpuestaMatrices(Matriz);
		int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		matricesImpl.calcularDeterminante(matriz);
		matricesImpl.simátricaMatriz(Matriz);
		matricesImpl.diagonalMatriz(Matriz);
	}
}