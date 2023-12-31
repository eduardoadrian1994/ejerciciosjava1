package ar.com.dypsa.Biblioteca.domain;

public abstract class ItemBiblioteca {
		
	protected String titulo;
    protected int aņoPublicacion;
    protected String estado;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAņoPublicacion() {
		return aņoPublicacion;
	}
	public void setAņoPublicacion(int aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ItemBiblioteca(String titulo, int aņoPublicacion, String estado) {
		super();
		this.titulo = titulo;
		this.aņoPublicacion = aņoPublicacion;
		this.estado = estado;
	}
	
	public abstract void prestar();
    public abstract void devolver();
    public abstract void mostrarInformacion();
	
}
