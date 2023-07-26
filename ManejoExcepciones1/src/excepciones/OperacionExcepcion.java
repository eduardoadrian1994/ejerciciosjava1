package excepciones;

public class OperacionExcepcion extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
