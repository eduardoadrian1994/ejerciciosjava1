package ar.com.dypsa.Archivo.test;

import ar.com.dypsa.Archivo.negocios.ArchivosManejo;

public class TestArchivo {

	public static void main(String[] args) {

		/*
		 * Este código en Java define una clase llamada TestArchivo que contiene un
		 * método main. El método main crea una instancia de la clase ArchivosManejo y
		 * luego utiliza varios métodos de esa instancia para realizar diferentes
		 * operaciones con archivos y directorios.
		 */

		ArchivosManejo archivosManejo = new ArchivosManejo();
		
		/*
		 * paracrear archivos de texto
		 * 
		 * 
		 */
		
		//      crearArchivo(nombreArchivo);
		
		/*
		 * Primero, se utiliza el método leerArchivo para leer el contenido de un
		 * archivo especificado.
		 * 
		 */
//		System.out.println("Lectura de archivo:");
//		archivosManejo.leerArchivo("C:\\Users\\Usuario\\Desktop\\hola.txt");

		/*
		 * 
		 * el método escribirArchivo para escribir en el mismo archivo.
		 * 
		 */

//		System.out.println("\nEscritura en archivo:");
//		archivosManejo.escribirArchivo("C:\\Users\\Usuario\\Desktop\\hola.txt");

		/*
		 * concatenarArchivos para concatenar el contenido de dos archivos especificados
		 * en un archivo concatenado.
		 * 
		 */

//		System.out.println("\nConcatenación de archivos:");
//		archivosManejo.concatenarArchivos("C:\\Users\\Usuario\\Desktop\\hola.txt", "C:\\Users\\Usuario\\Desktop\\hola2.txt", "C:\\Users\\Usuario\\Desktop\\concatenado.txt");

		/*
		 * 
		 * el método buscarPalabra para buscar una palabra en un archivo especificado.
		 * 
		 */

//		System.out.println("\nBúsqueda de palabra:");
//		archivosManejo.buscarPalabra("C:\\Users\\Usuario\\Desktop\\hola.txt");

		/*
		 * 
		 * En resumen, este código muestra cómo utilizar diferentes métodos de la clase
		 * ArchivosManejo para realizar operaciones con archivos y directorios.
		 * 
		 */

		System.out.println("\nCreación de directorios:");
		archivosManejo.crearDirectorios("dirPrincipal", 1);

	}

}
