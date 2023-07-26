package Ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultithreadingExample {
    private static final int NUM_THREADS = 4;
    private static final int NUM_ELEMENTS = 10;

    public static void main(String[] args) {
        // Crear lista de números
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= NUM_ELEMENTS; i++) {
            numbers.add(i);
        }

        // Crear un ExecutorService con un número fijo de hilos
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        // Dividir la lista de números en partes para que cada hilo procese una parte
        int batchSize = NUM_ELEMENTS / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * batchSize;
            int end = (i + 1) * batchSize;
            List<Integer> sublist = numbers.subList(start, end);

            // Ejecutar tarea de suma en un hilo separado
            executorService.submit(() -> {
                int sum = 0;
                for (int num : sublist) {
                    sum += num;
                }
                System.out.println("Suma parcial: " + sum);
            });
        }

        // Apagar el ExecutorService después de que se completen todas las tareas
        executorService.shutdown();

        try {
            // Esperar hasta que todas las tareas se completen o se agote el tiempo de espera
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas han finalizado.");

        // Calcular la suma total
        int totalSum = 0;
        for (int i = 1; i <= NUM_ELEMENTS; i++) {
            totalSum += i;
        }

        System.out.println("Suma total esperada: " + totalSum);
    }
}
