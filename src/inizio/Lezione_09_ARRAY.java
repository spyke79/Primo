package inizio;

import java.util.Scanner;

public class Lezione_09_ARRAY {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Gli Array.
		 * 
		 * Gli array sono delle posizioni vicine di un determinato tipo
		 * 
		 * Quando creo un array oltra al tipo devo indicare la lunghezza
		 * 
		 * L'indice dell'array inizia sempre a 0
		 * 
		 * Per accedere ad un valore dell'arry lo faccio tramite l'indice
		 * 
		 */
		
		int numero = 1; //Posso memorizzare solo un valore
		
		//Creo un array di 5 interi
		int[] ar_numeri = new int[5]; //Ho creato un arrau di 5 POSIZIONI
		
		//Inseriamo i valori dentro le posizioni dell'array
		
		ar_numeri[0] = 12; //Ho inserito il valore 12 nella prima posizione dell'array
		ar_numeri[1] = 32;
		ar_numeri[2] = 45;
		ar_numeri[3] = 21;
		ar_numeri[4] = 89; //Ultiam posizione dell'array
		
		//Come leggere il contenuto di un array
		
		System.out.println("Il contenuto alla prima posizione dell'array è: " + ar_numeri[0]);
		System.out.println("Il contenuto alla seconda posizione dell'array è: " + ar_numeri[1]);
		
		//Stampo tutto l'array
		for(int i = 0; i < 5; i++) {
			System.out.println("Il contenuto alla "+ i +"° posizione dell'array è: " + ar_numeri[i]);
		}
		
		System.out.println("\n\n----------------------------------");
		ar_numeri[2] = 67; //Ho modificato il valore all'indice 2 dell'array

		
		for(int i = 0; i < 5; i++) {
			System.out.println("Il contenuto alla "+ i +"° posizione dell'array è: " + ar_numeri[i]);
		}
		
		//Posso creare ed inizializzare un array contemporaneamente
		int[] ar_num2 = {6,85,59,71,25,24,12,9,13,5};
		
		//Come conoscere il numero di elementi nell'array
		System.out.println("Gli elementi nellarray ar_num2 sono: " + ar_num2.length); //length ritorna il numero di elementi contando da 1. Ricoda che l'indice parte da 0
		
		//Stampare il contenuto dell'array senza sapere qunti elementi ci sono
		System.out.println("\n\n-----------");
		for(int i = 0; i < ar_num2.length; i++) {
			System.out.println("Il contenuto alla "+ i +"° posizione dell'array è: " + ar_num2[i]);
		}
		
		//Crea un array di 5 posizioni, riempi l'array con i valori a piacere e stampa il contenuto a video
		int somma = 0;
		
		for(int i = 0; i < ar_num2.length; i++) {
			somma += ar_num2[i];
		}
		
		System.out.println("Il totale dei numeri dell'array è: " + somma);
		
		for(int i = ar_num2.length - 1; i >= 0; i--) {
			System.out.println(ar_num2[i]);
		}
		
		String[] classe = new String[3];
		
		//Chiedo all'utente d inserire i tre nomi e li memorizzo
		
		for(int i = 0; i < classe.length; i++) {
			System.out.println("Inserisci il nome: ");
			classe[i] = in.nextLine();
		}
		
		//Stampo i nomi inseriti
		System.out.println("I nomi inseriti sono: ");
		for(int i = 0; i < classe.length; i++) {
			System.out.println(classe[i]);
		}
		
		
		/*
		 * Creazione della classe.
		 * Chidere al'utente di quanti alunni è composta la classe.
		 * Creare un array e inserire gli alunni.
		 * 
		 * ES: 
		 * Quanti alunni vuoi inserire? -> 3
		 * Inserisci 1° alunno: Michele
		 * Inserisci 2° alunno: Antonio
		 * Inserisci 3° alunno: Mario
		 * 
		 * Gli alunni inserito sono: Michele Antonio Mario
		 */
		
	}

}
