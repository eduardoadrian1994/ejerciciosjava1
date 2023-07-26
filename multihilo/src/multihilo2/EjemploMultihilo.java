package multihilo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploMultihilo {
    
    public static void main(String[] args) {
        // Crear un ExecutorService con un pool de hilos fijo
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        // Enviar tareas para ejecutar en paralelo
        for (int i = 0; i < 10; i++) {
            Task tarea = new Task(i);
            executor.execute(tarea);
        }
        
        // Finalizar el ExecutorService
        executor.shutdown();
        
        try {
            // Esperar a que todas las tareas terminen
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Todas las tareas han terminado.");
    }
    
    static class Task implements Runnable {
        
        private int taskId;
        
        public Task(int taskId) {
            this.taskId = taskId;
        }
        
        @Override
        public void run() {
            System.out.println("Tarea " + taskId + " en ejecución en el hilo " + Thread.currentThread().getName());
            // Realizar las tareas de la tarea específica
        }
    }
    
    /*
	 * Este es un ejemplo de código en Java que muestra cómo utilizar un
	 * ExecutorService para ejecutar múltiples tareas en paralelo. La clase
	 * EjemploMultihilo define una clase interna Task que implementa la interfaz
	 * Runnable y sobrescribe el método run() para definir las tareas que se
	 * ejecutarán en cada tarea. En el método main, se crea un ExecutorService con
	 * un pool de hilos fijo de tamaño 5 y se envían 10 tareas para ejecutar en
	 * paralelo. Cuando se ejecuta el programa, cada tarea imprimirá su ID y el
	 * nombre del hilo en el que se está ejecutando. Al final, se finaliza el
	 * ExecutorService y se espera a que todas las tareas terminen antes de imprimir
	 * un mensaje indicando que todas las tareas han terminado
	 * 
	 * Runnable es una interfaz en Java que se utiliza para definir una tarea que se
	 * puede ejecutar en un hilo.
	 * 
	 * ExecutorService es una interfaz en Java que representa un servicio de
	 * ejecución de tareas que puede programar la ejecución de tareas en un pool de
	 * hilos.
	 *
	 * En el contexto de programación concurrente en Java, una tarea (Task)
	 * generalmente se refiere a una unidad de trabajo que se puede ejecutar en un
	 * hilo, y se puede representar como un objeto que implementa la interfaz
	 * Runnable o Callable.
	 * 
	 * 
	 * Callable es una interfaz en Java que se utiliza para definir una tarea que
	 * puede devolver un resultado y lanzar una excepción, y se puede ejecutar en un
	 * hilo o en un ExecutorService.
	 * 
	 */
}
