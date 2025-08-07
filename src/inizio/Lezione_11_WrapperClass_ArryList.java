package inizio;

import java.util.Scanner;
import java.util.ArrayList;

public class Lezione_11_WrapperClass_ArryList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Tipi primitivi di dati
		int intero = 3;
		char carattere = 'c';
		double num_dauble = 12.45;
		boolean vero = true;
		float num_float = 15.85f;
		
		//Questi tipi primitivi vanno bene per gli array classici
		
		
		//tipi reference (referenziali). A differenza dei tipi primitivi hanno i metodi
		//i tipi reference hanno i metodi, ma sono più difficili da gestire per il processore.
		//Vanno bene se ne usiamo pochi
		
		//Tipi Wrapper
		String frase = "Ciao Mondo";
		Integer intero_r = 3;
		Character carattere_r = 'r';
		Double double_r = 12.45;
		Boolean falso = false;
		
		/*
		 * Il motivo per cui si usano i refernce è perchè gli ArrayList (che sono un evoluzione degli array)
		 * Accettano solo tipi referenziali
		 * 
		 * per utilizzarli bisogna richiamare la libreria java.util.ArrayList
		 */
		
		Integer n1 = 4;
		Integer n2 = 4;
		
		if(n1 == n2) {
			System.out.println("Sono uguali");
		}
		
		/*
		 * ArrayList
		 * 
		 * Sono degli array ma ridimensionabili
		 * Accettano solo reference
		 * 
		 */
		
		int[] ar_1 = new int[5]; //Creo un array di interi di 5 posizioni
		
		//Creo un arrayListi di Stringhe
		ArrayList<String> persone = new ArrayList<String>();
		
		//Per inserire elementi nell'ArrayList si usa il metodo add() che aggiunge gli elementi alla fine dell'ArrayList
		persone.add("Pasquale");
		persone.add("Michele");
		persone.add("Mario");
		
		//Stampo tutto l'array
		System.out.println(persone);
		
		//Stampare solo un elemento dell'ArrayList
		System.out.println("Stampo l'emento alla prima posizione: " + persone.get(0));
		
		//Per sapere quanti elementi ci sono nell'ArrayList
		System.out.println("Ci sono " + persone.size() + " elementi nell'ArrayList");
		
		//Per stampare tutti gli elementi di un ArrayList
		for(int i = 0; i < persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		//Stampare gli leementi con un forech
		for(String el:persone) {
			System.out.println("Elemento tramite forech: " + el);
		}
		
		//Ordinare gli ArrayList
		System.out.println("ArrayList prima di essere ordinato: " + persone + " e il valore dell'indice alla posizione 0 è: " + persone.get(0));
		persone.sort(null); //Si deve fare prima della stampa. La modifica è permanente e vengo anche cambiati gl'indici
		System.out.println("ArrayList dopo essere stato ordinato: " + persone + " e il valore dell'indice alla posizione 0 è: " + persone.get(0));
		
		//Per modificare un elemneto dell'ArrayList si usa set(<indice_elemento>)
		persone.set(0, "Marco");
		System.out.println("ArrayListi dopo set: " + persone);
		
		//Per aggiungere un elemento in un determinato indice si usa add(<indice>, <elemento>)
		//Se non inserisco l'indice in add() si inserisce sempe alla fine
		persone.add(2,"Giovanni");
		System.out.println("ArrayListi dopo add: " + persone);
		
		//Voglio aggiungere un elemento all'inizio
		persone.add(0, "Aldo");
		System.out.println("ArrayListi dopo add: " + persone);
		
		//Elimiare un elemento si usa remove(<indice_elemento>)
		persone.remove(1);
		System.out.println("ArrayListi dopo remove: " + persone);
		
		//Conoscere indice di un elemento
		System.out.println("L'indice dell'elemento Giovanni è: " + persone.indexOf("Giovanni"));
		
		//Rimuovere elemento con la ricerca per nome
		persone.remove(persone.indexOf("Giovanni"));
		System.out.println("ArrayListi dopo remove Giovanni: " + persone);
		
		//Per vedere se un elemento è presente nell'ArrayList
		System.out.println("Pasquale è nell'Array? " + persone.contains("Pasquale"));
		
		if(persone.contains("Vincenzo")) {
			System.out.println("Elemento presente");
		}else {
			System.out.println("Elemento non presente");
		}
		
		//Copiare un ArrayList
		ArrayList<String> persone_clone = (ArrayList<String>)persone.clone();
		System.out.println("Clonazione: " + persone_clone);
		
		//Cancellare tutti gli ementi da un ArrayList
		persone_clone.clear();
		System.out.println("Elementi dopo clear:" + persone_clone.size());

	}

}
