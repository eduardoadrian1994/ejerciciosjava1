package ar.com.dypsa.Biblioteca.domain;

public class Libro extends  ItemBiblioteca {

	public Libro(String titulo, int a�oPublicacion, String estado) {
		super(titulo, a�oPublicacion, estado);
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
        System.out.println("Libro: " + titulo + ", Año de Publicación: " + a�oPublicacion + ", Estado: " + estado);
}

}