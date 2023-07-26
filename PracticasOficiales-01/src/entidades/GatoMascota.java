package entidades;


public class GatoMascota extends Mascota {

	public GatoMascota(String nombre, String raza) {
		super(nombre, raza);
		// TODO Auto-generated constructor stub
	}

	public void Maullar() {
		System.out.println("El gato esta maullando.");
	}
	
	public void Pensamiento() {
		System.out.println("Ese perrote no va alograr burlarse de este gatito.");
	}
	
	
	
}