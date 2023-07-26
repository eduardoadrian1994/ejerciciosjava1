package test;

import entidades.Rectangulo;

public class RectanguloConstructor{
	public static void main(String[] args) {
		Rectangulo Rectangulo1 = new Rectangulo();
		/*llamo a mi objeto Rectangulo y le agrego una clase*/
        Rectangulo1.setAncho(5);
        Rectangulo1.setAltura(10);
        /*uso get(obtener) dentro de set(remplazar) para asignarle un metodo(una instruccion)*/
        Rectangulo1.setPerimetro(Rectangulo1.getAncho()* Rectangulo1.getAltura()/2);
        Rectangulo1.setArea(Rectangulo1.getAncho()+ Rectangulo1.getAltura()+Rectangulo1.getPerimetro());
        System.out.println("Ancho:" + Rectangulo1.getAncho());
        System.out.println("altura: " + Rectangulo1.getAltura());
        System.out.println("Perimetro: " + Rectangulo1.getPerimetro());
        System.out.println("Area: " + Rectangulo1.getArea());
    }
}
