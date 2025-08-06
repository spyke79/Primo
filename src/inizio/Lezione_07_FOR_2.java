package inizio;

public class Lezione_07_FOR_2 {

	public static void main(String[] args) {
		
		/*
		 * Inserire break e continue in un ciclo for
		 * 
		 * brack:
		 * 
		 * Qundo inseirsco la parola chiave break esco immediatamente dal for.
		 * Limitare l'uso del break nel codice. 
		 *
		 */
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		
		System.out.println("Esco dal for");
		
		/*
		 * Continue
		 * 
		 * A differenza del Break il continue salta la singola iterazione ma continua nel for
		 * 
		 */
		
		System.out.println("----- Esempio Continue-----\n\n");
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Esco dal for");
		
		
		System.out.println("\n\nEsercizio Stampa Pari");
		for(int i = 1; i <= 50; i++) {
					
			if(i%2 == 1) { //Controllo se il numero è dispari
				continue;
			}
			
			System.out.println(i);
		}
		

	}

}
