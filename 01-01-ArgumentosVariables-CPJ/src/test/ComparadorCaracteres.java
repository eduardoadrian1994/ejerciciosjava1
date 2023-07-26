package test;
import java.util.Scanner;
public class ComparadorCaracteres {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una palabra para comparar: ");
		String Caracteres1 = teclado.nextLine();
		System.out.print("Introduce un palabra para comparar: ");
		String Caracteres2 = teclado.nextLine ();
		
		if (Caracteres1.equals(Caracteres2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		teclado.close();
	}	
}