import java.util.*;
import javax.swing.JOptionPane;

public class LletresRepetidesM2N1F2App {

	public static void main(String[] args) {
			
		/*Crear una llista (List<Character>) on cada posici� correspon a una lletra del meu nom. Dues formes:
		 * List<String> laMevaLlista = new ArrayList<String>();
		 * ArrayList<String> laMevaLlista = new ArrayList<String>();
		 */
		
		ArrayList<Character> llista = new ArrayList<>();
		llista.add('P');
		llista.add('a');
		llista.add('t');
		llista.add('r');
		llista.add('i');
		llista.add('c');
		llista.add('i');
		llista.add('a');
		//llista.add(' ');	//Contemplo la possibilitat de que hi hagi un espai (nom compost)
		//llista.add('4');	//Contemplo la possibilitat de que hi hagi un n�mero

		
		/*Fer un bucle per rec�rrer la taula i mostrar per consola cadascuna de les lletres.
		 * Si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONANT�.
		 * Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�
		 */
		
		String text = "";
		for (int i = 0; i < llista.size(); i++) {
			
			if (Character.isDigit(llista.get(i))) {			//Validar si hi ha algun n�mero
				
				JOptionPane.showMessageDialog(null, "Els noms de persones no contenen n�meros!");	
				break;
			
			} else if (llista.get(i) == ' ') {				//Tenim en compte si hi ha espais (nom compost)
				
				text = " ";
				
			} else {
				
				String vocals = "aeiou";					//Validar si �s VOCAL/CONSONANT
				boolean esVocal = vocals.contains(String.valueOf(llista.get(i)).toLowerCase());
				
				if (esVocal) {
					text = llista.get(i) + " VOCAL";
				} else {
					text = llista.get(i) + " CONSONANT";
							
				}
			}
			
			System.out.println(text);		//Imprimim el resultat
			
		}	
	}
}

