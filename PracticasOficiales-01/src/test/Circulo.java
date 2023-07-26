package test;
//import java.util.Scanner;
public class Circulo {
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);
		double radio = 3;
		double  area =  Math.PI;
		double circuferencia;
		area = area*radio*radio;
		circuferencia = (2 * area) * radio;
		System.out.println("el radio es de:" + radio);
		System.out.println("el area del circulo es: " + area);
		System.out.println("la circuferencia del circulo es: " + circuferencia);
		//radio = teclado.nextInt();
		//area = area*radio*radio;
		//teclado.close();
	}
}
