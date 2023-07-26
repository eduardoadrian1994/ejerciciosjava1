package multihilo0;

public class EjemploMultihilo extends Thread {
	
	    
	    public void run() {
	        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
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
	     * Este es un ejemplo de código en Java que muestra cómo crear y ejecutar
	     * múltiples hilos. La clase EjemploMultihilo extiende la clase Thread y
	     * sobrescribe el método run() para definir las tareas que se ejecutarán en el
	     * hilo. En el método main, se crean dos instancias de la clase EjemploMultihilo
	     * y se inician los hilos llamando al método start(). Cuando se ejecuta el
	     * programa, cada hilo imprimirá su nombre en la consola
	     * 
	     * El método run() es un método de la interfaz Runnable en Java que se utiliza
	     * para definir el código que se ejecutará cuando se inicie un hilo o se envíe
	     * una tarea a un ExecutorService.
	     * 
	     * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
		 * puede ejecutar en un hilo.
	     * 
	     * ExecutorService es una interfaz en Java que representa un servicio de
	     * ejecución de tareas que puede programar la ejecución de tareas en un pool de
	     * hilos.
	     * 
	     */
	}


