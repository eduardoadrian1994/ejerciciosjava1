package test;

import entidades.Fraccion;

public class FraccionMain {
	

public static void main(String[] args) {
        
		//invocando
	
	Fraccion fraccion1 = new Fraccion(20,10);
		
	Fraccion fraccion2 = new Fraccion(12,15);
	
	//llamado entre clases
	
	System.out.println("la suma de las fracciones es : "+fraccion1.sumar(fraccion1, fraccion2));
	System.out.println("la resta de las fracciones es : "+fraccion1.resta(fraccion1, fraccion2));
	System.out.println("la division de las fracciones es : "+fraccion1.division(fraccion1, fraccion2));
	System.out.println("la multiplicacion de las fracciones es : "+fraccion1.multiplicar(fraccion1, fraccion2));
	
	//    int resultadoSuma = sumar(10/8, 10/5);
	//		  Fraccion suma = f1.sumar(f2);
	//        Fraccion resta = f1.restar(f3);
	//        Fraccion producto = f1.multiplicar(f4);
	//        Fraccion cociente = f1.dividir(f2);
        
        
       
		//System.out.println("Suma del Numerado: " + resultadoSuma);
    }
}
