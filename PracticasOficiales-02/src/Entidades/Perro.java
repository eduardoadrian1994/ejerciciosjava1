package Entidades;

import Entidades.Animal;

public class Perro extends Animal {
	
	//creo el constructor de mi metodo 
	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	//metdo
	public void ladrar() {
		System.out.println("El perro esta ladrando.");
	}
	
}
