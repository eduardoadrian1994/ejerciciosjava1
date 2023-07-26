package main;

import entidades.VectorI;

import entidades.VectorImpl;



public class VectoresPantalla {

	public static void main(String[] args) {
		
		int[] vector = {5, 10, 2, 8, 15, 1, 5};
				
		
		VectorI vectorImpl = new VectorImpl();
		
		
		vectorImpl.mayorVector(vector);
		int sumaTotal = vectorImpl.sumarVector(vector);
		vectorImpl.ordernarVector(vector);
		//vectorImpl.eliminarDuplicadosVector(vector);
		//vectorImpl.BuscarElementoVector(vector);
		vectorImpl.CalcularPromedioVector(vector, sumaTotal);
		vectorImpl.ContarOcurrenciasVector(vector);
		vectorImpl.ComprobarOrdenVector(vector);		
		vectorImpl.RotarElementosVector(vector);
		vectorImpl.Combinarvectores(vector);

	}

}
