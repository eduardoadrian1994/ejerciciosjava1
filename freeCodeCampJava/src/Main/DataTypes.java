package Main;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integraciones tipos
		
				byte aSingleByte = 100; // -128 a 127
				short aSmallNumber = 20000;// -32,768 a 32,767 
				int anInteger = 2147483647;// -2147483648 to 2147483647 
				long aLargeNumber = 9223372036854775807L; //-9223372036854775808 a 92233720366854775807 se usa cuando un numero no cabe en int
			
				// deciamles tipos
				
				double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308 son flotantes de doble 64
				float  afloat  = 3.4028f; // 1.4E-45 to 3.4028235E38
				
				
				//booleanos
				
				boolean isWeeked = false;
				boolean isWorkday = true;
				
				//caracteres
				
				char copyrightSymbol = '\u00A9';
				
				System.out.println("esto es el copyright simbolo: " + copyrightSymbol );
				
				//asi se resuelves el problema de compatibilidad de double a int
				
				double number1 = 5.8;
				int number2 = (int)number1;
				System.out.println(number2);

	}

}
