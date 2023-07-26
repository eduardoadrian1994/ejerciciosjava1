package Main;

//se importa scaner para utilizarlo primero
import  java.util.Scanner;


public class TiposDeEntradas {

	public static void main(String[] args) {
		
		//se una bojeto de escáner ahora scaner es una de las calses de java ej:

		//lo puedes nombrar como quieras ej(raton, teclado y etc).
		//si al entrada es consola o terminal se coloca "(System.in)".
		Scanner scanner = new Scanner(System.in); 
		
		//sale sin /n al final 
		System.out.print("cual es tu nombre? ");
		
		//sale automaticamente con \n alfinal
		//System.out.println("cual es tu nombre? ");
		
		
		
		//llamamos a escaner para que obtenga el dato
		
		String nombre = scanner.nextLine();
		
		
		//llamamos a la variable donde se guardo
		
		//System.out.println(nombre);
		
		
		//formatea cadenas para pasarle el nombre
		System.out.printf("hola %s. cauntos años tienes? ", nombre);
		
		//original
		//int edad = scanner.nextInt();
		
		//modificada para limpiar la entrada  //es lo que sirve verdaderamente para que siga el programa y  "scanner.nextInt();" no sirve
		
		int edad = Integer.parseInt(scanner.nextLine());
		
		//para toamr el gpa(escala de puntos del sistema calificatorio de educacion en eeuu) del usuario 
		//double gpa = Double.parseDouble(Scanner.nextLine());
		
			
		System.out.printf("%d es una edad excelente para empezar a programar. que lenguaje prefieres? Edu", edad);
		
		
		
		String lenguaje = scanner.nextLine();
		
		
		
		System.out.printf("%s, ese lenguaje de programacion es muy popular.", lenguaje);
		
		//no sirve para que siga el programa
		//scanner.nextInt();
		
		
	//para que el scaner no se quede activo ocupando memoria y no tire error
	scanner.close();
	
	}

}
