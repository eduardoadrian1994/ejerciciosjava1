package ar.com.dypsa.Archivo.negocios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArchivosManejo {
	
	public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo); // el file crea el archivo atravez del  "PrintWriter"
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
	

	public void leerArchivo(String nombreArchivo) {
		try {
			FileReader reader = new FileReader(nombreArchivo);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * Este método en Java se llama leerArchivo y toma como parámetro el nombre de
		 * un archivo. El método intenta leer el contenido del archivo especificado
		 * utilizando un objeto FileReader y un objeto BufferedReader. Luego, lee el
		 * contenido del archivo línea por línea utilizando un bucle while y la función
		 * readLine del objeto BufferedReader. Cada línea leída se imprime en la consola
		 * utilizando System.out.println. Finalmente, el objeto FileReader se cierra
		 * utilizando su método close. Si ocurre una excepción de tipo IOException
		 * durante la lectura del archivo, se imprime la traza de la pila de la
		 * excepción utilizando el método printStackTrace del objeto excepción.
		 * 
		 * En resumen, este método lee el contenido de un archivo especificado y lo
		 * imprime en la consola línea por línea.
		 * 
		 * BufferedReader es una clase de Java para leer texto de una secuencia de
		 * entrada, como un archivo, almacenando en el búfer caracteres para
		 * proporcionar una lectura eficiente de caracteres, matrices o líneas 1. En
		 * general, cada solicitud de lectura realizada de un Reader hace que se realice
		 * una solicitud de lectura correspondiente del flujo de caracteres o bytes
		 * subyacente. Por lo tanto, es aconsejable incluir un BufferedReader en
		 * cualquier Reader cuyas operaciones de lectura puedan ser costosas, como
		 * FileReaders e InputStreamReaders 1.
		 * 
		 * Un "InputStreamReader" es una clase en Java que actúa como un puente entre
		 * flujos de bytes y flujos de caracteres: lee bytes y los decodifica en
		 * caracteres utilizando un juego de caracteres específico . El juego de
		 * caracteres que utiliza se puede especificar por nombre, se puede dar
		 * explícitamente o se puede usar el juego de caracteres predeterminado 2. Para
		 * habilitar la conversión eficiente de bytes a caracteres, se pueden leer más
		 * bytes del flujo subyacente de los necesarios para satisfacer la operación de
		 * lectura actual. Para obtener la máxima eficiencia, considere envolver un
		 * InputStreamReader dentro de un BufferedReader .
		 * 
		 * printStackTrace es un método en instancias de Throwable que imprime el
		 * seguimiento de pila de la instancia en System.err.
		 * 
		 * System.err es un objeto PrintStream en Java que proporciona acceso al flujo
		 * de salida de error estándar
		 * 
		 * IOException es una excepción en Java que se lanza cuando ocurre un error de
		 * entrada/salida durante la ejecución de un programa.
		 *
		 */
	}

	public void escribirArchivo(String nombreArchivo) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa texto: ");
		String texto = scanner.nextLine();

		try {
			FileWriter writer = new FileWriter(nombreArchivo);
			writer.write(texto);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
		/*
		 * Este método en Java se llama escribirArchivo y toma como parámetro el nombre
		 * de un archivo. El método crea un objeto Scanner para leer la entrada del
		 * usuario desde la consola y solicita al usuario que ingrese texto. Luego, el
		 * texto ingresado se almacena en una variable String llamada texto. Después de
		 * eso, el método intenta escribir el contenido de la variable texto en el
		 * archivo especificado utilizando un objeto FileWriter. El método write del
		 * objeto FileWriter se utiliza para escribir el contenido de la variable texto
		 * en el archivo. Finalmente, el objeto FileWriter se cierra utilizando su
		 * método close. Si ocurre una excepción de tipo IOException durante la
		 * escritura del archivo, se imprime la traza de la pila de la excepción
		 * utilizando el método printStackTrace del objeto excepción. El objeto Scanner
		 * también se cierra utilizando su método close.
		 * 
		 * En resumen, este método permite al usuario ingresar texto a través de la
		 * consola y luego escribe el texto ingresado en un archivo especificado.
		 * 
		 * "FileWriter" es una clase en Java que se utiliza para escribir datos
		 * orientados a caracteres en un archivo.
		 * 
		 * printStackTrace es un método en instancias de Throwable que imprime el
		 * seguimiento de pila de la instancia en System.err.
		 * 
		 * System.err es un objeto PrintStream en Java que proporciona acceso al flujo
		 * de salida de error estándar
		 * 
		 * IOException es una excepción en Java que se lanza cuando ocurre un error de
		 * entrada/salida durante la ejecución de un programa.
		 * 
		 */
	}

	public void concatenarArchivos(String nombreArchivo1, String nombreArchivo2, String nombreArchivoConcatenado) {
		try {
			FileReader reader1 = new FileReader(nombreArchivo1);
			BufferedReader bufferedReader1 = new BufferedReader(reader1);

			FileReader reader2 = new FileReader(nombreArchivo2);
			BufferedReader bufferedReader2 = new BufferedReader(reader2);

			FileWriter writer = new FileWriter(nombreArchivoConcatenado);

			String linea;
			while ((linea = bufferedReader1.readLine()) != null) {
				writer.write(linea + "\n");
			}

			while ((linea = bufferedReader2.readLine()) != null) {
				writer.write(linea + "\n");
			}

			reader1.close();
			reader2.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * Este método en Java se llama concatenarArchivos y toma como parámetros los
		 * nombres de dos archivos y el nombre de un archivo concatenado. El método
		 * intenta leer el contenido de los dos primeros archivos especificados
		 * utilizando objetos FileReader y BufferedReader. Luego, lee el contenido de
		 * cada archivo línea por línea utilizando bucles while y la función readLine
		 * del objeto BufferedReader. Cada línea leída se escribe en el archivo
		 * concatenado utilizando un objeto FileWriter y su método write. Después de
		 * leer y escribir el contenido de ambos archivos, los objetos FileReader y
		 * FileWriter se cierran utilizando sus respectivos métodos close. Si ocurre una
		 * excepción de tipo IOException durante la lectura o escritura de los archivos,
		 * se imprime la traza de la pila de la excepción utilizando el método
		 * printStackTrace del objeto excepción.
		 * 
		 * En resumen, este método lee el contenido de dos archivos especificados y los
		 * escribe en un archivo concatenado. IOException es una clase en Java que
		 * representa errores que no puede evitar el programador, generalmente
		 * relacionados con la entrada/salida del programa.
		 * 
		 * BufferedReader es una clase de Java para leer texto de una secuencia de
		 * entrada, como un archivo, almacenando en el búfer caracteres para
		 * proporcionar una lectura eficiente de caracteres, matrices o líneas 1. En
		 * general, cada solicitud de lectura realizada de un Reader hace que se realice
		 * una solicitud de lectura correspondiente del flujo de caracteres o bytes
		 * subyacente. Por lo tanto, es aconsejable incluir un BufferedReader en
		 * cualquier Reader cuyas operaciones de lectura puedan ser costosas, como
		 * FileReaders e InputStreamReaders.
		 * 
		 * printStackTrace es un método en instancias de Throwable que imprime el
		 * seguimiento de pila de la instancia en System.err.
		 * 
		 * System.err es un objeto PrintStream en Java que proporciona acceso al flujo
		 * de salida de error estándar.
		 * 
		 * IOException es una excepción en Java que se lanza cuando ocurre un error de
		 * entrada/salida durante la ejecución de un programa.
		 * 
		 */
	}

	public void buscarPalabra(String nombreArchivo) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa la palabra a buscar: ");
		String palabra = scanner.nextLine();

		int contador = 0;

		try {
			FileReader reader = new FileReader(nombreArchivo);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				String[] palabras = linea.split(" ");
				for (String w : palabras) {
					if (w.equals(palabra)) {
						contador++;
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en el archivo.");
		scanner.close();
		/*
		 * Este método en Java se llama buscarPalabra y toma como parámetro el nombre de
		 * un archivo. El método crea un objeto Scanner para leer la entrada del usuario
		 * desde la consola y solicita al usuario que ingrese una palabra. Luego, la
		 * palabra ingresada se almacena en una variable String llamada palabra. Después
		 * de eso, el método intenta buscar la palabra en el archivo especificado
		 * utilizando un objeto FileReader y un objeto BufferedReader. Luego, lee el
		 * contenido del archivo línea por línea utilizando un bucle while y la función
		 * readLine del objeto BufferedReader. Cada línea leída se divide en palabras
		 * utilizando el método split de la clase String y se verifica si cada palabra
		 * es igual a la palabra buscada utilizando el método equals de la clase String.
		 * Si una palabra es igual a la palabra buscada, se incrementa un contador.
		 * Finalmente, el objeto FileReader se cierra utilizando su método close y se
		 * imprime en la consola cuántas veces aparece la palabra buscada en el archivo.
		 * Si ocurre una excepción de tipo IOException durante la lectura del archivo,
		 * se imprime la traza de la pila de la excepción utilizando el método
		 * printStackTrace del objeto excepción. El objeto Scanner también se cierra
		 * utilizando su método close.
		 * 
		 * En resumen, este método permite al usuario ingresar una palabra a través de
		 * la consola y luego busca esa palabra en un archivo especificado, contando
		 * cuántas veces aparece.
		 * 
		 * BufferedReader es una clase de Java para leer texto de una secuencia de
		 * entrada, como un archivo, almacenando en el búfer caracteres para
		 * proporcionar una lectura eficiente de caracteres, matrices o líneas 1. En
		 * general, cada solicitud de lectura realizada de un Reader hace que se realice
		 * una solicitud de lectura correspondiente del flujo de caracteres o bytes
		 * subyacente. Por lo tanto, es aconsejable incluir un BufferedReader en
		 * cualquier Reader cuyas operaciones de lectura puedan ser costosas, como
		 * FileReaders e InputStreamReaders .
		 * 
		 * printStackTrace es un método en instancias de Throwable que imprime el
		 * seguimiento de pila de la instancia en System.err.
		 * 
		 * System.err es un objeto PrintStream en Java que proporciona acceso al flujo
		 * de salida de error estándar
		 * 
		 * IOException es una excepción en Java que se lanza cuando ocurre un error de
		 * entrada/salida durante la ejecución de un programa.
		 * 
		 */
	}

	public void crearDirectorios(String nombreDirPrincipal, int cantidadSubdirectorios) {
		File dirPrincipal = new File(nombreDirPrincipal);
		if (!dirPrincipal.exists()) {
			dirPrincipal.mkdir();
		}

		for (int i = 1; i <= cantidadSubdirectorios; i++) {
			File subDir = new File(dirPrincipal, "subDir" + i);
			if (!subDir.exists()) {
				subDir.mkdir();
			}
		}
		/*
		 * Este método en Java se llama crearDirectorios y toma como parámetros el
		 * nombre de un directorio principal y la cantidad de subdirectorios a crear. El
		 * método crea un objeto File para representar el directorio principal y
		 * verifica si existe utilizando el método exists del objeto File. Si el
		 * directorio principal no existe, se crea utilizando el método mkdir del objeto
		 * File. Luego, el método utiliza un bucle for para crear la cantidad
		 * especificada de subdirectorios dentro del directorio principal. Para cada
		 * subdirectorio, se crea un objeto File para representarlo y se verifica si
		 * existe utilizando el método exists del objeto File. Si el subdirectorio no
		 * existe, se crea utilizando el método mkdir del objeto File.
		 * 
		 * En resumen, este método crea un directorio principal y una cantidad
		 * especificada de subdirectorios dentro del directorio principal.
		 */
	}

}
