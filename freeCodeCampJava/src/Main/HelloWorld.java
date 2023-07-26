package Main;

//el codigo dentro de un conjunto de llaves es conocido como un bloque de codigo

//
public class HelloWorld {// maraca el incio de clase

	//tambien se puede declarar variables fuera del metodo
	//como aqui en hola mundo bloque
	//si ahcemos esto la variable estara disponible dentro de toda la calse para  usar
	//dentro de toda del metodo principal
	//tendra que ser estatitico
	//ej static int age = 27;
	//si delacro una variable vacia ej static int age;
	//el compilador le asignara un valor predeterminado pero para los numeros es siempre 0
	
	
	public static void main(String[] args) { //mcara el inicio del método principal 
		//ya que el metodo esta dentro hola clase mundial y  cualquier variable que declares
		//dentro del metoddo sera solo disponible dentro del metodo
		//esto se le llama variables locales
		
		
		System.out.println("hello world");

	}//marca el final del método principal

}//marca el final de la clase
