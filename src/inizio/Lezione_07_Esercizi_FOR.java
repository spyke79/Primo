package inizio;

import java.util.Scanner;

public class Lezione_07_Esercizi_FOR {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * Esercizio 1:
		 * Scrivi un programma che chieda all'utente di inserire un numero intero positivo N e stampi a schermo tutti i numeri da 1 a N.
		 */
		
		System.out.print("Inserisci un numero intero positivo: ");
        int n_1 = input.nextInt();

        System.out.println("Stampo i numeri da 1 a " + n_1 + ":");

        // Ciclo for che parte da 1 e arriva fino a n (incluso)
        for (int i = 1; i <= n_1; i++) {
            System.out.println(i);
        }

        
        /*
         * Chiedere all'utente di inserire 5 numeri
         * 
         * Al termine dire quanti numeri pari sono stai inseriti e qunati numeri dispari
         * 
         */
        
        //Setto le variabili dell'esercizio
        int n_es2, n_pari = 0, n_dispari = 0; //Setto anche i contatori dei numeri pari e dispari a 0
        
        System.out.println("Esercizio2: Inserisci 5 numeri e ti dirò quanti sono pari e quanti sono dispari");
        
        for(int i = 1; i <= 5; i++) {
        	System.out.println("inserisci il " + i + "° numero");
        	n_es2 = input.nextInt(); //Prendo il numero inserito nel teminale
        	
        	//Controllo se il numero inserito è pari o dispari
        	if(n_es2%2 == 0) {
        		n_pari++; //Incremento il contatore dei numeri pari
        	}else {
        		n_dispari++; //Incremento il contatore dei numeri dispari
        	}
        }
        
        System.out.println("Hai inserito " + n_pari + " numeri pari e " + n_dispari + " numeri dispari.");
        
        input.close();
	}
}
