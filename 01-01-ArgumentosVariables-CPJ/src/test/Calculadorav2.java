package test;
import java.util.Scanner;
public class Calculadorav2 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int resultado;
		int num1;
        int num2;
        System.out.print("Introduce un número para sumar: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número para sumar: ");
        num2 = teclado.nextInt();	
		resultado = num1 + num2;
		System.out.println("El resultado de la suma es de: " + resultado);
		System.out.print("Introduce un número para restar: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro para restar: ");
        num2 = teclado.nextInt();	
		resultado = num1 - num2;
		System.out.println("El resultado de la resta es de: " + resultado);
		System.out.print("Introduce un número para multiplicar: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número para multiplicar: ");
        num2 = teclado.nextInt();	
		resultado = num1 * num2;
		System.out.println("El resultado de la multiplicacion es de: " + resultado);
		System.out.print("Introduce un número para divir : ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número para divir: ");
        num2 = teclado.nextInt();		
		resultado = num1 / num2;
		System.out.println("El resultado de la división es de: " + resultado);
		teclado.close();
	}
}
