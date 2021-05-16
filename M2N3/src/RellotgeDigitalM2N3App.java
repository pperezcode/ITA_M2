import java.util.Calendar;

public class RellotgeDigitalM2N3App {
	
	public static void main(String[] args) {
		
		try {
			//Crear les variables a partir de l'hora del sistema.
			Calendar calendario = Calendar.getInstance();
			int hora =calendario.get(Calendar.HOUR_OF_DAY);
			int minut = calendario.get(Calendar.MINUTE);
			int segon = calendario.get(Calendar.SECOND);
			
			//Comencem el comptador de segons, minuts i hores, i fem que el bucle sigui infinit 
			for (int i = 0; i >= 0; i ++) {
				if (segon < 59) {
					segon++;
				} else {
					segon = 00;
					if (minut < 59) {
						minut++;
					} else {
						minut = 00;
						if (hora < 23) {
							hora++;
						} else {
							hora = 00;
						}
					}
				}				
										
				//Fem un String on hores, minuts i segons sempre tindran 2 digits							
				String rellotge = String.format("%02d", hora) + ":" + String.format("%02d", minut) + ":" + String.format("%02d", segon);
				System.out.println(rellotge);
				
				//I li diem al fil que dormi durant 1000 milisegons (1 segon)
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {		//Tractament de l'excepció
			e.printStackTrace();
		}
	}
}
