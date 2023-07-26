package test;

import entidades.Vehiculo;

public class VehiculoMain {
	public static void main(String[] args) {
	Vehiculo vehiculo1 = new Vehiculo();
	vehiculo1.setNombrevehiculo("corven");
	vehiculo1.setTipovehiculo("triax 150");
	vehiculo1.setPatente(557);
	
	Vehiculo vehiculo2 = new Vehiculo();
	vehiculo2.setNombrevehiculo("renault");
	vehiculo2.setTipovehiculo("Duster");
	vehiculo2.setPatente(299);

    System.out.println("Nombrevehiculo: " + vehiculo1.getNombrevehiculo());
    System.out.println("Tipovehiculo: " + vehiculo1.getTipovehiculo());
    System.out.println("Patente: " + vehiculo1.getPatente());
    
    System.out.println("Nombrevehiculo: " + vehiculo2.getNombrevehiculo());
    System.out.println("Tipovehiculo: " + vehiculo2.getTipovehiculo());
    System.out.println("Patente: " + vehiculo2.getPatente());
}
}	
