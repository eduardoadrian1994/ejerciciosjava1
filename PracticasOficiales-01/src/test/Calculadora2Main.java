package test;
import entidades.Calculadora;
public class Calculadora2Main {
	public static void main(String[] args) {
        
		//invocando
		Calculadora calculadora = new Calculadora();
		//llamado entre clases
        int resultadoSuma = calculadora.sumar(5, 3);
        int resultadoResta = calculadora.restar(7, 2);
        int resultadoMultiplicacion = calculadora.multiplicar(4, 6);
        double resultadoDivision = calculadora.dividir(10, 3);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}
