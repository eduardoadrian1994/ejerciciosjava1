package Main;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero ");
		double number1 = scanner.nextDouble();
		scanner.nextLine(); 
		
		System.out.println("Ingresa el second numero ");
		double number2 = scanner.nextDouble();
		scanner.nextLine(); 
		
		System.out.print("¿Que operacion quieres realizar? ");
		
		String Operation = scanner.nextLine(); 
		
		//calculadora con if, else y modulares 
		if(Operation.equals("sumar")) {
			System.out.printf(" %f + %f = %f ", number1,number2, number1 + number2);
		}else if(Operation.equals("restar")) {
			System.out.printf(" %f - %f = %f ", number1,number2, number1 - number2);
		}else if(Operation.equals("multiplicar")) {
			System.out.printf(" %f * %f = %f ", number1,number2, number1 * number2);
		}else if(Operation.equals("division")) {
			if (number2 == 0) {
				System.out.println("no puedes dividir con cero. ");
			}else {
			System.out.printf(" %f / %f = %f ", number1,number2, number1 / number2);
			}
		
		}else{
			System.out.printf(" %s no es un operacion permitida. ", Operation);
		}
		
	scanner.close();
	}

}
