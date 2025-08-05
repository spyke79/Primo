package inizio;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Lezione_03_IF_ELSE {

	public static void main(String[] args) {
		/*
		 * Il costrutto IF serve a far eseguire un codice se la condizione è verificata (true)
		 * 
		 * Non tutti gli IF hanno un else
		 * 
		 */
		
		Scanner in  = new Scanner(System.in);
		
		int n1 = 4;
		int n2 = 5;
		
		if(n1 > n2) {
			System.out.println("N1 è maggiore");
			}
//		}else {
//			System.out.println("N2 è maggiore");
//		}
		
		System.out.println("Codice dopo IF ");
		
		
		/*
		 * 
		 * Chiedere all'utente di inserire 2 numeri per la divisione.
		 * 
		 * Se il seocndo numero è uguale a 0 dire divisione non valida, altrimenti mostrare il risultato.
		 * 
		 * I numeri devono essere double.
		 * 
		 */
		
		
		/*
		 * Chiedere all'utente un numero da tastiera e ritornare se il numero inserito è pari o sipari
		 * 
		 * 
		 * Chiedere all'utente un numero da dastiera e dire se è positivo o negatvo 
		 */
		
		//IF ELSE IF ELSE
		
		/*Voglio trasformare un numero nel giorno della settimana
		 * 1 = "Lunedì"
		 * 2 = "Martedì"
		 * 3 = "Mercoledì"
		 * Un qualsiasi numero deve tornare non corretto
		 */
		
		//Vado a chiedere il numero e lo memorizzo in una variabile
		System.out.println("Inserisci un numero tra 1 e 3 e lo trasfomo in giorno");
		int giorno = in.nextInt();
		
		if(giorno == 1) {
			System.out.println("Lunedì");
		}else if(giorno == 2) {
			System.out.println("Martedì");
		}else if(giorno == 3) {
			System.out.println("Mercoledì");
		}else {
			System.out.println("Giorno non Valido");
		}
		
		
		/*
		 * Positivo, Negativo o Zero: Scrivi un programma che chiede un numero intero e stampa se è "Positivo", "Negativo" o "Uguale a zero".
		 * 
		 * 
		 * Calcolatrice con if-else if: Scrivi un programma che chiede due numeri double e un operatore char (+, -, *, /). 
		 * Esegue l'operazione corrispondente e stampa il risultato. Gestisci anche il caso di un operatore non valido.
		 */
		
		
		
		//Operatore Ternario
		//Inizializzare la variabile risultato a Promosso se il puntegigo è superiore o uguale a 60 altrimenti inizializza a bocciato
		
		String risultato;
		
		int punteggio = 40;
		
//		if(punteggio > 60) {
//			risultato = "Promosso";
//		}else {
//			risultato = "Bocciato";
//		}
		
		//Faccio la stessa cosa ma con l'operatore ternario
		 risultato = (punteggio >= 60) ? "Promosso" : "Bocciato";
		
		System.out.println("Il risultato è: " + risultato);
		
		/*
		 * Diritto di Voto: Scrivi un programma che chiede l'età di una persona e stampa "Puoi votare" o "Non puoi votare". 
		 * Usa l'operatore ternario per questo esercizio.
		 */
		
		/*
		 * /*
		 * Trasformare il voto da numero a lettere
		 * Tabella di conversione
		 * 
		 * se il voto e inferiore a 6 dovrà scrivere Insufficiente
		 * se il voto è inferiore a 8 dovrà scrivere Sufficiente
		 * se in voto è inferiore a 9 dovrà scrivere Buono
		 * altrimenti scrivere Ottimo
		 */
		 */
	}

}
