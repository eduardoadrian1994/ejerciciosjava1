package test;

import entidades.Libro; //traigo mi objeto real que se paso a abstracto representado clase objeto en codigo.

public class LibroMain {//inicio de la clase

	//aca se pude declarar variables globales
	
	public static void main(String[] args) {//inicio de metodo y dentro de {} es un codigo de bloque. local variables
		
		//invoco al objeto
		Libro libro = new Libro();
		
		
		//me traigo la varaible con set coloco el tipo de dato con cual se inicia el atributo 
		
		libro.setTítulo("100 años de soledad");
		libro.setAutor("Gabriel García Márquez");
		
		
		//invoco al objeto
		Libro libro2 = new Libro();
		
		//me traigo la varaible con set coloco el tipo de dato con cual se inicia el atributo 
		
		libro2.setTítulo("El lobo estepario");
		libro2.setAutor("Hermann Hesse");
		
		
		//llamado entre clases obetenido dato atravez del get.
		
		System.out.println("el título del libro es: " + libro.getTítulo());
		System.out.println("el autor del libro es: " + libro.getAutor());
		System.out.println("el título del libro es: " + libro2.getTítulo());
		System.out.println("el autor del libro es: " + libro2.getAutor());
		
		
	}//fin de metodo y dentro de {} es un codigo de bloque. local variables

}//find de la clase
