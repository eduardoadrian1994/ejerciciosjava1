package ar.com.dypsa.Set.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TestPart2 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        System.out.println("Lista en reversa orden: ");
        Collections.reverse(list);
        for (String item : list) {
            System.out.println(item);
        }

        Set<String> set = new HashSet<>(list);

        System.out.println("Set en ascendete orden: ");
        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        for (String item : sortedList) {
            System.out.println(item);
        }

	}

}
