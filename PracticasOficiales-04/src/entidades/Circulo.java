package entidades;

import entidades.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {

	private double radio;
	
	
	
	//super contructor
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor con parametros
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	//metodo interface
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
}
