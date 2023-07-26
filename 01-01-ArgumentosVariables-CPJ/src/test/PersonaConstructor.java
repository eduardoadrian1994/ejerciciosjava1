package test;
import entidades.PersonaConst;
public class PersonaConstructor {
	public static void main(String[] args) {
		PersonaConst p1 = new PersonaConst(28,"matias","masculino");
		PersonaConst p2 = new PersonaConst(5,"maria","femenino");
		System.out.println("persona 1"+p1.toString());
		System.out.println("persona 2"+p2.toString());
    }
}
