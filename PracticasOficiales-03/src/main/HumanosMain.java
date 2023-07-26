package main;

import entidades.Humano;

import entidades.Empleado;;

public class HumanosMain {

	public static void main(String[] args) {
		
        Humano humano = new Empleado(); //Upcasting

        humano.trabajar();

        if (humano instanceof Empleado) {
            Empleado empleado = (Empleado) humano;//Downcasting
            empleado.trabajar();
            empleado.trabajando();
        }

        humano = new Empleado("pepito", 22, 5579);

        Empleado empleado = (Empleado) humano;//Downcasting
        
        int numero = empleado.getNumeroDeEmpleado();//Autoboxing: convierte el valor entero a Integer
        
        Integer numeroInteger = numero;  // Unboxing: convierte el integear a int

        empleado.setNumeroDeEmpleado(numeroInteger);//devuelve int

        System.out.println(numero);

    }

}
