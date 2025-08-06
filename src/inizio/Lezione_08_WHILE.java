package inizio;

import java.util.Scanner;

public class Lezione_08_WHILE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * WHILE
		 * 
		 * ripete un codice finchè non si verifica la condizione di uscita
		 * 
		 * il while vuole solo la condizione di uscita while(condizione di uscita)
		 * 
		 * 
		 * "tutti i FOR possono divnetare WHILE ma non tutti i WHILE possono diventare FOR"
		 */
		
		//FOR per stampare 10 numeri
		for(int i = 1; i <= 10; i++) {
			System.out.println("For: " + i);
		}
		
		//Stampo i 10 numeri con WHILE
		
		int i = 1; //Inizializzo l'indice della condizione while
		
		while(i <= 10) {
			
			System.out.println("WHILE: " + i);
			
			i++; //Incremento l'indice
		}
		
		//Esempio uso While, chiedo il nome finchè non inserisco fine
		
		String nome;
		
		System.out.println("Inserisci un nome e ti saluto, termino quando inserisci fine");
		
		nome = in.nextLine(); //Prendo il nome da Tastiera
		
		while(!nome.equals("fine")) { //! significa non 
			System.out.println("Ciao " + nome);
			
			System.out.println("Inserisci un nuovo nome o fine per terminare");
			nome = in.nextLine(); //Cambio il contenuto della varibile nome tipo indice
		}
		
		System.out.println("Ho finito di salutare");
		
		/*
		 * Esercizio:
		 * 
		 * Fare la somma dei numeri inseti da tastiera, il programma si ferma quanso si inserise 0.
		 * 
		 * Bonus, dire quanti numeri sono stati inseriti
		 */

		int num_inp;
		int somma = 0;
		int tot_num = 0;
		
		System.out.println("Sommo i numeri inserisci 0 per terminare.");
		num_inp = in.nextInt(); //Posso inserire tutti i numeri anche 0
		
		while(num_inp != 0) { //Finchè il numero che hai inserito è diverso da 0 eseguo il while
			tot_num++; //Incremento il numero di numeri inseriti diversi da 0
			somma += num_inp; //Aggiorno la somma
			
			//Incremento dell'indice devo chiedere un nuovo numero e verificare che non sia 0
			System.out.println("Inserisci un nuovo numero, 0 per teminare");
			num_inp = in.nextInt(); //Ricevo un nnuvo numero da tastiera e lo faccio testare nella condizione del while
			
		}
		
		System.out.println("La somma dei numeri inseriti è: " + somma + " e hai inserito " + tot_num + " numeri");
		System.out.println("La media è: " + (somma/tot_num)); //Soluzione esercizio sotto
		
		
		/*
		 * DO WHILE
		 * 
		 * si usa quando devo fare un operazione almeno la prima volta
		 * 
		 * while: prima controlla la condizione di uscita e poi esegue il codice
		 * 
		 * do while: prime esegue e poi controlla la condizione di uscita
		 * 
		 * quello che si sicrive nel do{} verrà eseguito almeno una volta
		 * 
		 * es: devo inizializzare la variabile per effettuare la ndizione di uscita
		 * 
		 */
		
		//Stesso esercizio ma fatto con do while
		System.out.println("\n\n---------DO WHILE------------");
		somma = 0; //Resetto il contenuto di somma a 0
		tot_num = 0; //Ressetto l'indice per il contegigo dei numeri inseriti
		
		do {
			System.out.println("Inserisci un numero e farò la somma, 0 per terminare");
			num_inp = in.nextInt();
			
			somma += num_inp;
			tot_num++;
			
		}while(num_inp != 0);
		
		System.out.println("La somma dei numeri inseriti è: " + somma + " e hai inserito " + tot_num + " numeri");
		System.out.println("La media è: " + (somma/tot_num)); //Soluzione esercizio sotto
	}

}
