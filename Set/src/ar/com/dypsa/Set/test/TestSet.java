package ar.com.dypsa.Set.test;

import java.util.ArrayList;
import java.util.List;

import ar.com.dypsa.Set.negocios.ExcepcionessetI;

import ar.com.dypsa.Set.negocios.ExcepcionessetImpl;


public class TestSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        ExcepcionessetI   ExcepcionessetImpl = new ExcepcionessetImpl();
        ExcepcionessetImpl.recorrer(list);

	}

}
