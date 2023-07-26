package test;

import entidades.Canino;

public class CaninoMain {//inicio de la clase
// variable global static
	//static int edad = 4; 
	//static es el metodo  que solo puede funcionar con variables estaticas.
	
	
	//static int edad;
	//si despues llamo edad como esta declarada anivel clase se le asigna automatica mente el valor 0
	
	public static void main(String[] args) { //inicio de metodo y dentro de {} es un codigo de bloque. local variables
		//invocando al bojeto
		Canino canino = new Canino();
		//la variable iniciada no funcionara sin datos.
		//variable iniciada introducciendo dato atravez del set.
		canino.setNombre("scoby");;
		canino.setApellido("dooo");
		canino.setRaza("mastinNapolitano");
		canino.setTamaño("grande");
		canino.setEdad(4);
		canino.setPeso(80);
		
		//variable iniciada dato obetenido  atravez del get.
		System.out.println("Nombre del canino: " + canino.getNombre());
		System.out.println("Apellido del canino: " + canino.getApellido());
		System.out.println("Raza del canino: " + canino.getRaza());
		System.out.println("TamaÃ±o del canino: " + canino.getTamaño());
		System.out.println("Edad del canino: " + canino.getEdad());
		System.out.println("Peso del canino: " + canino.getPeso());

	}//fin de metodo y dentro de {} es un codigo de bloque. local variables
	
	

}//final de la clase.	
