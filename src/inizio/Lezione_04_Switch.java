package inizio;

import java.util.Scanner;

public class Lezione_04_Switch {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Scegli l'operazione");
		char operazione = in.next().charAt(0); //Prendo il primo carattere della stringa
		
		if(operazione == '+') {
			System.out.println("Hai scelo la somma");
		}else if(operazione == '-') {
			System.out.println("Hai scelto la sottrazione");
		}else if(operazione == '/') {
			System.out.println("Hai scelto la divisione");
		}else if(operazione == '*') {
			System.out.println("Hai scelto la moltiplicazione");
		}else {
			System.out.println("Operazione non valida");
		}
		
		//Facciomo la stessa cosa con switch
		
		switch(operazione) {
		case '+':
			System.out.println("Hai scelo la somma");
			break;
		case '-':
			System.out.println("Hai scelto la sottrazione");
			break;
		case '/':
			System.out.println("Hai scelto la divisione");
			break;
		case '*':
			System.out.println("Hai scelto la moltiplicazione");
			break;
		default:
			System.out.println("Operazione non valida");
		}
	}
	
	
	

}
