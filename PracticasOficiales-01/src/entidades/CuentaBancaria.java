package entidades;

//creo mi objeto real a abstracto representandolo en este codigo

public class CuentaBancaria {
	//variable inicia sin dato y con tipo de entrada, tipo de dato y nombre;
	private int  númerodecuenta;
	private int  saldoinicial;
	private int  dep�sitos;
	private int  retirosdedinero;
	
	//superclase constructor para evitar errores
	public CuentaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metodos  remplazar set datos y obtener get datos encapsulamiento
	public int getNúmerodecuenta() {
		return númerodecuenta;
	}
	public void setNúmerodecuenta(int númerodecuenta) {
		this.númerodecuenta = númerodecuenta;
	}
	public int getSaldoinicial() {
		return saldoinicial;
	}
	public void setSaldoinicial(int saldoinicial) {
		this.saldoinicial = saldoinicial;
	}
	public int getDep�sitos() {
		return dep�sitos;
	}
	public void setDep�sitos(int dep�sitos) {
		this.dep�sitos = dep�sitos;
	}
	public int getRetirosdedinero() {
		return retirosdedinero;
	}
	public void setRetirosdedinero(int retirosdedinero) {
		this.retirosdedinero = retirosdedinero;
	}
	
	//incializacion del metodo 
			public CuentaBancaria(int númerodecuenta, int saldoinicial, int dep�sitos, int retirosdedinero){
			this.númerodecuenta = númerodecuenta;
			this.saldoinicial = saldoinicial;
			this.dep�sitos = dep�sitos;
			this.retirosdedinero = retirosdedinero;
			
		}
			
			//metodos
			//tipo de entrada
			//tipo de dato
			//nombre de dato
			
			public int depositar(CuentaBancaria dep�sitos, CuentaBancaria saldoinicial) {
				
				int resultado=(dep�sitos.getDep�sitos())+ saldoinicial.getSaldoinicial();
				
				return resultado;	
						
			}
			
			//metodos
			//tipo de entrada
			//tipo de dato
			//nombre de dato
			
			public int retiro(CuentaBancaria retirosdedinero, CuentaBancaria saldoinicial) {
			
			int resultado=(retirosdedinero.getRetirosdedinero()) - saldoinicial.getSaldoinicial();
				
				return resultado;
			}
}			