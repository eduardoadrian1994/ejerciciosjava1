package test;


import entidades.Perro; //importo mi objeto


public class AnimalMain { //comienza mi clase

	public static void main(String[] args) { //comienza mi metodo
	
		//invoco mi objeto
		Perro  perro1 = new Perro("lobo",12);
		//llamada entre mi objeto y metodo
		perro1.comer();
		
		perro1.ladrar();
	
	}//fin mi metodo

}//fin mi clase
