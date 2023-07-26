package test;

import entidades.Coche; //traigo mi objeto real que se paso a abstracto representado clase objeto en codigo.

public class CocheMain {//inicio de la clase
	
	//aca se pude declarar variables globales

	public static void main(String[] args) {//inicio de metodo y dentro de {} es un codigo de bloque. local variables
		
		//invocando al objeto
		Coche coche= new Coche();
		
		//me traigo la varaible con set coloco el tipo de dato con cual se inicia el atributo  
		coche.setMarca("Audi");
		coche.setModelo("A3");
		
		//invocando al objeto
		Coche coche2= new Coche();
		
		//me traigo la varaible con set coloco el tipo de dato con cual se inicia el atributo  
		
		coche2.setMarca("Ferri");
		coche2.setModelo("Frerrari-F1");
		
		
		//llamado entre clases obetenido dato atravez del get.
	    System.out.println("Marca del coche es: " + coche.getMarca());
	    System.out.println("Modelo del coche es: " + coche.getModelo());
	    System.out.println("Marca del coche es: " + coche2.getMarca());
	    System.out.println("Modelo del coche es: " + coche2.getModelo());
	
	}//fin de metodo y dentro de {} es un codigo de bloque. local variables
	
}	//find de la clase
