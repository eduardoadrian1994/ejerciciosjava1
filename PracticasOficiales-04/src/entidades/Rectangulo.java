package entidades;

import  entidades.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
	
	private	int base;
	
	private	int altura;
	
	
	//constructor con parametros
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	//super constructor
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//metodo interface
	@Override
	public double calcularPerimetro() {
		
		return (base*altura)/2;
	}
	
	@Override
	public double calcularArea() {
		
		return (base+altura+((base*altura)/2));
	}
	
	
}
