package multihilo1;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class multihilo {
	    
	    private static int contador = 0;
	    private static Lock lock = new ReentrantLock();
	    
	    public static void main(String[] args) {
	        // Crear un objeto compartido
	        ContadorRunnable contadorRunnable = new ContadorRunnable();
	        
	        // Crear múltiples hilos
	        Thread hilo1 = new Thread(contadorRunnable);
	        Thread hilo2 = new Thread(contadorRunnable);
	        
	        // Iniciar los hilos
	        hilo1.start();
	        hilo2.start();
	        
	        // Esperar a que los hilos terminen
	        try {
	            hilo1.join();
	            hilo2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        // Imprimir el resultado final del contador
	        System.out.println("Contador final: " + contador);
	    }
	    
	    static class ContadorRunnable implements Runnable {
	        
	        @Override
	        public void run() {
	            for (int i = 0; i < 10; i++) {
	                incrementarContador();
	            }
	        }
	        
	        private void incrementarContador() {
	            lock.lock(); // Adquirir el bloqueo
	            try {
	                contador++;
	            } finally {
	                lock.unlock(); // Liberar el bloqueo en caso de excepción
	            }
	        }
	    }
	
	    /*
		 * Este es un ejemplo de código en Java que muestra cómo sincronizar el acceso a
		 * un recurso compartido entre múltiples hilos utilizando un Lock. La clase
		 * multihilo define una variable estática contador y un objeto Lock para
		 * controlar el acceso a ella. En el método main, se crea un objeto
		 * ContadorRunnable que implementa la interfaz Runnable y se pasan dos
		 * instancias de este objeto a dos hilos diferentes. Cuando se inician los
		 * hilos, cada uno ejecutará el método run() del objeto ContadorRunnable, que
		 * incrementa el contador 10 veces. El método incrementarContador() utiliza el
		 * objeto Lock para asegurar que solo un hilo pueda acceder al contador a la
		 * vez. Al final, se imprime el valor final del contador.
		 * 
		 * 
		 * El método run() es un método de la interfaz Runnable en Java que se utiliza
		 * para definir el código que se ejecutará cuando se inicie un hilo o se envíe
		 * una tarea a un ExecutorService.
		 * 
		 * ExecutorService es una interfaz en Java que representa un servicio de
		 * ejecución de tareas que puede programar la ejecución de tareas en un pool de
		 * hilos.
		 * 
		 * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
		 * puede ejecutar en un hilo.
		 * 
		 * Lock es una interfaz en Java que proporciona un mecanismo de bloqueo más
		 * flexible que el uso de bloques synchronized para controlar el acceso a
		 * recursos compartidos entre múltiples hilos.
		 * 
		 * 
		 * 
		 */
	
}
