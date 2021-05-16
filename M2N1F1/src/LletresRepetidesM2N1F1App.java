
public class LletresRepetidesM2N1F1App {

	public static void main(String[] args) {

		//Crear una taula (char[]) on cada posició correspon a una lletra del meu nom
		
		char[] nom = new char[8];
		
		nom[0] = 'P';
		nom[1] = 'a';
		nom[2] = 't';
		nom[3] = 'r';
		nom[4] = 'i';
		nom[5] = 'c';
		nom[6] = 'i';
		nom[7] = 'a';
		
		//Fer un bucle per recorrer la taula i mostrar per consola cadascuna de les lletres
		
		for (char c: nom) {		//Bucle For-each
		    System.out.println(c);
		}
	}
}
