package entidades;

//creo mi objeto real a abstracto representandolo en este codigo

public class CuentaBancaria {
	//variable inicia sin dato y con tipo de entrada, tipo de dato y nombre;
	private int  nÃºmerodecuenta;
	private int  saldoinicial;
	private int  depósitos;
	private int  retirosdedinero;
	
	//superclase constructor para evitar errores
	public CuentaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metodos  remplazar set datos y obtener get datos encapsulamiento
	public int getNÃºmerodecuenta() {
		return nÃºmerodecuenta;
	}
	public void setNÃºmerodecuenta(int nÃºmerodecuenta) {
		this.nÃºmerodecuenta = nÃºmerodecuenta;
	}
	public int getSaldoinicial() {
		return saldoinicial;
	}
	public void setSaldoinicial(int saldoinicial) {
		this.saldoinicial = saldoinicial;
	}
	public int getDepósitos() {
		return depósitos;
	}
	public void setDepósitos(int depósitos) {
		this.depósitos = depósitos;
	}
	public int getRetirosdedinero() {
		return retirosdedinero;
	}
	public void setRetirosdedinero(int retirosdedinero) {
		this.retirosdedinero = retirosdedinero;
	}
	
	//incializacion del metodo 
			public CuentaBancaria(int nÃºmerodecuenta, int saldoinicial, int depósitos, int retirosdedinero){
			this.nÃºmerodecuenta = nÃºmerodecuenta;
			this.saldoinicial = saldoinicial;
			this.depósitos = depósitos;
			this.retirosdedinero = retirosdedinero;
			
		}
			
			//metodos
			//tipo de entrada
			//tipo de dato
			//nombre de dato
			
			public int depositar(CuentaBancaria depósitos, CuentaBancaria saldoinicial) {
				
				int resultado=(depósitos.getDepósitos())+ saldoinicial.getSaldoinicial();
				
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