package main;

import entidades.FiguraGeometrica;

import entidades.Circulo;

import entidades.Rectangulo;

public class FigurasGeometricasMain {

	public static void main(String[] args) {
		
		FiguraGeometrica circulo = new Circulo();
		
		circulo.calcularArea();
		
		circulo.calcularPerimetro();
		
		circulo = new Circulo(10);
		
		System.out.println("el area del circulo: " + circulo.calcularArea());
		
		System.out.println("el perimetro del circulo: " + circulo.calcularPerimetro());
		
		
		FiguraGeometrica rectangulo = new Rectangulo();
		
		rectangulo.calcularArea();
		
		rectangulo.calcularPerimetro();
		
		rectangulo = new Rectangulo(5,10);
		
		System.out.println("el area del rectangulo: " + rectangulo.calcularArea());
		
		System.out.println("el perimetro del rectangulo: " + rectangulo.calcularPerimetro());
	}

}
