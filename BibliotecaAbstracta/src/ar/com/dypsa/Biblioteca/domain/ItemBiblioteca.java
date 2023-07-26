package ar.com.dypsa.Biblioteca.domain;

public abstract class ItemBiblioteca {
		
	protected String titulo;
    protected int añoPublicacion;
    protected String estado;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ItemBiblioteca(String titulo, int añoPublicacion, String estado) {
		super();
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.estado = estado;
	}
	
	public abstract void prestar();
    public abstract void devolver();
    public abstract void mostrarInformacion();
	
}
