package entidades;

public class Rectangulo {
	private	int ancho;	
	private	int altura;
	private	int perimetro;
	private	int area;
	
	//se hace get(obtener) y set(remplazar) de los atributos para poder darles funciones
	
	public int getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
