package Main;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		int number = 5;
		
		
		int multiplicador = 1;
		
		//la difrencia con un while es que primero se ejecuta el bucle
		do {
			
			System.out.printf("%d X %d = %d \n", number, multiplicador, number * multiplicador );
			
			multiplicador++;
		
			// y despues chequea
		}while(multiplicador<=10);
		
		
			/*while (multiplicador<=10){
			//
			//System.out.printf("%d X %d = %d \n", number, multiplicador, number * multiplicador );
			//			
			//multiplicador++;
			} */
			
	
	
		}
	
	
	}

