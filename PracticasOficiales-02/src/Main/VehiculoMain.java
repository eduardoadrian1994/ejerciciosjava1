package Main;

import Entidades.Vehiculo;

import Entidades.Auto;


public class VehiculoMain {

	public static void main(String[] args) {
		

		Vehiculo vehiculo = new Auto(); //Upcasting
		
		vehiculo.conducir();
		
		
				
		if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo; //Downcasting
				auto.encenderRadio();
			}
		}
		
}
