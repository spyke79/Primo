package inizio;

import java.util.Scanner;

public class Lezione_06_AND_OR {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Intrduzione agli operatori AND e OR
		 * 
		 * Operatore AND (e) si scrive &&, si usa quando tutte le condizioni devono essere verificate
		 * 
		 * Operatore OR (o) si scrive ||, si usa quando almeno una delle condizioni è vera
		 * 
		 * Operatore XOR (o esclusivo) ^, si usa quando vogliamo che solo una condizione sia verificata
		 * 
		 */
		 
		 String nome = "Michele";
		 
		 
		 //Per verificare se due stringe sono uguli si usa .equals
		 if(nome.equals("Michele")) { //non fare nome == "Michele"
			 System.out.println("Sei Michele");
		 }else {
			 System.out.println("Non ti conosco");
		 }
		
		 
		 //Esemio
		 /*
		  * Dare l'opportunità di iscriversi al corso di guida se:
		  * Età >= 18
		  * Residenza = Italiana
		  * 
		  */
		 
		 int eta = 10;
		 String residenza = "Tedesca";
		 
		 if(eta >= 18 || residenza.equals("Italiana")) {
			 System.out.println("Puoi accedere al corso della patente");
		 }else {
			 System.out.println("Accesso non cnosentito");
		 }
		 
		 
		 /*
			 * 
			 * Esercizio:
			 * 
			 * Premio prodzione. Scrivere un programma che chieda il numero di pezzi venduti e il fatturato per 
			 * Trimestre.
			 * 
			 * Se l'agente ha venduto più di 300 pezzi o ha fatturato più di 10000€ può ricevere 
			 * il premio di produzione
			 * 
			 * se ha diritto al premio visualizzare il premio ottenuto.
			 * 
			 * che è sempre il 5% del fatturato
			 * 
			 */
		 
		Double pezzi, fatturato;
			
		System.out.println("Quanti pezzi hai venduto?");
		pezzi = in.nextDouble();
		
		System.out.println("Quale è il tuo fatturato?");
		fatturato = in.nextDouble();
		
		if(pezzi >= 300 || fatturato >= 10000) {
			System.out.println("Hai diritto al premio");
			System.out.println("Il premio è: " + (fatturato * 0.05) + "€");
		}else {
			System.out.println("Premio non disponibile");
		}
		 

	}

}
