package ar.com.dypsa.ExcepcionesLista.test;

import java.util.ArrayList;
import java.util.List;


import ar.com.dypsa.ExcepcionesLista.negocios.ExcepcioneslistaI;

import ar.com.dypsa.ExcepcionesLista.negocios.ExcepcionesListaImpl;


public class TestExcepcionesLista {

	public static void main(String[] args) {
		List<Integer> Numeros = new ArrayList<>();
		ExcepcioneslistaI ExcepcionesListaImpl = new ExcepcionesListaImpl();
		ExcepcionesListaImpl.recorrer(Numeros);

	}

}
