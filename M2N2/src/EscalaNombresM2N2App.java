import javax.swing.JOptionPane;

public class EscalaNombresM2N2App {

	public static void main(String[] args) {
		//Crea una aplicaci� que dibuixi una escala de nombres, sent cada l�nia nombres comen�ant en un i acabant en el nombre de la l�nia.
		
		//Demanem a l'usuari que introdueixi un n�mero per con�ixer quantes l�nies tindr� el programa, i l'emmagatzemem en una variable
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quants n�meros vols que tingui l'escala de nombres?"));
		
		String linies = "";	//Pintar� tantes l�nies com indiqui num
		
		for (int i = 1; i <= num; i++){
			String numeros = "";	//Omplir� cada l�nia amb un n�mero m�s que la l�nia anterior

            for (int j = 1; j <= i; j++){
            	numeros += (j);
            }
            linies += numeros + "\n";
		}
		
		System.out.println(linies);
	}

}
