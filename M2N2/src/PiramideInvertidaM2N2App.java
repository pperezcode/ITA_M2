import javax.swing.JOptionPane;

public class PiramideInvertidaM2N2App {

	public static void main(String[] args) {
		//Crea una aplicaci� que dibuixi una pir�mide invertida d'asteriscs. Nosaltres li vam passar l'altura de la pir�mide per teclat.
		
		//Demanem a l'usuari que introdueixi un n�mero per con�ixer l'al�ada de la pir�mide, i l'emmagatzemem en una variable
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quina al�ada tindr� la teva pir�mide?"));
		
		//Variable per indicar el n�mero d'espais a pintar davant dels asteriscs
		int esp = 0;
		
		for (int i = 1; i < (num * 2); i = i + 2) {
			
			//Calculem n�mero d'asteriscs per l�nia
			int ast = (num * 2) - i ;
			
			//L�nia de text per a mostrar
			String text = "";
			
			//Afegim els espais necessaris
			for(int j = 0; j < esp; j++) {
				text = text + ' ';
			}
			
			//Augmentem un espai per la l�nia seg�ent
			esp = esp + 1;
			
			//Afegir asteriscs
			for(int j = 0; j < ast; j++) {
				text = text + '*';
			}
			
			//Pintem la pir�mide
			System.out.println(text);
		}		
	}
}
