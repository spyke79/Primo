package inizio;

import java.util.Random;


public class Esercizi_1 {

	public static void main(String[] args) {
		
		Random rm = new Random();//Per generare un numero random
		
		String[] simboli = {"carta","sasso","forbici"};
		
		System.out.println("Il pc ha giocato: " + simboli[rm.nextInt(3)]); //Genera un numero casuale tra 0 e 3 esculo

		/*
	    Gioca alla morra cinese con il PC
	    Il sistema esce quando viene scritto fine
	    L'utente deve inserire Carta, Forbici o Sasso (non importa minuscole o maiscole)
	    Quando faccio un lancio devo conoscere l'esito (Vinto, Perso, Paraggio)
	    Quado finisco il gioco devo conoscere quate partite ho fatto e quante volte ho vinto perso o pareggiato
	     */
		
	}

}
