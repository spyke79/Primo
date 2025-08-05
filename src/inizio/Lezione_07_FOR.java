package inizio;

import java.util.Scanner;

public class Lezione_07_FOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * Il costrutto FOR serve a ripetere un blocco di codice un determinato numero di volte
		 * 
		 * for(indice iniziale; condizione di uscita; incremento)
		 * 
		 * ATTENZIONE!!!:
		 * Con il for è semplice far andare il loop il codice, stare attenti all'indice iniziale
		 * e alla condizione di uscita. Se l'incremento è sbagliato l'indice non incontreràò mai
		 * la condizione di uscita.
		 */
		
		int i_a; //Lo uso come indice per il for
		
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("...10");
		
//		//  Indice Inizio; condizione uscita; incremento dell'indice
//		for(i_a = 10; i_a >= 1; i_a--) {
//			System.out.println(i_a);
//		}
//		
//		System.out.println("Codice dopo il for");
		
		//Crea un programma che stampi la tabellina del 2, da 1 a 10
		
		System.out.println("Scegli una tabellina");
		
		int tabellina = in.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabellina + " x " + i + " = " + (tabellina * i));
		}
		
		/*
		 * Chiedere all'utente quale tabellina visualizzare.
		 * 
		 * Opzionale:
		 * chiedere da dove si vuole iniziare e dove vuoi finire
		 * 
		 * es: dove vuoi iniziare: 11
		 * Dove vuoi finire : 20
		 * 
		 * 5 x 11 = 55
		 * 5 x 12 = 60
		 * ...
		 * 5 x 20 = 100
		 * 
		 * es:
		 * Che tabellina vuoi vedere? 5
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * ...
		 * 5 x 10 = 50
		 * 
		 * 
		 */
		
		
		//Versione difficile 
		System.out.println("Quale tabellina vuoi visualizzare");
		tabellina = in.nextInt();
		
		System.out.println("Da dove vuoi iniziare");
		int inizio = in.nextInt(); //Mio indice di partenza
		
		System.out.println("dove vuoi finiere");
		int fine = in.nextInt(); //Mia codizione di uscita
		
		//Controllo loop
		if(inizio <= fine) {
			for(int i = inizio; i <= fine; i++) {
				System.out.println(tabellina + " x " + i + " = " + (tabellina*i));
			}
		}else {
			System.out.println("Inserisi una fine maggiore dell'inizio");
		}
		
		
		/*
		 * Esercizio 2:
		 * 
		 * Chiedere di inserire 5 numeri e dopo averli inseriti visualizzare la somma dei numeri inseriti
		 * 
		 */
		
		
		int n_utente; //Vado a ricordare il numero inserito dall'utente
		int somma = 0; //Inizilizzo la somma a 0 e vado a sommare i numeri dell'utente
		
		//Faccio il For per chiedere i 5 numeri
		for(int i = 1; i <= 5; i++) {
			System.out.println("Inserisci il " + i +"° numero");
			n_utente = in.nextInt(); //Prendo il numero da tastiera
			somma += n_utente; //Aggiorno la somma sommando il numero appena inserito dall'utente
		}
		
		//Dopo aver inserito i 5 numeri stampo la somma
		System.out.println("La somma dei numeri inseriti è: " + somma);
		
	}

}
