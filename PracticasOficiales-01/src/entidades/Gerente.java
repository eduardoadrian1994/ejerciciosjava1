package entidades;
//creo mi clase real al abastracto y representado en codigo
//extiendo la clase hija del padre
public class Gerente extends Empleado {
	//creo el constructor de mi metodo 
	public Gerente(String nombre, int salario) {
		super(nombre, salario);
		// TODO Auto-generated constructor stub
	}
	//metodos
	public void bonificaciones(int salario) {
		 salario = salario * 5;
		System.out.println("Gretente recibe redito por presionar a sus trabajadores "+ salario + " pero se gana el odio de sus programadores");
	}
	
	public void aumento(int salario) {
		salario = salario * 2;
		System.out.println("Gretente recibe aumento por llevarse el credito "+ salario +" te ganaste enemigos en la sombra yo que tu me cuido");
	}
}