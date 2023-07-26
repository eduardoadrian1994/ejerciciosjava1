package Main;

public class OperadoresRelacionales {
	
	public static void main(String[] args) {
		
		int  number1 = 12;
		
		int number2 = 15;
		
		// si es igual a
		System.out.println(number1==number2);
		
		
		// si no es igual a 
		// "!" condicional negador
		System.out.println(number1!=number2);
		
		// si es mas que
		System.out.println(number1>number2);
		
		// si es menos que
		System.out.println(number1<number2);
				
		
		// si es mas o igual que
		System.out.println(number1>=number2);
		
		
		// si es menos o igual que
		System.out.println(number1<=number2);
		
		//ejemplos con operadores condicionales
		
		int age = 40;
		// && and o y
		System.out.println(age >=18 && age <=40);
		
		
		//ejemplos con operadores Boleanos
		
		boolean isStudent = false;
		
		boolean isLibraryMember = true;
		
		//or u o
		//compara si hay algo verdadero lo devuelve true
		System.out.println(isStudent||isLibraryMember);
		//compara si es todo falso devuelve falso
		
		// not o negación
		
		System.out.println(!isStudent);
		
		//incrementador
		int score = 0;
		
		int turns = 10;
		
		score++;
		
		turns--;
		
		System.out.println(score);
		System.out.println(turns);
		
		
		
	}

}
