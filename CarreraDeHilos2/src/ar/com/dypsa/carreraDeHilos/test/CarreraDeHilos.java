package ar.com.dypsa.carreraDeHilos.test;

public class CarreraDeHilos implements Runnable {
    // Declaramos las variables de instancia para el nombre del corredor, la posición de la línea de meta y la posición actual del corredor
    private String nombre;
    private int lineaDeMeta;
    private int posicionActual;

    // Constructor que recibe el nombre del corredor y la posición de la línea de meta
    public CarreraDeHilos(String nombre, int lineaDeMeta) {
        this.nombre = nombre;
        this.lineaDeMeta = lineaDeMeta;
        this.posicionActual = 0; // Inicializamos la posición actual del corredor en 0
    }

    // Método run que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Mientras la posición actual del corredor sea menor que la posición de la línea de meta
        while (posicionActual < lineaDeMeta) {
            // Generamos un avance aleatorio entre 0 y 9
            int avance = (int) (Math.random() * 10);
            // Actualizamos la posición actual del corredor sumando el avance
            posicionActual += avance;
            // Imprimimos un mensaje indicando el avance del corredor y su posición actual
            System.out.println(nombre + " avanza " + avance + " posiciones y está en la posición " + posicionActual);
            try {
                // Hacemos que el hilo duerma durante 1 segundo para simular el tiempo entre cada avance
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Cuando el corredor llega a la línea de meta, imprimimos un mensaje indicándolo
        System.out.println(nombre + " ha llegado a la línea de meta!");
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Creamos tres instancias de CarreraDeHilos para representar a tres corredores
        CarreraDeHilos corredor1 = new CarreraDeHilos("Corredor 1", 100);
        CarreraDeHilos corredor2 = new CarreraDeHilos("Corredor 2", 100);
        CarreraDeHilos corredor3 = new CarreraDeHilos("Corredor 3", 100);

        // Creamos tres hilos, uno para cada instancia de CarreraDeHilos
        Thread hilo1 = new Thread(corredor1);
        Thread hilo2 = new Thread(corredor2);
        Thread hilo3 = new Thread(corredor3);

        // Iniciamos los hilos para comenzar la carrera
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

