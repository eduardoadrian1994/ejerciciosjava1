package test;
import entidades.Persona;
/* importo perimero nombre de la carpeta y despues nombre del archivo(donde esta mi entidad/objeto)*/
public class PersonaMain {
	public static void main(String[] args) {
		/*llamo a mi objeto persona y le agrego una clase*/
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setGenero("Masculino");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
    }
}