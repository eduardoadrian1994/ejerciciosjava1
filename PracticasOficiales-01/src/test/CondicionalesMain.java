package test;

public class CondicionalesMain {//inicio de la clase

	//aca se pude declarar variables globales
	
	public static void main(String[] args) {//inicio de metodo y dentro de {} es un codigo de bloque. local variables
		
		//inico bojeto, tipo de dato, tipo de nombre y atributo de dato
		int age = 18;
		
		
		
		//ejemplo 1 Comparando dos variables de tipo int sería:
		
		//metodo, instruccion y resultado con if, else y else if 
		if(age >= 18) {
			System.out.println("puedes entrar");
		}else if (age == 18){
			System.out.println("zona vip");
		}else {
			System.out.println("no puedes entrar");
		}
		
		
		//metodo, instruccion y resultado con switch / casos
		
		int counter =1;
		
		switch (counter) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;	
		case 4:
			System.out.println("four");
			break;	
		default:
			break;
		}
		
		
		//metodo, instruccion y resultado con operador ternario "?"  compuestas
		
		System.out.println((age >= 18) ? "eres un adulto":"eres un niño");

	
	}//fin de metodo y dentro de {} es un codigo de bloque. local variables

}//fin de la clase
