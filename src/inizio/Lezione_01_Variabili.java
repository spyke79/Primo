package inizio;

public class Lezione_01_Variabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Una variabile serve a memorizzare un valore.
		 * Puoi immaginarla come un contenitore che cambia il contenuto
		 * 
		 * Per dichiarare una variabile bisogna sempre indicare il tipo di contenuto
		 */
		
		//Vado a dichiarare una variabile Stringa. Quando dichiaro una Stringa il valore viene sempre
		//racchiuso tra "
		
		//Tipologia della variabile, Nome della variabile = valore della variabile
		String nome = "Michele"; //Variabile sia dichiarata che inizializzata
		String cognome; //Questa è una variabile solo dichiarata
		cognome = "Sorbo"; //Ho inizializzato la variabile
		
		System.out.println(nome);
		
		
		System.out.println("Ciao " + nome); //Concatenare variabili con + 
		
		//Cambio il contenuto della varibile nome
		nome = "Pasquale"; //Non scrivo String perchè la variabile è già dichiarata
		System.out.println("Ciao " + nome);
		
		/*
		 * Scrivi un programma che usa due varibili nome e cognome e stampi a video
		 * Mi chiamo nome cognome
		 */
		
		/*
		 * Le variabili numeriche
		 */
		
		int n1 = 3;
		int n2 = 4;
		
		System.out.println("Il numero scritto nella variabile è: " + (n1 + n2));
		
		System.out.println(n1 + n2);
		
		
		//Numeri con la virgola 1.000,36 -> 1000.36
		
		double prezzo = 9.99; //Sarebbe 9,99
		
		System.out.println("Il prezzo del prodotto è: " + prezzo);
		
		/*
		 * ES1: Profilo Studente: Dichiara e inizializza variabili per memorizzare il tuo nome, la tua età, 
		 * la media dei tuoi voti (usa un numero con la virgola) e la prima lettera del tuo cognome. 
		 * Stampa tutto a schermo in modo ordinato.
		 * 
		 * ES2: Scambio di Valori: Dichiara due variabili intere, a e b, e assegna loro dei valori. 
		 * Scrivi il codice per scambiare i loro valori 
		 * (suggerimento: ti servirà una terza variabile temporanea). 
		 * Stampa i valori di a e b prima e dopo lo scambio.
		 * 
		 * ES3: Dati Prodotto: Crea variabili per rappresentare un prodotto in un negozio: 
		 * nome del prodotto (es. "Laptop"), prezzo (es. 1200.50), quantità disponibile in 
		 * magazzino (es. 15) e se è in promozione (vero/falso). Stampa queste informazioni.
		 * 
		 * ES4: Calcolo Perimetro: Dichiara due variabili intere, base e altezza, per un rettangolo. 
		 * Crea una terza variabile perimetro e usala per memorizzare il risultato del calcolo 
		 * del perimetro. Stampa il risultato.
		 * 
		 * ES5: Concatenazione: Dichiara due variabili String, nome e cognome. 
		 * Crea una terza variabile nomeCompleto che contenga la concatenazione di nome, 
		 * uno spazio, e cognome. Stampa nomeCompleto.
		 */
		
		
		//Esercizio 1
		String nome_es = "Michele";
		int eta = 46;
		double mediaVoti = 28.5;
		char inizialeCognome = 's';
		
		System.out.println("Nome Studente: " + nome_es);
		System.out.println("Età: " + eta);
		System.out.println("Media Voti: " + mediaVoti);
		System.out.println("Iniziale Cognome: " + inizialeCognome);
		

		//Esercizio 2:
		int a = 10;
		int b = 20;
		
		System.out.println("Il valore di a è: " + a + " Il valore di b è: " + b);
		
		int temp = a; //Ricordo il valore di a
		a = b; //Porto a al volore di b
		b = temp; //Porto b al vecchio valore di a
		System.out.println("dopo scambio Il valore di a è: " + a + " Il valore di b è: " + b);
		
		
		//Esercizio 3:
		
		String nomeProdotto = "Telefono";
		double prezzo_es = 599.99;
		int qta = 30;
		boolean promozione = true;
		
		System.out.println("-----Scheda Prodotto-----");
		System.out.println("Nome prodotto: " + nomeProdotto);
		System.out.println("Prezzo: " + prezzo_es +"€");
		System.out.println("Quantità in magazzino: " + qta);
		System.out.println("In promozione: " + promozione);
		
		//Esercizio 4:
		double base = 10;
		double altezza = 5;
		double perimetro = 2 * (base * altezza);
		
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		
		//Costanti
		/*
		 * A differenza delle variabili le costanti non possono essere modificate dopo averle dichiarate.
		 * 
		 * 1) Le costanti si scrivono sempre in MAIUSCOLO
		 * 
		 * 2) Si devono sempre sia dichiarare che inizializzare contemporaneamente
		 * 
		 * 3) Prima del tipo si deve inserire la key final
		 * 
		 */
		
		final double PIGRECO = 3.14;
		
		System.out.println("Valore pgreco " + PIGRECO);
	}

}
