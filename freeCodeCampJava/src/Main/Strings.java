package Main;

public class Strings {
	
	public static void main(String[] args) {
		//los tipos de datos primitivos puede almacenar cualquier caracter Unicode en
		//este ejemplo el porcentanje almacenando 
		//char percentSign = '%';
		
		//System.out.println(percentSign);
		
		//para escribir una cadena de texto se hace asi:
		//String name="eduardo adrian lopez";
		
		//se puede imprimir como cualquier variable
		
		//System.out.println(name);
		
		// una nueva palabra clave se puede utilizar para crear un nuevo objeto a partir  de una clase
		//Ej
		//String name = new String ("edu");
		//en estecaso la estamos declarando como "esto" es aquello y como nuevo objeto
				
		//imprimimos el nuevo objeto
		
		//System.out.println(name);
		
		//cadenas de texto literales
		
		//String literalString1="abc";
		
		
		//String literalString2="abc";
		
		//objeto string
		
		//String ObjectStrign1 = new String("xyz");
		
		
		//String ObjectStrign2 = new String("xyz");
		
		//comparacion entre strings/cuerdas las cuerdas son iguales no se diferencian
		
		//System.out.println(literalString1 == literalString2);
		
		// al ser dos objetos diferentes no son iguales
		
		//por que estas usando "new" que genera una keyword/palabra clave con nombre del objeto
		
		//System.out.println(ObjectStrign1 == ObjectStrign2);
		
		//syso/od como imprimir algo entero
		//System.out.println("hello word! soy eduardo adrian lopez. soy de buenos aires argentina y tengo 28 años ");
		
		//como hacerlo por parte y en obejetos (dinamicos) modulo
		//String nombre = "eduardo adrian lopez";//%s
		
		//String pais = "Buenos aires argentina";//%s
		
		//int age = 28;//%d
		
		//String Company = "Dypsa";//%s
		
		//double gpa = 3.8;//%f
		
		//char percentSign = '%';//%c
		
		//boolean amITelllingTHeTruth = false;//%b
		
		//le podemos dar formato en modulos ej:
		
		//String  formattedString = String.format("mi nombre es %s. yo soy de %s. y tengo %d años. y trabajo para %s. Mi gpa es %f. yo obtuve 100%c en mi calses univesitarias. Esto es todo lo que %b reclama.", nombre, pais, age, Company, gpa, percentSign, amITelllingTHeTruth);
		
		//System.out.println("hello word! soy "+nombre+". soy de "+pais+" y tengo "+ age +" años y trabajo para " + Company+". ");
		
		
		//formato por modulos
		//System.out.println(formattedString);
		
		
		
		//String name = "Eduardo Adrian Lopez";
		
		// para contar caracteres y espacios(los espacios son tomados como caracteres)
		//System.out.println(name.length());//20
		
		
		// para saber si esta vacio // si esta vacio devuelve true
		//System.out.println(name.isEmpty());//false
		
		
		
		//devuelve las letras en mayúculas
		//System.out.println(name.toUpperCase());
		
		//devuelve las letras en minusculas
		//System.out.println(name.toLowerCase());
		
		
		
		//como usar equals
		
		//String string1 = new String("abc");
		
		//String string2 = new String("ABC");
		
		
		// esto compara los nombres y contenido
		//System.out.println(string1==string2);
		
		
		
		//compara el contenido de los dos objetos y no los nombres
		//System.out.println(string1.equals(string2));
		
		
		//ignora los casos que el contenido este en mayúscula o minuscula
		//System.out.println(string1.equalsIgnoreCase(string2));
				
		
		//remplazo de caracteres
		
		//String string = "El cielo es azul.";
		
		
		// para remplazar 
		//System.out.println(string.replace("azul", "rojo"));
		
		
		//para actualizar 
 		
		String string = "El cielo es azul.";
		
		//asi se actualiza
		//String  updateString = string.replace("azul", "rojo");
		//System.out.println(updateString);
		
		//comprobamos si  la cadena contiene la palabra
		
		System.out.println(string.contains("cielo"));
		
		
		
	}

}
