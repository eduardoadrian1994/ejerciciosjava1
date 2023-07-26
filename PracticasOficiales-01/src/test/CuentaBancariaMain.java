package test;

import entidades.CuentaBancaria; //traigo mi objeto real que se paso a abstracto representado clase objeto en codigo.

import java.util.Scanner; //importa la funcion que atrapa los eventos por teclado 

public class CuentaBancariaMain { //inicio de la clase

	//aca se pude declarar variables globales
	
	public static void main(String[] args) {//inicio de metodo y dentro de {} es un codigo de bloque. local variables
		
		
		// invoco funcion que atrapa los eventos por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		//invoco al objeto
		
		CuentaBancaria cuentabancaria = new  CuentaBancaria();
		
		
		
		//pido el dato por teclado
		System.out.print("Introduce tu numero de cuenta bancaria: ");
		int númerodecuenta = teclado.nextInt();
		
		//me traigo la varaible y obtengo el dato por set que se introdujo por reclado
		
		cuentabancaria.setNÃºmerodecuenta(númerodecuenta);
				
		//muestro el dato que pido por telcado
		System.out.print("tu numero de cuenta es: " + cuentabancaria.getNÃºmerodecuenta());
				
		//muestro el estado de cuenta		
		System.out.print("\n"+"tu saldo es: " + cuentabancaria.getSaldoinicial());
		
		
		// inicio del metodo deposito
		
		//pido el dato por teclado
		System.out.print("\n"+"Introduce el monto a depositar: ");
		int depósitos = teclado.nextInt();
				
		//me traigo la varaible y obtengo el dato por set que se introdujo por teclado
				
		cuentabancaria.setDepósitos(depósitos);
		
		//me traigo la varaible y obtengo el dato por set que se introdujo por teclado
		cuentabancaria.setSaldoinicial(depósitos);

		
		//muestro el estado de cuenta
		System.out.print("\n"+"tu saldo es: " + cuentabancaria.getSaldoinicial());
		
		// fin del metodo deposito
		
		
		// inico del metodo retirar
		
		//pido el dato por teclado
		System.out.print("\n"+"Introduce el monto a retirar: ");
		int retiro = teclado.nextInt();
		
		
		//me traigo la varaible y obtengo el dato por set que se introdujo por teclado
		cuentabancaria.setRetirosdedinero(retiro);
		
	
		
		//muestro el estado de cuenta y resto dato de saldoinicial - el dato de retiro ademas de mostar el saldo de la cuenta. 
		System.out.print("\n"+"tu saldo es: " + (cuentabancaria.getSaldoinicial() - cuentabancaria.getRetirosdedinero()));
	
		
		// fin del metodo deposito
		
		
		//fin del escuchador del evento del teclado
		teclado.close();
	
	
	}//fin de metodo y dentro de {} es un codigo de bloque. local variables
	

}//find de la clase
