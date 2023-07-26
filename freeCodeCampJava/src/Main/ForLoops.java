package Main;

public class ForLoops {

	public static void main(String[] args) {
		//esto tiene 4 partes
		// 1.inicia en "init"
		// 2.le asignamos una variable
		// 3.despues cheaqueamos si es menor o igual
		//for(int number = 1; number <= 10; number++){
			//System.out.println(number);
		//}
		
		
		//For con array
		
		//int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		
		//for(int index = 0; index <= numbers.length; index++){
			//System.out.println(numbers[index]);
		//}
	
		
	  //como  hacer sumas en For
	
		//int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		
		 //int sum = 0;
		
		
				//for(int index = 0; index <= numbers.length; index++){
					
					//sum += numbers[index];
					
				//}
				
				
				
				//System.out.println(sum); //55 
				
			//tablas de multiplicar con for	
		
		//imprime solo una tabla en el ej 5
		//int number = 5;
		
		//for(int multiplicador = 1 ; multiplicador < 10; multiplicador++){
		
		//System.out.printf("%d X %d = %d \n",  number, multiplicador, number*multiplicador);
		
		//}
		
		
		
		//un poco mas lejos
		
		
		//como no tiene int imprime todas las tablas de multiplicar
		
		//for (int number = 1; number<=10; number++) {
			//for(int multiplicador=1; multiplicador <=10; multiplicador++) {
				 //System.out.printf("%d X %d = %d \n",  number, multiplicador, number * multiplicador);
			//}
		//}
		
		
		// imprimir todos los numeros impares 1 al 50 con for, if y else 
		
		//for (int number = 1; number<50; number++) {
			//if(number %2 == 1) {
				//System.out.println(number);
			//}
		//}
		
		
		//otro ejemplo de lo mismo		
		
		int numbers[]= {1,2,3,4,5};
		
		int sum = 0;
		
		for(int number : numbers) {
			
			sum +=number;
		}
		
		
		
		System.out.println(sum);
		
		
		
		
		
	}

}
