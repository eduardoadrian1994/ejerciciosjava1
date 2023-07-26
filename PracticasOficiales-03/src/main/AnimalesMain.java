package main;

import entidades.Animal;

import entidades.Perro;

public class AnimalesMain {
	
	public static void main(String[] args) {
		
		Animal animal = new Perro();  //Upcasting
	
		animal.comer();
		
		
		
		if (animal instanceof Perro ) {
			Perro perro = (Perro) animal;//downcasting
			perro.ladrar();
			perro.comer();
		
		
			Integer  num = 42;
			
			int  numeroEnvuelto = num;
			
			
			System.out.println(numeroEnvuelto);
		
			
			
			Integer  numero = 10;
			
			int  otronumeroEnvuelto = numero;
			
			int otroNumero = otronumeroEnvuelto;
			
			System.out.println(otroNumero);
		
		
		}
		
	}
	
}
