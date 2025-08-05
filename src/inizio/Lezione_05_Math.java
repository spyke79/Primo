package inizio;

import java.util.Scanner;

public class Lezione_05_Math {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Calcolare la radice quadrata di un numero
		System.out.println(Math.sqrt(12.36));
		
		//Conoscere il minimo tra due numeri
		int n1 = 4, n2 = 5;
		System.out.println(Math.min(n1, n2));
		
		//Valore assoluto di un numero
		int n3 = -4;
		System.out.println("Valore assoulto: " + Math.abs(n3));
		
		
		//Come calcolare la Ptenza di un numero
		int base = 3;
		int esponente = 3;
		System.out.println("Potenza: " + Math.pow(base,esponente));
		
		
		//Generare un numero Randomico
		System.out.println("Numero Randomico: " + ((int)(Math.random() * 5) + 1));
		
		
		//Esercizio
		/*
		 * Chiedere di inserire un numero da tastiera e restituire la radice quadrata
		 * 
		 * es: 
		 * Inserisci un numero: 9
		 * La radice quadrata del numero è: 3 
		 */
		
		//Esercizio 2
		/*
		 * Chiedere altri 2 numeri e restituire il numero con il valore massimo
		 * 
		 * Inserisci il primo numero: 7
		 * Inserisci il secondo numero: 9
		 * Il numero maggiore inserito è: 9
		 */
		
		/*
		 * Crea una simulazione per testa o croce
		 * 
		 * Far generare in modo random il lancio della monetina e chiedere all'utente di scegliere tra
		 * 
		 * testa o croce.
		 * 
		 * Es: t = testa - c = croce
		 * 
		 */
		
		int ranTC = (int)(Math.random() * 2);
		
		System.out.println("Lancio Computer: " + ranTC);
		
		char tc_computer = (ranTC == 0) ? 'c' : 't';
		System.out.println("Lancio Computer: " + tc_computer);
		
		System.out.println("Scegli T per testa e C per croce e vedi se vinci");
		
		char scelta = in.next().charAt(0);
		
		if(scelta == tc_computer) {
			System.out.println("Hai vinto");
		}else {
			System.out.println("Hai perso");
		}
		
		

	}

}
