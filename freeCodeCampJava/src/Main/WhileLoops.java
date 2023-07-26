package Main;

public class WhileLoops {

	public static void main(String[] args) {
		
		int number = 5;
		
		int multiplicador = 1;
		
		while (multiplicador<=10) {
			
			System.out.printf("%d X %d = %d \n", number, multiplicador, number * multiplicador );
			
			multiplicador++;
		}
		
	}

}
