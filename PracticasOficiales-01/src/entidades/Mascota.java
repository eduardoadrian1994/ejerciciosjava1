package entidades;
//creo mi objeto real al abastracto y representado en codigo
public class Mascota {
	//sus atributos con tipo de entrada, tipo de dato y nombre sin dato
	private String nombre;
	private String raza;
	
	
	//creo el constructor de mi metodo
	public Mascota(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
