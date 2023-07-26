package ar.com.dypsa.Biblioteca.domain;

public class Libro extends  ItemBiblioteca {

	public Libro(String titulo, int añoPublicacion, String estado) {
		super(titulo, añoPublicacion, estado);
		// TODO Auto-generated constructor stub
	}
	
	public void prestar() {
        estado = "prestado";
    }

    
    public void devolver() {
        estado = "disponible";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + ", AÃ±o de PublicaciÃ³n: " + añoPublicacion + ", Estado: " + estado);
}

}