package test;

import entidades.PerroMascota;

import entidades.GatoMascota;

import entidades.P�jaroMascota;

public class MascotaMain {
	
	public static void main(String[] args) {
		
		PerroMascota perro = new PerroMascota("Scooby doo","mastin napolitano");
		
		perro.ladrar();
		perro.muletilla();
		
		GatoMascota gato = new GatoMascota("Silvester","Angora turco");
		gato.Maullar();
		gato.Pensamiento();
		
		P�jaroMascota p�jaro = new P�jaroMascota("Piolin","Canario silvestre");
		p�jaro.Cantar();
		p�jaro.Gatito();
		
		
	}

}
