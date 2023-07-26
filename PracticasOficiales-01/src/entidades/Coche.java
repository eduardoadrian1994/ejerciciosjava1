package entidades;
//creo mi objeto real a abstracto representandolo en este codigo
public class Coche {
	//variable iniciada tipo de entrada, tipo de dato, nombre de dato y sin atributo
	private String marca;
	private String modelo;
	
	
	//super clase/ metodo clase
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metodos  remplazar datos/atributos con set y obtener datos/atributos	con get encapsulamiento
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
