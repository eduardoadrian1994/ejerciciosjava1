package entidades;

import entidades.VectorI;

public class VectorSumarImpl implements VectorI {

	@Override
	public void sumarVector(int[] sumar) {
		for (int i = 0; i < sumar.length; i++) {
			System.out.println("Tengo guardado un " + sumar[i] + sumar[i]);
			System.out.println("--------------------");
		}
		
	}

	
	
	
}
