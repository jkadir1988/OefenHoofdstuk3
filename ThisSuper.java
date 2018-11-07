package HoofdStuk3;

public class ThisSuper {

	public static void main(String[] args) {

		Hond hond = new Hond();
		Herdershond hh = new Herdershond();

		/*
		 * output van hierboven 
		 * in static initblocks 					// HOND eerste via de parent
		 * in initblocks HOND 						// tweede via de parent
		 * in constructor Hond 						// derde via de parent
		 * in static initblocks HERDERSHOND 		// eerste via de child
		 * in initblocks HOND 						//terug naar de parent
		 * in constructor Hond 						//terug naar de parent
		 * in initblocks HERDERSHOND 				//daarna de init in de child
		 * in constructor HerdersHond 				// daarna de constructor in de child
		 */
		/* uitleg:
		 * Initialiser blocks (alleen {}) komen static en non-static voor. 
		 * static initialiser blocks worden uitgevoerd bij het laden van het programma. 
		 * LET OP de volgorde. Declaratie moet voor initialisatie plaatsvinden. 
		 * Non static initialiser blocks worden uitgevoerd, iedere keer als er een object wordt gemaakt. 
		 * NOG VOOR de constructor. 
		 * De volgorde is altijd van boven naar beneden. 
		 * Methodes mogen al eerder aangeroepen worden, dan ze gedeclareerd zijn.
		 */

		System.out.println("***andere shit***");
		Hond.p = 9; // Aanroepen van KlasseNaam.variable met een static modifier
		hond.naam("iets");
		System.out.println(hond.naam); // argumenten aan de aanroepende kant. Parameters van zijn methode zijn lokale
										// variabelen.

		System.out.println(Hond.aantalPotenIs8()); // hier wordt 4 geprint
	}

}

class Hond {
	int a;
	static int p = 3; // aanroepen op line 32.
	String naam; // Een field mag dezelfde naam hebben als een methode.
	

	void naam(String naam) {// Methoden kunnen variabelen 'meekrijgen', tussen de haakjes. Dit worden
							// parameters aan de definierende kant genoemd,
		this.naam = "Pietje";
	}

	void halen(int a) {
		this.a = 7; // this.a verwijst naar de field.
		this.kopen();// het oproepen van een andere methode
	}

	void kopen() {
		this.halen(6); // het oproepen van een andere methode
	}
	{
		System.out.println("in initblocks HOND"); // ***deze zal als eerst printen
	}
	static {
		System.out.println("in static initblocks HOND"); // ***deze zal als eerst printen
	}

	Hond() {
		System.out.println("in constructor Hond");

	}

	static int aantalPotenIs8() { // deze methode returned een 4, al staat er 8 in de naam van de methode
		return 4; // Hetgeen dat gereturned wordt MOET een covariant van het returntype zijn.
	}
}

class Herdershond extends Hond {
	Herdershond() { // constructor overloaded
		this("sdf"); // Met this.methodenaam() roep je vanuit de ene methode, een andere methode aan
						// in het object.
		System.out.println("in constructor HerdersHond");
	}

	{
		System.out.println("in initblocks HERDERSHOND");
	}
	static {
		System.out.println("in static initblocks HERDERSHOND"); // ***deze zal als eerst printen
	}

	Herdershond(String a) { // constructor overloaded, dezelfde naam als de class en met line 79, andere
							// signature (Signature is het aantal en de typen parameters)
		super(); // deze super verwijst naar de Constructor Hond op line 68
	}

	void rennen() { // Overloading

	}

	void rennen(int aantalKMpU) {// Overloading

	}

	void rennen(int aantalStappen, int hoeveelheidPoten) {// Overloading

	}
}
