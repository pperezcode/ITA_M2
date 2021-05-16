import javax.swing.JOptionPane;

public class EscalaNombresM2N2App {

	public static void main(String[] args) {
		//Crea una aplicació que dibuixi una escala de nombres, sent cada línia nombres començant en un i acabant en el nombre de la línia.
		
		//Demanem a l'usuari que introdueixi un número per conèixer quantes línies tindrà el programa, i l'emmagatzemem en una variable
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quants números vols que tingui l'escala de nombres?"));
		
		String linies = "";	//Pintarà tantes línies com indiqui num
		
		for (int i = 1; i <= num; i++){
			String numeros = "";	//Omplirà cada línia amb un número més que la línia anterior

            for (int j = 1; j <= i; j++){
            	numeros += (j);
            }
            linies += numeros + "\n";
		}
		
		System.out.println(linies);
	}

}
