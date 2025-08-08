package inizio;

public class Lezione_12_METODI_FUNZIONI {

	//é il metotdo prinicpale di una classe
	public static void main(String[] args) {
		
		System.out.println("SONO IL METODO PRICIPALE");
		
		//Una funzione/metodo serve a ripetere un blocco di codice ogni volta che viene invocata (chimare la funzione)
		//Una funzione/metodo viene scritta all'interno della classe ma fuori dal metodo main 
		
		//Invoco il metodo saluta per farlo eseguire
		saluta();
		saluta();
		saluta();
		
		salutaNome("Pasquale", "Orlando");
		salutaNome("Michele", "Sorbo");
		String nome_main = "Mario";
		salutaNome(nome_main, "Rossi");
		
		somma(3,4);
		somma(14,56);
		
		double sconto = prezzoScontato(120.00,5);
		System.out.println("Il prezzo scontato è: " + sconto);
		
		
		System.out.println("Lo sconto senza variabile è: " + prezzoScontato(234.89, 12));
		
		double div = dividi(8,2);
		
		System.out.println(div);
		
		double n1 = 3.4;
		double n2 = 5.1;
		
		somma(n1, n2);
		somma(12,3);
		somma(23.5,6.8, 8);
	}
	
	//FUORI DALLA FUNZIONE MAIN POSSO CREARE NUOVE FUNZIONI
	
		//Per creare una funzione che possa essere richiamata all'interno drella stessa classe devo inserire static
		//Una funzione si scrive seguendo le seguenti regole
		//1) Visibilità della funzione 
		//2) (opzionale) static, se la devo far eseguire nella stessa classe
		//3) tipo di ritorno, se non sono previssti ritorni si scrive void
		//4) il nome della funzione
		//5) eventuali parametri da inserire nelle parentesi ()
	
	//Funzione Semplice senza parametri e senza ritorno di alcun tipo
	public static void saluta() {
		System.out.println("Ciao Mondo");
	}
	
	
	//Metodo che non ritorna nulla ma prende una Stringa come parametro
	public static void salutaNome(String nome, String cognome) {
		System.out.println("Ciao " + nome.toLowerCase() + " " + cognome.toLowerCase());
	}
	
	//Es: Crea un metodo somma che prende in input due interi e ritorno la somma a video dei due numeri
	public static void somma(int a, int b) {
		System.out.println("La somma è: " + (a+b));
	}
	
	//Funzioni con ritorno
	//I ritorni sono i tipi delle variabili (es int, String, double, Integer, int[], ArrayList
	//La funzione con ritorno serve per settare altre variabili.
	//Se la voglio stampare direttamente devo includerla in un System.out
	//Le funzioni con ritorno vogliono sempre return nel codice
	
	public static double prezzoScontato(double prezzo, int sconto) {
		return (prezzo * (100 - sconto))/100;
	}
	
	//Crea un metodo con ritorno che faccia la divisione di due numeri double, se uno dei due numeri è 0 far ritornare sempre 0 come risultato
	public static double dividi(double a, double b) {
		if(b != 0) {
			return a/b;
		}else {
			//System.out.println("Divisione impossibile");
			return 0;
		}
	}
	
	//Posso anche creare un OVERLOADED dei Metodi/Funzioni
	//Posso cambiare i tipi di parametri in ingresso di un metodo/funzione
	//La firma della funzione deve essere identica
	public static void somma(double a, double b) {
		System.out.println("La somma è: " + (a+b));
	}
	
	public static void somma(double a, double b, double c) {
		System.out.println("La somma è: " + (a+b+c));
	}

}
