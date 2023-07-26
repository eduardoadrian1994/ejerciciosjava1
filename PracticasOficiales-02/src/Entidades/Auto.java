package Entidades;

import Entidades.Vehiculo;


public class Auto extends Vehiculo{


	public Auto() {
		super();
	}

	public Auto(String nombrevehiculo, String tipovehiculo) {
		super(nombrevehiculo, tipovehiculo);
		// TODO Auto-generated constructor stub
	}
	
	

	public void encenderRadio() {
		System.out.println("en los parlantes esta sonando musica");
	}
	
	
}
