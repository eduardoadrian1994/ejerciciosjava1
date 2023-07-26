package Main;

import java.util.Arrays;

public class ArraysArreglos {

	public static void main(String[] args) {
		// tipo de dato, nombre de la matris y en corchetes la cantidad que va a tener y tener en cuenta que se detiene atntes de llegar al mismo
		//ej 5 se detiene en el 4;
		//char vowels[]= new char[5];
		
		
		// a _ _ _ _
		//vowels[0] = 'a';
		//esto remplaza lo que contenga el array
		
		
		//vowels[1] = 'e';
		
		//vowels[2] = 'i';
		
		//vowels[3] = 'o';
	
		//vowels[4] = 'u';
		
		
		//para imprimir una posicion de una array 
		
		//System.out.println(vowels[0]);
		
		
		//cantidad de caracteres
		//char volwes[] = {'a','e','i','o','u'};
		
		
		//remplazo en la posicion de el arreglo
		//volwes[2]='x';
		
		// imprime lo que contenga
		//System.out.println(volwes);
		
		//imprime el numero de caracteres que conenga
		//System.out.println(volwes.length);
		
		
		//ordenamientos de contenidod de arreglo
		
		//char volwes[] = {'e','u','a','o','i'};
		
		//para arreglarlo 
		//Arrays.sort(volwes);
		
		//System.out.println(Arrays.toString(volwes));
	
		
		//ordenamiento por partes 
		
		//char volwes[] = {'e','u','a','o','i'};
		
		//ordenamiento inicial 
		
		//int startingIndex = 1;
		
		//int endingIndex = 4;
		
		//Arrays.sort(volwes, startingIndex, endingIndex);
		
		//System.out.println(Arrays.toString(volwes));
	
		
		//metodo de busqueda con array.binary metodo 
 		
		
			//char volwes[] = {'e','u','a','o','i'};
		
			//Arrays.sort(volwes);
			
			
			//int startingIndex = 1;
			
			//int endingIndex = 4;
			
			//busca lo que quieres encontrar
			//char key = 'o';
			
			
			// busca la posicion
			//int foundItemIndex = Arrays.binarySearch(volwes, startingIndex, endingIndex, key);
			
			
			
			//System.out.println(Arrays.toString(volwes));
		
			
			
			//devuelve la posicion
			//System.out.println(foundItemIndex); 
			
			
			//que pasa cuando no encuentras algo
		
			
			//char volwes[] = {'e','u','a','o','i'};
			
			//Arrays.sort(volwes);
			
			
			
			
			//char key = 'b';//si tira numeros negativos no existe
			
			
			//int foundItemIndex = Arrays.binarySearch(volwes, key);
			
			
			
			//System.out.println(Arrays.toString(volwes));
		
			
			//System.out.println(foundItemIndex); 
		
		
			
			//como usar fill para remplazar o ocultar
			
			//char volwes[] = {'e','u','a','o','i'};
			
			
			//esto marca desde donde inicia hasta donde termina el remplazo
			//int startingIndex = 1;
			
			//int endingIndex = 4;
			
			
			
			//Arrays.fill(volwes, startingIndex, endingIndex,'X');
		
			
			//System.out.println(Arrays.toString(volwes)); 
			
			
			//como hacer copias Arrays
		
			//int numbers[]= {1,2,3,4,5};
		
			//int copyOfNumbers[] = numbers;
			
			//Arrays.fill(numbers, 0);
			
			//System.out.println(Arrays.toString(numbers));
			
			
			//System.out.println(Arrays.toString(copyOfNumbers));
			
			
			//como hacer copias Arrays V2
			
			//int numbers[]= {1,2,3,4,5};
			
			//int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
			
			//Arrays.fill(numbers, 0);
			
			//System.out.println(Arrays.toString(numbers));
			
		
			//System.out.println(Arrays.toString(copyOfNumbers));
			
			
			//como hacer copias Arrays V3
			
			//int numbers[]= {1,2,3,4,5};
			
			// si agregamos un numero en el segundo copiara hasta dicho numero y si ponemos un numero mayor  
			
			//int copyOfNumbers[] = Arrays.copyOf(numbers, 10);
			
			//esto lo repmlazara por 0 como se ve en el fill
			
			//Arrays.fill(numbers, 0);
			
			//System.out.println(Arrays.toString(numbers));
			
			
			//System.out.println(Arrays.toString(copyOfNumbers));
			
			
			//como hacer copias Arrays por rango 
			
			//int numbers[]= {1,2,3,4,5};
			
			
			//int startingIndex = 1;
			
			//int endingIndex = 4; //tambien se puede poner numeros mayores y lo remplaza por 0 si estan vacios
			
			
			
			// copia por rango  
			
			//int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
			
			//esto lo repmlazara por 0 como se ve en el fill
			
			//Arrays.fill(numbers, 0);
			
			//System.out.println(Arrays.toString(numbers));
			
			
			//System.out.println(Arrays.toString(copyOfNumbers));
		
			
			//para saber si son iguales
		
		int numbers[]= {1,2,3,4,5};
		
		int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
			
		//System.out.println(numbers == copyOfNumbers); //devuelve falso
		
		System.out.println(Arrays.equals(numbers, copyOfNumbers)); //devuelve true
		
	}

}
