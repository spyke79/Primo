package inizio;

import java.util.Arrays;

public class Lezione_10_STRINGHE {

	public static void main(String[] args) {
		
		int numero = 1;
		String nome = "Michele Sorbo";
		
		/*
		 * Una stringa altro non è che un array di caratteri
		 */
		
		System.out.println(nome.length());

		System.out.println("Stampo il primo carattere della stringa: " + nome.charAt(0));
		System.out.println("Stampo il secondo carattere della stringa: " + nome.charAt(1));
		
		System.out.println("Stampo l'ulitmo carattere della stringa: " + nome.charAt(nome.length() - 1));
		
		//Scrivere il tuo nome in una stringa e stapare ogni lettera su una nuova riga
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//METODI STRINGA
		
		String str = "       Ciao Mondo     ";
		
		System.out.println(str.length() + " Primo carattere " + str.charAt(0) + " della stringa");
		
		//Per eliminare gli spazzi vuoti prima e dopo la stringa si usa il metodo trim()
		System.out.println("Pima del trim: " + str + " -Fine stringa");
		System.out.println("Dopo  il trim: " + str.trim() + " -Fine stringa");
		
		//I metodi si possono chiamare a cascata
		System.out.println("Lunghezza di str senza trim: " + str.length());
		System.out.println("Lunghezza di str con trim: " + str.trim().length());
		
		//Risolviamo il problema del Case Sensitive
		String str1 = "PaSQualE";
		
		System.out.println("Str 1 in originale: " + str1);
		System.out.println("Str 1 modificata: " + str1.toLowerCase());
		System.out.println("Str 1 in originale: " + str1);
		
		//equals() serve a confrontare il contenuto di una stringa con il contenuto di un'altra stringa
		//toLowerCase() serve a trasformare il contenuto della stringa in minuscolo
		//toUpperCase()serve a trasformare il contenuto della stringa in MAIUSCOLO
		
		//I metodi non modifica permanetemente la stringa
		//Per rendere permanete la modifica si deve riassociare alla stringa
		str1 = str1.toLowerCase();
		System.out.println("Str 1 in originale dopo la modifica permanente: " + str1);
		
		String nome1 = "pasquale";
		String nome2 = "Pasquale";
		
		if(nome1.equals(nome2)) {
			System.out.println("Nomi uguali");
		}else {
			System.out.println("Nomi diversi");
		}
		
		//Per risolvere problemi di battitura
		if(nome1.trim().toLowerCase().equals(nome2.trim().toLowerCase())) {
			System.out.println("Nomi uguali");
		}else {
			System.out.println("Nomi diversi");
		}
		
		//Metodo alternativo
		if(nome1.trim().equalsIgnoreCase(nome2.trim())) {
			System.out.println("Nomi uguali");
		}else {
			System.out.println("Nomi diversi");
		}
		
		//Metodi per modificare il contenuto di una stringa
		String str2 = "Corso di JAVA per classi JAVA";
		
		//Cambio solo la parola JAVA in NODE
		System.out.println("Modifco la stringa con NODE al posto di JAVA: " + str2.replace("JAVA", "NODE"));
		System.out.println("Modifco la stringa con NODE al posto di JAVA solo la prima volta che incontro JAVA: " + str2.replaceFirst("JAVA", "NODE"));
		
		String str3 = "Ciao  Mondo,  COME stai";
		System.out.println("Str3 senza modifiche: " + str3);
		System.out.println("Elimino gli spazzi all'interno: " + str3.replace("  ", " "));
		System.out.println("Elimino levirgole all'interno: " + str3.replace(",", ""));
		
		//Posso unire più metodi per pulire la stringa
		String str3_pulita = str3.trim();
		str3_pulita = str3_pulita.replace(",", "");
		str3_pulita = str3_pulita.replace("  ", " ");
		str3_pulita = str3_pulita.toLowerCase();
		System.out.println("Str3 pulita: " + str3_pulita);
		
		//Come creare una nuova stringa partendo da una stringa esistente
		
		String str4 = "Benvenuto nel corso JAVA. Il corso è organizzato dal fondo FormaTemp";
		
		//Creo una sottostringa dalla parola JAVA
		System.out.println("Sottostringa da JAVA in poi: " + str4.substring(20));
		System.out.println("Sottostringa fino a JAVA: " + str4.substring(0, 24));
		
		//Per sapere l'indice di inizio di una parola nella stringa si usa indexOf()
		System.out.println("Indice inizio parola JAVA nella strina: " + str4.indexOf("JAVA"));
		
		//Crea sottostringa senza contare l'indice
		System.out.println("Sottostringa: " + str4.substring(0,str4.indexOf("JAVA") + 4));
		
		//Come trasformare una stringa in un array con il metodo split()
		String nomi = "Michele Pasquale Mario";
		
		//Per stampare il contenuto di un array si usa Array.toString()
		
		String[] nomi_ar = nomi.split(" ");
		System.out.println("La lunghezza dell'array è: " + nomi_ar.length + " e i nomi sono: " + Arrays.toString(nomi_ar));
		
		String numeri = "1,3,5,21,34,9";
		
		String[] numeri_ar = numeri.split(",");
		System.out.println("La lunghezza dell'array è: " + numeri_ar.length + " e i nomi sono: " + Arrays.toString(numeri_ar));
		
		int somma_ar = 0;
		for(int i = 0; i < numeri_ar.length; i++) {
			somma_ar += Integer.parseInt(numeri_ar[i]); //Per sommare una array di caratteri uso il cast to int
		}
		
		System.out.println("La somma è: " + somma_ar);
		
		//Posso verificare si un una strnga è contenuto un valore
		String str5 = "Michele Pasquale Mario";
		System.out.println("Nella stringa è presente Pasquale?: " + str5.contains("Pasquale"));
		
		
		//Chiedere all'utente di inserire dei numeri divisi dalla virgola, dopo che ha inviato i numeri stapare la somma dei numeri inseriti e 
		// la loro media
	}

}
