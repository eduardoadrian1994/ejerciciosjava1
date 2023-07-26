package entidades;

public class Fraccion {
	
	//atributos
	private double numerador;
	private double denominador;
	
	
	//metodos  remplazar set datos y obtener get datos
	
	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}

	public Fraccion(){
		
	}
	
	//incializacion del metodo
		public Fraccion(double numerador, double denominador){
				this.numerador = numerador;
				this.denominador = denominador;
				
			}
		
		
		//metodos
		//tipo de entrada
		//tipo de dato
		//nombre de dato
		public double sumar(Fraccion fraccion1,  Fraccion  fraccion2) {
			
			double resultado = (fraccion1.getNumerador()/fraccion1.getDenominador(	))+(fraccion2.getNumerador()/fraccion2.getDenominador());
			
			return resultado;
			
//			Fraccion nuevaFracion = new Fraccion();
//			
//			double nuevoNumerador = this.numerador * otraFraccion.denominador + this.denominador * otraFraccion.denominador;
//			
//			double nuevoDenominador = (this.numerador*otraFraccion.denominador)+(otraFraccion.numerador * this.denominador);
//			
//			return new Fraccion(nuevoNumerador, nuevoDenominador);		
			
		}
		
			public double resta(Fraccion fraccion1,  Fraccion  fraccion2) {
			
			double resultado = (fraccion1.getNumerador()/fraccion1.getDenominador())-(fraccion2.getNumerador()/fraccion2.getDenominador());
			
			return resultado;	
			
		}
			
			
			
		
		public double division(Fraccion fraccion1, Fraccion fraccion2) {
			
			double resultado = (fraccion1.getNumerador()/fraccion1.getDenominador())/(fraccion2.getNumerador()/fraccion2.getDenominador());
			
			return resultado;
			
			
		}
		
		
		
		public double multiplicar(Fraccion fraccion1, Fraccion  fraccion2) {
			
			double resultado =(fraccion1.getNumerador()/fraccion1.getDenominador())*(fraccion2.getNumerador()/fraccion2.getDenominador());
			
			return resultado;
		}
		
		
			
}
