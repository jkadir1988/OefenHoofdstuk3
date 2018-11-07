package HoofdStuk3;

/* uitleg:
 * Initialiser blocks (alleen {}) komen static en non-static voor. 
 * static initialiser blocks worden uitgevoerd bij het laden van het programma. 
 * LET OP de volgorde. Declaratie moet voor initialisatie plaatsvinden. 
 * Non static initialiser blocks worden uitgevoerd, iedere keer als er een object wordt gemaakt. 
 * NOG VOOR de constructor. 
 * De volgorde is altijd van boven naar beneden. 
 * Methodes mogen al eerder aangeroepen worden, dan ze gedeclareerd zijn.
 */
public class InitStaticBlocksConstructors {

	public static void main(String[] args) {
		Gebouw gebouw = new Gebouw();
		/*
		 * volgorde van printen. 
		 * 1.static 
		 * 2.init 
		 * 3.constructor
		 * Maakt niet uit in welke volgorde deze in de code wordt geschreven
		 */

	}

}

class Gebouw {

	Gebouw(boolean a) {
		System.out.println("geprint in const. gebouw met boolean parameter");
	}

	Gebouw(int a) {
		System.out.println("geprint in const. gebouw met int parameter");
	}

	Gebouw() {
		System.out.println("geprint in const. gebouw zonder parameter");
	}

	{
		System.out.println("geprint in initblock");
	}

	static {
		System.out.println("geprint in static initblock");
	}

}