package test;

public class CondicionalesAnidados {
	public static void main(String[]args) {
		int num1 = 25;
		int num2 = 25;
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
	}
}
