package entidades;

// creo mi clase real al abastracto y representado en codigo
public class Animal {
//sus atributos con tipo de entrada, tipo de dato y nombre sin dato
	private String nombre;
	private int edad;
	
	//creo el constructor de mi metodo 
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//metdos con set y get encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//metodo
	public void comer() {
		System.out.println("El Animal esta comiendo.");
	}
	
	
}
 
