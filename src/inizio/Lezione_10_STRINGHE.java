package inizio;

public class Lezione_10_STRINGHE {

	public static void main(String[] args) {
		
		int numero = 1;
		String nome = "Michele Sorbo";
		
		/*
		 * Una stringa altro non è che un array di caratteri
		 */
		
		System.out.println(nome.length());

		System.out.println("Stampo il primo carattere della stringa: " + nome.charAt(0));
		
		System.out.println("Stampo l'ulitmo carattere della stringa: " + nome.charAt(nome.length() - 1));
		
		//Scrivere il tuo nome in una stringa e stapare ogni lettera su una nuova riga
		
	}

}
