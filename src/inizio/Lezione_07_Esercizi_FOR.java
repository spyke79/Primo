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
         * Al termine dire qunti numeri pari sono stai inseriti e qunati numeri dispari
         * 
         */
        
        input.close();
	}
}
