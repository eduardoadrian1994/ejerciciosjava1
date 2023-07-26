package entidades;
public class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
	//se hace get(obtener) y set(remplazar) de los atributos para poder darles funciones
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}

