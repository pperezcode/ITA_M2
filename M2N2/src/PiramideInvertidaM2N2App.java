import javax.swing.JOptionPane;

public class PiramideInvertidaM2N2App {

	public static void main(String[] args) {
		//Crea una aplicació que dibuixi una piràmide invertida d'asteriscs. Nosaltres li vam passar l'altura de la piràmide per teclat.
		
		//Demanem a l'usuari que introdueixi un número per conèixer l'alçada de la piràmide, i l'emmagatzemem en una variable
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quina alçada tindrà la teva piràmide?"));
		
		//Variable per indicar el número d'espais a pintar davant dels asteriscs
		int esp = 0;
		
		for (int i = 1; i < (num * 2); i = i + 2) {
			
			//Calculem número d'asteriscs per línia
			int ast = (num * 2) - i ;
			
			//Línia de text per a mostrar
			String text = "";
			
			//Afegim els espais necessaris
			for(int j = 0; j < esp; j++) {
				text = text + ' ';
			}
			
			//Augmentem un espai per la línia següent
			esp = esp + 1;
			
			//Afegir asteriscs
			for(int j = 0; j < ast; j++) {
				text = text + '*';
			}
			
			//Pintem la piràmide
			System.out.println(text);
		}		
	}
}
