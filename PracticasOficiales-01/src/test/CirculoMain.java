package test;
import entidades.Circulo;
public class CirculoMain {
	public static void main(String[] args) {
		//inicializo objeto 
		Circulo circulo = new Circulo();
		//atributo
		circulo.setRadio(25);
		circulo.setPerimetro(circulo.getRadio()*2);
		circulo.setCircuferencia(calcularCircunferencia(circulo.getRadio()));
		System.out.println("el Radio es: " + circulo.getRadio());
		System.out.println("el perimetro es: " + circulo.getPerimetro());
		System.out.println("el circuferencia es: " + circulo.getCircuferencia());
		System.out.println("el area es:"+ calcularArea(circulo.getRadio()));
		
	}
	
	//metodos
	public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
