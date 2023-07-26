package entidades;

import entidades.Animal;

public class Perro extends  Animal {
	
	
	public Perro() {
		super();
	}

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void ladrar() {
		System.out.println("el perro esta ladrando");
	}
	
}
