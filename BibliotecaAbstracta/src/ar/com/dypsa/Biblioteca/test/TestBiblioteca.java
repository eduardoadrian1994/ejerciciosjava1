package ar.com.dypsa.Biblioteca.test;

import ar.com.dypsa.Biblioteca.domain.*;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		Libro libro = new Libro(null, 0, null);
        libro.setTitulo("El Quijote");
        libro.setAñoPublicacion(1605);
        libro.devolver();

        Revista revista = new Revista(null, 0, null);
        revista.setTitulo("National Geographic");
        revista.setAñoPublicacion(1888);
        revista.devolver();

        libro.mostrarInformacion();
        revista.mostrarInformacion();

	}

}
