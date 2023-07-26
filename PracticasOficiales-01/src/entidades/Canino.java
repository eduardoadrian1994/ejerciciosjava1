package entidades;

public class Canino {
		
	//variable inicia sin dato 
		private String nombre;
		private String apellido;
		private String raza;
		private String tamaño;
		private int edad;
		private int peso;
		
		//super clase/ metodo clase para que no genere errores
		public Canino() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//metodos  remplazar set y obtener get encapsulamiento
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getRaza() {
			return raza;
		}
		public void setRaza(String raza) {
			this.raza = raza;
		}
		public String getTamaño() {
			return tamaño;
		}
		public void setTamaño(String tamaño) {
			this.tamaño = tamaño;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public int getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		
}
