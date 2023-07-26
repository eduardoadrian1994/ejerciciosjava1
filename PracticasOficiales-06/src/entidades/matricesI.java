package entidades;

public interface matricesI {
	
	void  sumarMatrices(int [][] matriz);
	void  multiplicarMatrices(int [][] matriz);
	void  transpuestaMatrices(int[][]matriz);
	int calcularDeterminante(int[][]matriz);
	void  diagonalMatriz(int[][]matriz);
	void  simátricaMatriz(int[][]matriz);
}
