package entidades;

public class Empleado {
	
	//sus atributos con tipo de entrada, tipo de dato y nombre sin dato
	
	private String nombre;
	private int salario;
	
	
	//creo el constructor de mi metodo 
	
	public Empleado(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	//metdos con set y get encapsulamiento
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}
	

}
