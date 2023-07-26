package ar.com.dypsa.proCon.test;

//el problema del productor y consumidor utilizando Locks y Conditions para la sincronización entre hilos.
//Importamos las clases necesarias para utilizar Locks y Conditions
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//Importamos las clases necesarias para utilizar una cola
import java.util.LinkedList;
import java.util.Queue;

//Definimos la clase principal ProductorConsumidor
public class ProductorConsumidor {
	// Definimos el método principal
	public static void main(String[] args) {
		// Creamos un objeto Buffer compartido con un tamaño máximo de 5 elementos
		Buffer bufferCompartido = new Buffer(5);
		// Creamos un hilo para el productor y le pasamos como argumento el buffer
		// compartido
		Thread productor = new Thread(new Productor(bufferCompartido));
		// Creamos un hilo para el consumidor y le pasamos como argumento el buffer
		// compartido
		Thread consumidor = new Thread(new Consumidor(bufferCompartido));
		// Iniciamos los dos hilos con el método start
		productor.start();
		consumidor.start();
	}
}

//Definimos la clase Buffer que representa el búfer compartido entre el productor y el consumidor
class Buffer {
	// Definimos una cola para almacenar los elementos
	private Queue<Integer> cola;
	// Definimos una variable para almacenar el tamaño máximo del buffer
	private int maxTamanio;
	// Definimos un Lock para garantizar la sincronización entre hilos
	private Lock bloqueo = new ReentrantLock();
	// Definimos dos Conditions para la sincronización entre hilos
	private Condition noLleno = bloqueo.newCondition();
	private Condition noVacio = bloqueo.newCondition();

	// Definimos el constructor de la clase Buffer que recibe como argumento el
	// tamaño máximo del buffer
	public Buffer(int maxTamanio) {
		// Inicializamos la cola como una LinkedList vacía
		this.cola = new LinkedList<>();
		// Asignamos el valor del argumento maxTamanio a la variable maxTamanio de la
		// clase
		this.maxTamanio = maxTamanio;
	}

	// Definimos el método agregar que agrega un elemento al buffer si o no está lleno
	// y notifica al consumidor que hay un elemento disponible
	public void agregar(int valor) {
		// Bloqueamos el acceso a esta sección crítica con el método lock del objeto
		// bloqueo
		bloqueo.lock();
		try {
			// Si la cola está llena, esperamos hasta que haya espacio disponible utilizando
			// el método await de la Condition noLleno
			while (cola.size() == maxTamanio) {
				noLleno.await();
			}
			// Agregamos el elemento a la cola utilizando el método add de la cola
			cola.add(valor);
			// Notificamos al consumidor que hay un elemento disponible utilizando el método
			// signalAll de la Condition noVacio
			noVacio.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Desbloqueamos el acceso a esta sección crítica con el método unlock del
			// objeto bloqueo
			bloqueo.unlock();
		}
	}

	// Definimos el método quitar que quita un elemento del buffer si no está vacío
	// y notifica al productor que hay espacio disponible
	public int quitar() {
		int valor = 0;
		// Bloqueamos el acceso a esta sección crítica con el método lock del objeto
		// bloqueo
		bloqueo.lock();
		try {
			// Si la cola está vacía, esperamos hasta que haya un elemento disponible
			// utilizando el método await de la Condition noVacio
			while (cola.isEmpty()) {
				noVacio.await();
			}
			// Quitamos un elemento de la cola utilizando el método remove de la cola y lo
			// asignamos a la variable valor
			valor = cola.remove();
			// Notificamos al productor que hay espacio disponible utilizando el método
			// signalAll de la Condition noLleno
			noLleno.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Desbloqueamos el acceso a esta sección crítica con el método unlock del
			// objeto bloqueo
			bloqueo.unlock();
		}
		return valor;
	}
}

//Definimos la clase Productor que implementa la interfaz Runnable para poder ejecutarse en un hilo separado
class Productor implements Runnable {
	private Buffer buffer;

	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			buffer.agregar(i);
			System.out.println("Productor produjo: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//Definimos la clase Consumidor que implementa la interfaz Runnable para poder ejecutarse en un hilo separado
class Consumidor implements Runnable {
	private Buffer buffer;

	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			int valor = buffer.quitar();
			System.out.println("Consumidor consumió: " + valor);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * Este programa crea un Buffer compartido con un tamaño máximo de 5 elementos.
 * Luego, se crean un hilo Productor y un hilo Consumidor que comparten el mismo
 * Buffer. El hilo Productor agrega elementos al Buffer mientras que el hilo
 * Consumidor los quita. Los métodos agregar y quitar del Buffer utilizan un
 * Lock y dos Conditions para garantizar la sincronización adecuada entre los
 * hilos.
 */
