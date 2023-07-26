package test;

public class OperadorTernarioMain {//inicio de la clase

	//aca se pude declarar variables globales
	
	public static void main(String[] args) {//inicio de metodo y dentro de {} es un codigo de bloque. local variables
		
		//inico bojeto, tipo de dato, tipo de nombre y atributo de dato
		int var1 = 10;
		int var2 = 15;
		
		
		//ejemplo 1 Comparando dos variables de tipo int sería:
		
		//metodo, instruccion y resultado con if else
		if(var1 > var2) {
			System.out.println("el numero: " + var1 +" Esmayor");
		}else {
			System.out.println("el numero: " + var2 +" es mayor");
		}
		
		//metodo, instruccion y resultado con operador ternario "?" 
		
		System.out.println(var1>var2 ? "el numero: "+var1+" es mayor":"el numero: "+var2+" es mayor");

		// Ejemplo 2: Implementando condiciones compuestas
	
		System.out.println((var1>var2) ? var1+ 10 : var2+ 20);
		
		// Ejemplo 2: Implementando condiciones compuestas con variable para guardar la respuesta
		
		int s = (var1>var2) ? var1+ 10 : var2+ 20;
		System.out.println(""+s);
	//es util para enteros negativos, en caso para que no devuelva los miemo numeros y de vuelva 0
	}//fin de metodo y dentro de {} es un codigo de bloque. local variables

}//fin de la clase
