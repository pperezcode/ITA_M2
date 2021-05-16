import java.util.ArrayList;

public class LletresRepetidesM2N1F4App {

	public static void main(String[] args) {
		/*Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra. Fusiona les dues llistes en una sola.
		 * A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname 
		 * i al acabar l’execució només tindrem una que es dirà fullName.
		 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
		 */ 
		
		//Creem una llista amb les lletres del meu nom		
		ArrayList<Character> nom = new ArrayList<>();
		nom.add('P');
		nom.add('a');
		nom.add('t');
		nom.add('r');
		nom.add('i');
		nom.add('c');
		nom.add('i');
		nom.add('a');
		
		//Creem una altra llista amb les lletres del meu cognom		
		ArrayList<Character> cognom = new ArrayList<>();
		cognom.add('P');
		cognom.add('é');
		cognom.add('r');
		cognom.add('e');
		cognom.add('z');
		
		//Creem la llista definitiva on afegirem la llista nom, l'espai i la llista cognom
		ArrayList<Character> fullName = new ArrayList<>();
		fullName.addAll(nom);
		fullName.add(' ');
		fullName.addAll(cognom);
		
		System.out.println("fullName: " + fullName	);
		
	}
}
