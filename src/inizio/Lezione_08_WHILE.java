package inizio;

import java.util.Scanner;

public class Lezione_08_WHILE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * WHILE
		 * 
		 * ripete un codice finchè non si verifica la condizione di uscita
		 * 
		 * il while vuole solo la condizione di uscita while(condizione di uscita)
		 * 
		 * 
		 * "tutti i FOR possono divnetare WHILE ma non tutti i WHILE possono diventare FOR"
		 */
		
		//FOR per stampare 10 numeri
		for(int i = 1; i <= 10; i++) {
			System.out.println("For: " + i);
		}
		
		//Stampo i 10 numeri con WHILE
		
		int i = 1; //Inizializzo l'indice della condizione while
		
		while(i <= 10) {
			
			System.out.println("WHILE: " + i);
			
			i++; //Incremento l'indice
		}
		
		//Esempio uso While, chiedo il nome finchè non inserisco fine
		
		String nome;
		
		System.out.println("Inserisci un nome e ti saluto, termino quando inserisci fine");
		
		nome = in.nextLine(); //Prendo il nome da Tastiera
		
		while(!nome.equals("fine")) { //! significa non 
			System.out.println("Ciao " + nome);
			
			System.out.println("Inserisci un nuovo nome o fine per terminare");
			nome = in.nextLine(); //Cambio il contenuto della varibile nome tipo indice
		}
		
		System.out.println("Ho finito di salutare");

	}

}
