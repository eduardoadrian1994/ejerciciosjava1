package ar.com.dypsa.Biblioteca.domain;

public abstract class ItemBiblioteca {
		
	protected String titulo;
    protected int a�oPublicacion;
    protected String estado;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getA�oPublicacion() {
		return a�oPublicacion;
	}
	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ItemBiblioteca(String titulo, int a�oPublicacion, String estado) {
		super();
		this.titulo = titulo;
		this.a�oPublicacion = a�oPublicacion;
		this.estado = estado;
	}
	
	public abstract void prestar();
    public abstract void devolver();
    public abstract void mostrarInformacion();
	
}
