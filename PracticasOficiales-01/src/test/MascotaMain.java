package test;

import entidades.PerroMascota;

import entidades.GatoMascota;

import entidades.PájaroMascota;

public class MascotaMain {
	
	public static void main(String[] args) {
		
		PerroMascota perro = new PerroMascota("Scooby doo","mastin napolitano");
		
		perro.ladrar();
		perro.muletilla();
		
		GatoMascota gato = new GatoMascota("Silvester","Angora turco");
		gato.Maullar();
		gato.Pensamiento();
		
		PájaroMascota pájaro = new PájaroMascota("Piolin","Canario silvestre");
		pájaro.Cantar();
		pájaro.Gatito();
		
		
	}

}
