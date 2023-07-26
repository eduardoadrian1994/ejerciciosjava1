package ar.com.dypsa.ExcepcionesLista.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestPart1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Inserta el numero (o 'q' para terminar):");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                done = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + input + " no es un numero valido.");
                }
                //FINALLY
                //ACCIONES DE LIMPIEZA 
                //SOLO NECESARIOS EN CONECCIONES 
            }
           
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("la suma de todos los numeros es: " + sum);
        scanner.close();
	}

}
