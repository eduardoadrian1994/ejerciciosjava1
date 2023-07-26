package test;
import java.util.Scanner;
public class CondicionalSwitchV2 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		 int dia;
		 String nombreDia;
		 System.out.print("Introduce un número para comparar: ");
	        dia = teclado.nextInt();
		 switch (dia) {
		 
		 case 1: nombreDia="Lunes";
		 break;
		 case 2: nombreDia="Martes";
		 break;
		 case 3: nombreDia="Miércoles";
		 break;
		 case 4: nombreDia="Jueves";
		 break;
		 case 5: nombreDia="Viernes";
		 break;
		 case 6: nombreDia="Sábado";
		 break;
		 case 7: nombreDia="Domingo";
		 break;
		 default: nombreDia="Numero de dia inválido";
		 break;
		 }
		 teclado.close();
		 System.out.println("El dia de la semana es: " + nombreDia);
	}
}
