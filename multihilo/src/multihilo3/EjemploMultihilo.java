package multihilo3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EjemploMultihilo {
    
    public static void main(String[] args) {
        // Crear una cola de tamaño fijo para compartir entre el productor y el consumidor
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
                    cola.put(i); // Agregar elementos a la cola (si está llena, esperará hasta que haya espacio)
                    System.out.println("Productor agregó: " + i);
                    Thread.sleep(1000); // Esperar un segundo entre cada producción
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
                    int numero = cola.take(); // Obtener elementos de la cola (si está vacía, esperará hasta que haya elementos)
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
	 * Este es un ejemplo de código en Java que muestra cómo utilizar una
	 * BlockingQueue para implementar el patrón de diseño productor-consumidor. La
	 * clase EjemploMultihilo define dos clases internas, Productor y Consumidor,
	 * que implementan la interfaz Runnable y sobrescriben el método run() para
	 * definir las tareas que se ejecutarán en cada hilo. En el método main, se crea
	 * una BlockingQueue de tamaño fijo y se pasan instancias de las clases
	 * Productor y Consumidor a dos hilos diferentes. Cuando se inician los hilos,
	 * el productor agregará elementos a la cola y el consumidor los obtendrá. Si la
	 * cola está llena, el productor esperará hasta que haya espacio para agregar
	 * más elementos, y si la cola está vacía, el consumidor esperará hasta que haya
	 * elementos para obtener.
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
	 * BlockingQueue es una interfaz en Java que representa una cola de elementos
	 * que bloquea las operaciones de inserción y extracción cuando la cola está
	 * llena o vacía, respectivamente.
	 * 
	 * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
	 * puede ejecutar en un hilo.
	 * 
	 */
}