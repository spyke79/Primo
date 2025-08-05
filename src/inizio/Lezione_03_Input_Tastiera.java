package inizio;

import java.util.Scanner; //Importa la libreria dove si trova Scanner

public class Lezione_03_Input_Tastiera {

	public static void main(String[] args) {
		/*
		 * Per poter prendere gli input da tastiera ho bisogno delle funzionalità Scanner
		 */
		
		/*
		 * int nextInt(): legge il token successivo interpretandolo come un numero intero e lo restituisce al chiamante, o lancia un eccezione di tipo InputMismatchException se il token non è un intero.
double nextDouble(): legge il token successivo interpretandolo come un numero reale e lo restituisce al chiamante, o lancia un eccezione di tipo InputMismatchException se il token non è un reale.
String nextLine(): legge la riga di testo (successiva) e la restituisce al chiamante.
String next(): legge il successivo token senza delimitatori e lo restituisce al chiamante.
boolean hasNextInt(): restituisce vero se il prossimo token può essere interpretato come un numero intero, falso altrimenti.
boolean hasNextDouble(): restituisce vero se il prossimo token può essere interpretato come un numero reale, falso altrimenti.
boolean hasNextLine(): restituisce vero se in input è disponibile una ulteriore riga, falso altrimenti.
boolean hasNext(): restituisce vero se in input è disponibile un ulteriore token, falso altrimenti.
Scanner useDelimiter(String): modifica il delimitatore dei token, dove la stringa passata come parametro può essere una espressione regolare (vedi esempio più avanti).
		 */
		
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Inserisci un numero e lo stampo a video");
//		int n_inp = in.nextInt();
//		
//		System.out.println("Il valore inserito è: " + n_inp);

		/*
		 * Es1: Chiedi 2 numeri interi all'utente e ritorna la somma dei numeri
		 */
		
		System.out.println("Scrivi una frase o una parola");
		String frase = in.next();
		System.out.println(frase);
	}

}
