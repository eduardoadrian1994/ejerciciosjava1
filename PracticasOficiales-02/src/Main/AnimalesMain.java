package Main;



import java.util.ArrayList;
import java.util.List;

import Entidades.Animal;

import Entidades.Perro;

import Entidades.Gato;



public class AnimalesMain {

	public static void main(String[] args) {
		
		List<Animal> animales = new ArrayList<Animal>();
		
		
		animales.add(new Gato("Gansito", 5));
		animales.add(new Perro("Galle", 3));
		
		
		
		for(int i = 0; i < animales.size(); i++ ) {
			
			Animal animal = new Animal(); 
			animal = animales.get(i);
			System.out.println(animal);
		}
		
		
		//List<Animal> animales = Arrays.asList("Perro", "Gato");	
		//List<Animal> lista = Arrays.asList("manzana", "banana", "naranja");
		//List<Animal> lista = new  ArraysList()<Animal>; lista.add("lo que va");
		
		for(Animal ane : animales) {
		
		if(ane instanceof Perro) {
			
			
			System.out.println("el objeto de la clase Perro");
		
		} else {
			
			
			System.out.println("el objeto de la clase gato");
		
		}
		
		}
	
	}
	
}
