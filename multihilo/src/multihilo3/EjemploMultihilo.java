package multihilo3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EjemploMultihilo {
    
    public static void main(String[] args) {
        // Crear una cola de tama�o fijo para compartir entre el productor y el consumidor
        BlockingQueue<Integer> cola = new ArrayBlockingQueue<>(5);
        
        // Crear el productor y el consumidor
        Productor productor = new Productor(cola);
        Consumidor consumidor = new Consumidor(cola);
        
        // Iniciar el productor y el consumidor en hilos separados
        Thread hiloProductor = new Thread(productor);
        Thread hiloConsumidor = new Thread(consumidor);
        
        hiloProductor.start();
        hiloConsumidor.start();
    }
    
    static class Productor implements Runnable {
        
        private BlockingQueue<Integer> cola;
        
        public Productor(BlockingQueue<Integer> cola) {
            this.cola = cola;
        }
        
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    cola.put(i); // Agregar elementos a la cola (si est� llena, esperar� hasta que haya espacio)
                    System.out.println("Productor agreg�: " + i);
                    Thread.sleep(1000); // Esperar un segundo entre cada producci�n
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    static class Consumidor implements Runnable {
        
        private BlockingQueue<Integer> cola;
        
        public Consumidor(BlockingQueue<Integer> cola) {
            this.cola = cola;
        }
        
        @Override
        public void run() {
            try {
                while (true) {
                    int numero = cola.take(); // Obtener elementos de la cola (si est� vac�a, esperar� hasta que haya elementos)
                    System.out.println("Consumidor obtuvo: " + numero);
                    Thread.sleep(2000); // Esperar dos segundos entre cada consumo
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /*
	 * 
	 * Este es un ejemplo de c�digo en Java que muestra c�mo utilizar una
	 * BlockingQueue para implementar el patr�n de dise�o productor-consumidor. La
	 * clase EjemploMultihilo define dos clases internas, Productor y Consumidor,
	 * que implementan la interfaz Runnable y sobrescriben el m�todo run() para
	 * definir las tareas que se ejecutar�n en cada hilo. En el m�todo main, se crea
	 * una BlockingQueue de tama�o fijo y se pasan instancias de las clases
	 * Productor y Consumidor a dos hilos diferentes. Cuando se inician los hilos,
	 * el productor agregar� elementos a la cola y el consumidor los obtendr�. Si la
	 * cola est� llena, el productor esperar� hasta que haya espacio para agregar
	 * m�s elementos, y si la cola est� vac�a, el consumidor esperar� hasta que haya
	 * elementos para obtener.
	 * 
	 * 
	 * El m�todo run() es un m�todo de la interfaz Runnable en Java que se utiliza
	 * para definir el c�digo que se ejecutar� cuando se inicie un hilo o se env�e
	 * una tarea a un ExecutorService.
	 * 
	 * ExecutorService es una interfaz en Java que representa un servicio de
	 * ejecuci�n de tareas que puede programar la ejecuci�n de tareas en un pool de
	 * hilos.
	 * 
	 * BlockingQueue es una interfaz en Java que representa una cola de elementos
	 * que bloquea las operaciones de inserci�n y extracci�n cuando la cola est�
	 * llena o vac�a, respectivamente.
	 * 
	 * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
	 * puede ejecutar en un hilo.
	 * 
	 */
}