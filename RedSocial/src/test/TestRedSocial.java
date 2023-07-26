package test;

import entidades.usuarios;
import negocios.RedsocialI;
import negocios.RedsocialImpl;

import java.util.ArrayList;

import java.util.List;

public class TestRedSocial {

	public static void main(String[] args) {

		List<usuarios> Usuarios = new ArrayList<usuarios>();
		Usuarios.add(new usuarios("pepito", "pepitojuarez@hotmail.com", 123456789,"holaprivado","amigo","a","a"));
		Usuarios.add(new usuarios("peita", "pepitajuarez@hotmail.com", 78945612,"s","amigo","a","a"));
		Usuarios.add(new usuarios("Aquiles", "aquilesbailo@hotmail.com", 114873212,"s","amigo","a","a"));
		Usuarios.add(new usuarios("Estan", "estabanquito@hotmail.com", 113576512,"s","amigo","a","a"));
		RedsocialI redsocialImpl = new RedsocialImpl();
		//redsocialImpl.registrarse(Usuarios, 0);
		//redsocialImpl.mensajesprivados(Usuarios, 0);
		//redsocialImpl.agregaramigos(Usuarios, 0);
		redsocialImpl.publicarmensajes(Usuarios, 0);
		//redsocialImpl.comentarenpublicaciones(Usuarios, 0);
		//redsocialImpl.actualizarperfil(Usuarios, 0);

	}
}
