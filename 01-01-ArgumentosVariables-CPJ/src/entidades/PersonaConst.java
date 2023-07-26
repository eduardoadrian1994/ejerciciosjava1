package entidades;


public class PersonaConst {
	int   edad;
	String nombre;
	String genero;
	
public PersonaConst() {
		
	}

	
public PersonaConst(int edad, String nombre, String genero){
	this.edad = edad;
	this.nombre = nombre;
	this.genero = genero;
	
}
public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


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


@Override
//toString tus datos lo voya demostrar de esta manera
public String toString() {
	return "PersonaConst [edad=" + edad + ", nombre=" + nombre + ", genero=" + genero + "]";
}

}
