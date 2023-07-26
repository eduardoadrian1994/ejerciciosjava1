package entidades;

public class usuarios {

	public String nombre;
	public String email;
	public int numerotel;
	public String mensajeprivado;
	public String agregaramigos;
	public String publicarmensajes;
	public String comentar;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(int numerotel) {
		this.numerotel = numerotel;
	}
	public String getMensaje() {
		return mensajeprivado;
	}
	public void setMensaje(String mensaje) {
		this.mensajeprivado = mensaje;
	}
	public String getMensajeprivado() {
		return mensajeprivado;
	}
	public void setMensajeprivado(String mensajeprivado) {
		this.mensajeprivado = mensajeprivado;
	}
	public String getAgregaramigos() {
		return agregaramigos;
	}
	public void setAgregaramigos(String agregaramigos) {
		this.agregaramigos = agregaramigos;
	}
	
	public String getPublicarmensajes() {
		return publicarmensajes;
	}
	public void setPublicarmensajes(String publicarmensajes) {
		this.publicarmensajes = publicarmensajes;
	}
	public String getComentar() {
		return comentar;
	}
	public void setComentar(String comentar) {
		this.comentar = comentar;
	}
	public usuarios() {
		super();
		// TODO Auto-generated constructor stubS
	}

	public usuarios(String nombre, String email, int numerotel, String mensajeprivado, String  agregaramigos, String publicarmensajes, String comentar) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.numerotel = numerotel;
		this.mensajeprivado = mensajeprivado;
		this.agregaramigos = agregaramigos;
		this.publicarmensajes = publicarmensajes;
		this.comentar = comentar;
	}

	
	
}
