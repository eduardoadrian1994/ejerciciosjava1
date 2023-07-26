package entidades;

import entidades.Humano;

public class Empleado extends Humano {
	
	 	private String nombre;
	    private int edad;
	    private Integer numeroDeEmpleado; 
	    
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

	    public Integer getNumeroDeEmpleado() {
	        return numeroDeEmpleado;
	    }

	    public void setNumeroDeEmpleado(Integer numeroDeEmpleado) {
	        this.numeroDeEmpleado = numeroDeEmpleado;
	    }
	    //super constructor vacio
	    public Empleado() {
	        super();
	    }

	    //constructor con parametros
	    public Empleado(String nombre, int edad, int numeroDeEmpleado) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.numeroDeEmpleado = numeroDeEmpleado;
	    }
	    //metodos
	    public void trabajando() {
	        System.out.println("El empleado está realizando su trabajo asignado");
	    }
	

}
