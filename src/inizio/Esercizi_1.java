package inizio;

import java.util.Random;


public class Esercizi_1 {

	public static void main(String[] args) {
		
		Random rm = new Random();//Per generare un numero random
		
		String[] simboli = {"carta","sasso","forbici"};
		
		System.out.println("Il pc ha giocato: " + simboli[rm.nextInt(3)]); //Genera un numero casuale tra 0 e 3 esculo

	}

}
