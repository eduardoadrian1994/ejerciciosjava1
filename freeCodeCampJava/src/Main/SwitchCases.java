package Main;

import java.util.Scanner;

public class SwitchCases {

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
		
		
		switch(Operation){
		case"sumar":
			System.out.printf(" %f + %f = %f ", number1,number2, number1 + number2);
			break;
		case"restar":
			System.out.printf(" %f - %f = %f ", number1,number2, number1 - number2);
			break;
		case"multiplicar":
			System.out.printf(" %f * %f = %f ", number1,number2, number1 * number2);
			break;
		case"dividir":
			if (number2 == 0) {
				System.out.println("no puedes dividir con cero. ");
			}else {
			System.out.printf(" %f / %f = %f ", number1,number2, number1 / number2);
			}
			break;
		default:
			System.out.printf(" %s no es un operacion permitida. ", Operation);
		}
		
		scanner.close();
	}

}
