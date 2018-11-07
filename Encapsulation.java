package HoofdStuk3;
/*
Encapsulation is het private maken van een field, en met behulp van public methods, 
controle houden over wat er gebeurd wanneer je een field een nieuwe waarde wilt geven. 
*/

public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setLeeftijd(17); // omdat het onder de 18 is, wordt er 0 uitgeprint omdat op line16 de int op private staat.
		System.out.println(student.getLeeftijd());
		student.setLeeftijd(34); // 34 wordt uitgeprint omdat het groter dan 18 is.
		System.out.println(student.getLeeftijd());
	}
}

class Student {
	String naam;
	private int leeftijd;

	void setLeeftijd(int getal) { // ingevoerde getallen 17 en 34 wordt hierheen gebracht.
		if (getal > 18) { // hier wordt bepaald of het wel of niet true of false is.
			leeftijd = getal;
		}
	}

	int getLeeftijd() {
		return leeftijd;
	}
}