package test;
import java.util.Scanner;
public class CondicionalesAnidadosV2 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
        int num2;
        System.out.print("Introduce un número para comparar: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número para comparar: ");
        num2 = teclado.nextInt();
        if(num2>num1) {
			System.out.println("El num2 es mayor el num1");
		}else {
			if(num1 == num2 ) {
				System.out.println("son iguales");
			}else {
				System.out.println("El num1 es mayor el num2");
			}
			
			//System.out.println("El num1 es mayor el num2");
		}
        teclado.close();	
	}
}
