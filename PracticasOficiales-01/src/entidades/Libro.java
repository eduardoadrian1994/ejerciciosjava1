package entidades;

//creo mi objeto real a abstracto representandolo en este codigo

public class Libro {
	//variable iniciada tipo de entrada, tipo de dato, nombre de dato y sin atributo
	private String título;  
	private String Autor;
	
	//super clase/ metodo clase
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	//metodos  remplazar datos/atributos con set y obtener datos/atributos con get encapsulamiento
 	public String getTítulo() {
		return título;
	}


	public void setTítulo(String título) {
		this.título = título;
	}


	public String getAutor() {
		return Autor;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}
	
	

}
