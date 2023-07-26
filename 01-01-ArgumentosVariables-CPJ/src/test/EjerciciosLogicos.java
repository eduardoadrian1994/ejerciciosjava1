package test;
/* Realizar un programa que partmita el intercamibio de valores entre dos variables.*/
/*por ejemplo: Si una variable numero vale  35, y una varaible numero2 vale 20,*/
/*realizar las acciones nesecesarias para que el numero pase valer 20 y numero2*/
/*pase a valer 35. Una vez realizado el cambio mostrar*/
/*el resultado por pantalla*/


public class EjerciciosLogicos {
	public static void main(String[]args) {
		int num1 = 35;
		int num2 = 20;
		int aux;
		System.out.println("------Antes--------");
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
		//20 //20
		aux = num2;
		//35   //35
		num2 = num1;
		//20 //20
		num1 = aux;
		System.out.println("------Después--------");
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
	}

}
