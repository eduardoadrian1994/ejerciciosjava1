package Main;

import java.util.ArrayList;

//comparadodr de java
import java.util.Comparator;


public class ArrayLists {

	public static void main(String[] args) {
		
		//1.int 2.double 3.float 4.boolean
		// tipos de referencia delo arriba 1.Integer 2.Double 3.Float 4.Bolean
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		
		
		//numbers.add(1);
		//numbers.add(2);
		//numbers.add(3);
		//numbers.add(4);
		//numbers.add(5);
		//numbers.add(6);
		//numbers.add(7);
		//numbers.add(8);
		//numbers.add(9);
		//numbers.add(10);
		
		//tambien se puede eliminar elementos
		
		//numbers.remove(2);
		
		//elimina el numero que se le pasa
		//numbers.remove(Integer.valueOf(4));
		
		//eliminar todo
		//numbers.clear();
		
		//metodo para pasar datos y remplazar
		
		//numbers.set(2, Integer.valueOf(30));
		
		//System.out.println(numbers.toString());
		
		//System.out.println(numbers.get(2));
		
		
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		
		//sort es un comparador 
		//natural order ordena de menor a mayor
		//numbers.sort(Comparator.naturalOrder());
		
		//ordenar de reversa de mayor amenor
		//numbers.sort(Comparator.reverseOrder());
		
		//System.out.println(numbers.toString());
		
		//para saber el tamaño es:

		//System.out.println(numbers.size());
		
		//con contains evualamos is tiene el valor asignado
		//System.out.println(numbers.contains(Integer.valueOf(1)));//true
		
		//System.out.println(numbers.contains(Integer.valueOf(10)));//false
		
		//para preguntar si tiene algo
		// System.out.println(numbers.isEmpty());//false 
		
		//numbers.clear();
		
		//System.out.println(numbers.isEmpty());//true con numbers.clear();
		
		
		System.out.println("before: " + numbers.toString());
		
		
		//multiplicacion con forEach
		
		numbers.forEach(number->{
			numbers.set(numbers.indexOf(number),  number * 2);
		});
		
		
		//System.out.println(numbers.toString());
		
		System.out.println("after: "  + numbers.toString());
		
	}

}
