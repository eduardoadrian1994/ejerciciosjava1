package ar.com.dypsa.Biblioteca.domain;

public class Revista  extends ItemBiblioteca{
	
	
    public Revista(String titulo, int a�oPublicacion, String estado) {
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
        System.out.println("Revista: " + titulo + ", Año de Publicación: " + a�oPublicacion + ", Estado: " + estado);
    }

}
