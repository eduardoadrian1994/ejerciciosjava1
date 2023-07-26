package multihilo0;

public class EjemploMultihilo extends Thread {
	
	    
	    public void run() {
	        System.out.println("Hilo en ejecuci�n: " + Thread.currentThread().getName());
	        // Realizar las tareas del hilo
	    }
	    
	    public static void main(String[] args) {
	        // Crear instancias de la clase EjemploMultihilo
	        EjemploMultihilo hilo1 = new EjemploMultihilo();
	        EjemploMultihilo hilo2 = new EjemploMultihilo();
	        
	        // Iniciar los hilos
	        hilo1.start();
	        hilo2.start();
	    }
	    
	    /*
	     * Este es un ejemplo de c�digo en Java que muestra c�mo crear y ejecutar
	     * m�ltiples hilos. La clase EjemploMultihilo extiende la clase Thread y
	     * sobrescribe el m�todo run() para definir las tareas que se ejecutar�n en el
	     * hilo. En el m�todo main, se crean dos instancias de la clase EjemploMultihilo
	     * y se inician los hilos llamando al m�todo start(). Cuando se ejecuta el
	     * programa, cada hilo imprimir� su nombre en la consola
	     * 
	     * El m�todo run() es un m�todo de la interfaz Runnable en Java que se utiliza
	     * para definir el c�digo que se ejecutar� cuando se inicie un hilo o se env�e
	     * una tarea a un ExecutorService.
	     * 
	     * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
		 * puede ejecutar en un hilo.
	     * 
	     * ExecutorService es una interfaz en Java que representa un servicio de
	     * ejecuci�n de tareas que puede programar la ejecuci�n de tareas en un pool de
	     * hilos.
	     * 
	     */
	}


