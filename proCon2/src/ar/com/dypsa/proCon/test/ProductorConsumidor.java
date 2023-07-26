package ar.com.dypsa.proCon.test;

/*
 * implementa el problema del productor y consumidor utilizando Semaphores para la sincronizaci�n entre hilos. 
 * El c�digo est� en espa�ol para que puedas entender cada parte:
 * 
 */
//Importamos la clase Semaphore
import java.util.concurrent.Semaphore;

//Definimos la clase principal ProductorConsumidor
public class ProductorConsumidor {
	// Definimos el m�todo principal
	public static void main(String[] args) {
		// Creamos un objeto Buffer compartido con un tama�o m�ximo de 5 elementos
		Buffer bufferCompartido = new Buffer(5);
		// Creamos un hilo para el productor y le pasamos como argumento el buffer
		// compartido
		Thread productor = new Thread(new Productor(bufferCompartido));
		// Creamos un hilo para el consumidor y le pasamos como argumento el buffer
		// compartido
		Thread consumidor = new Thread(new Consumidor(bufferCompartido));
		// Iniciamos los dos hilos con el m�todo start
		productor.start();
		consumidor.start();
	}
}

//Definimos la clase Buffer que representa el b�fer compartido entre el productor y el consumidor
class Buffer {
	// Definimos un arreglo para almacenar los elementos del buffer
	private int[] buffer;
	// Definimos una variable para llevar la cuenta del �ndice actual del buffer
	private int indice;
	// Definimos tres Semaphores para la sincronizaci�n entre hilos
	private Semaphore semaforoLleno;
	private Semaphore semaforoVacio;
	private Semaphore mutex;

	// Definimos el constructor de la clase Buffer que recibe como argumento el
	// tama�o m�ximo del buffer
	public Buffer(int tamanio) {
		// Inicializamos el arreglo buffer con el tama�o especificado en el argumento
		// tamanio
		this.buffer = new int[tamanio];
		// Inicializamos la variable indice en 0
		this.indice = 0;
		// Inicializamos el sem�foro semaforoLleno en 0 para indicar que inicialmente el
		// buffer est� vac�o
		this.semaforoLleno = new Semaphore(0);
		// Inicializamos el sem�foro semaforoVacio en tamanio para indicar que
		// inicialmente hay tamanio espacios disponibles en el buffer
		this.semaforoVacio = new Semaphore(tamanio);
		// Inicializamos el sem�foro mutex en 1 para garantizar la exclusi�n mutua al
		// acceder a la secci�n cr�tica del c�digo
		this.mutex = new Semaphore(1);
	}

	// Definimos el m�todo agregar que agrega un elemento al buffer si no est� lleno
	// y notifica al consumidor que hay un elemento disponible
	public void agregar(int valor) {
		try {
			// Adquirimos un permiso del sem�foro semaforoVacio. Si no hay permisos
			// disponibles (es decir, si no hay espacios disponibles en el buffer),
			// esperamos hasta que haya uno disponible.
			semaforoVacio.acquire();
			// Adquirimos un permiso del sem�foro mutex para garantizar la exclusi�n mutua
			// al acceder a la secci�n cr�tica del c�digo.
			mutex.acquire();
			// Agregamos el elemento al buffer en la posici�n actual del �ndice y luego
			// incrementamos el �ndice en 1.
			buffer[indice++] = valor;
			System.out.println("Productor produjo: " + valor);
			// Liberamos un permiso del sem�foro mutex para permitir que otros hilos accedan
			// a la secci�n cr�tica del c�digo.
			mutex.release();
			// Liberamos un permiso del sem�foro semaforoLleno para indicar que hay un
			// elemento disponible en el buffer.
			semaforoLleno.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Definimos el m�todo quitar que quita un elemento del buffer si no est� vac�o
	// y notifica al productor que hay espacio disponible
	public int quitar() {
		int valor = 0;
		try {
			// Adquirimos un permiso del sem�foro semaforoLleno. Si no hay permisos
			// disponibles (es decir, si no hay elementos disponibles en el buffer),
			// esperamos hasta que haya uno disponible.
			semaforoLleno.acquire();
			// Adquirimos un permiso del sem�foro mutex para garantizar la exclusi�n mutua
			// al acceder a la secci�n cr�tica del c�digo.
			mutex.acquire();
			// Decrementamos en 1 el �ndice y luego quitamos un elemento del buffer en la
			// posici�n actual del �ndice y lo asignamos a la variable valor.
			valor = buffer[--indice];
			System.out.println("Consumidor consumi�: " + valor);
			// Liberamos un permiso del sem�foro mutex para permitir que otros hilos accedan
			// a la secci�n cr�tica del c�digo.
			mutex.release();
			// Liberamos un permiso del sem�foro semaforoVacio para indicar que hay un
			// espacio disponible en el buffer.
			semaforoVacio.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
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
			@SuppressWarnings("unused")
			int valor = buffer.quitar();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
 * Este programa crea un Buffer compartido con un tama�o m�ximo de 5 elementos.
 * Luego, se crean un hilo Productor y un hilo Consumidor que comparten el mismo
 * Buffer. El hilo Productor agrega elementos al Buffer mientras que el hilo
 * Consumidor los quita. Los m�todos agregar y quitar del Buffer utilizan tres
 * Semaphores para garantizar la sincronizaci�n adecuada entre los hilos.
 * 
 */
