package test;

import entidades.Gerente;  //importo mi clase

import entidades.Programador; //importo mi clase

public class EmpleadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente("Robertocarlos",4000);
		gerente.bonificaciones(500);
		gerente.aumento(1000);
		
		Programador programador = new Programador("Elsolitario",1000);
		programador.trabajoduro(3);
		programador.trabajosombras(0);

	}

}
