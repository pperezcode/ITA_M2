import java.util.*;

public class LletresRepetidesM2N1F3App {

	public static void main(String[] args) {

		//Creem una llista amb les lletres del meu nom		
		ArrayList<Character> llista = new ArrayList<>();
		
		llista.add('P');
		llista.add('a');
		llista.add('t');
		llista.add('r');
		llista.add('i');
		llista.add('c');
		llista.add('i');
		llista.add('a');
		
		
		//Per emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen, creem el Map(clau, valor)	
		Map<Character,Integer> nom = new HashMap<Character,Integer>();	
				

		//Per omplir el Map, necessito les diferents lletres del meu nom (clau) i quantes vegades apareixen (valor)		
		for (int i = 0; i < llista.size(); i++ ) {		//Selecciono cadascuna de les lletres
			char lletra = llista.get(i);
			
			if (!nom.containsKey(lletra)) {		//Comprovo si aquesta clau ja ha estat introduïda
				
				int comptador = 0;
				for (int j = 0; j < llista.size(); j++) {		//Compto quantes vegades apareix
					if (lletra == llista.get(j)) {
						comptador++;
					}
				}
				
				nom.put(lletra, comptador);		//Afegeixo clau i valor al Map nom
				
			} else {
				continue;
			}
		}
		
		
		//Mostrem les claus i els valors del Map amb un iterador		
		Iterator<Character> it = nom.keySet().iterator();		
		while(it.hasNext()){			
		  Character key = it.next();
		  System.out.println("clau='" + key + "', valor=" + (Integer) nom.get(key));
		}
	}
}
