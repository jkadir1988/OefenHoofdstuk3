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
public class InitStaticBlocksConstructorsInheritance {

	public static void main(String[] args) {
		System.out.println("========HetGebouw = HetGebouw============");
		HetGebouw hg = new HetGebouw();
		System.out.println("\n========KleinGebouw = KleinGebouw============");
		KleinGebouw kg = new KleinGebouw();
		System.out.println("\n========NogKleinerGebouw = NogKleinerGebouw============");
		NogKleinerGebouw nkg = new NogKleinerGebouw();
		System.out.println("\n========HetGebouw = KleinGebouw============");
		HetGebouw hg2 = new KleinGebouw();
		System.out.println("\n========HetGebouw = NogKleinerGebouw============");
		HetGebouw hg3 = new NogKleinerGebouw();
		System.out.println("\n========KleinerGebouw = NogKleinerGebouw============");
		KleinGebouw kg2 = new NogKleinerGebouw();
		System.out.println("\n====================");
	}

}

class HetGebouw {
	HetGebouw() { // 1
		System.out.println("geprint in const. het gebouw zonder parameter");
	}

	{ // 2
		System.out.println("geprint in initblock het gebouw");
	}

	static { // 3
		System.out.println("geprint in static initblock het gebouw");
	}

}

class KleinGebouw extends HetGebouw {
	KleinGebouw() { // 1
		System.out.println("geprint in const. kleingebouw zonder parameter");
	}

	{ // 2
		System.out.println("geprint in initblock kleingebouw");
	}

	static { // 3
		System.out.println("geprint in static initblock kleingebouw");
	}

}

class NogKleinerGebouw extends KleinGebouw {
	NogKleinerGebouw() { // 1
		System.out.println("geprint in const. nog kleinergebouw zonder parameter");
	}

	{ // 2
		System.out.println("geprint in initblock nog kleinergebouw");
	}

	static { // 3
		System.out.println("geprint in static initblock nog kleiner gebouw");
	}

}
