package Main;


import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();
		
		
		examScores.put("Matematicas", 75);
		
		examScores.put("Sociologia", 85);
		
		examScores.put("English", 85);
		
		examScores.put("español", 100);
		
		examScores.put("computacion programacion", 100);
		
		
		//examScores.clear();
		
		
		//examScores.putIfAbsent("Matematicas", 70);
		
		
		//remplaza
		//examScores.replace("Matematicas", 70);
		
		
		//System.out.println(examScores.toString());

		
		//como obtner datos por get
		//System.out.println(examScores.get("English"));
		
		//System.out.println(examScores.getOrDefault("Religion",-1));
		
		//System.out.println(examScores.toString());
		
		
		//System.out.println(examScores.size());
		
		//examScores.remove("Sociologia");
		
		//System.out.println(examScores.toString());
		
		//comprobar is lo tiene
		//System.out.println(examScores.containsKey("Matematicas"));//true
		
		//System.out.println(examScores.containsValue(100));
		
		//System.out.println(examScores.containsValue(Integer.valueOf(100)));
		
		
		
		//para saber si esta vacio 
		
		/*System.out.println(examScores.isEmpty());//false */
		
		examScores.forEach((subject, score) ->{
			
			examScores.replace(subject, score - 10);
			
			
			//System.out.println(subject + "-" + score);
		});
		
		System.out.println(examScores.toString());
		
	}

}
