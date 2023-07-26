package Entidades;

import Entidades.Animal;

public class Gato extends Animal{
	//creo el constructor de mi metodo 
		public Gato(String nombre, int edad) {
			super(nombre, edad);
			// TODO Auto-generated constructor stub
		}
		//metdo
		public void Maullar() {
			System.out.println("El gato esta maullando.");
		}
}
