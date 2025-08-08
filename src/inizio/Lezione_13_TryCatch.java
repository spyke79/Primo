package inizio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lezione_13_TryCatch {

	public static void main(String[] args) {
		/*
		 * Il Try catch serve a gestire gli errori in determinate occasioni
		 */
		
		Scanner in = new Scanner(System.in);
		
		double n1, n2, risultato;
		
		System.out.println("Numero prima di try");
		n1 = in.nextDouble();
		
		
		try {
			System.out.println("Inserisci il primo numero");
			n1 = in.nextDouble(); //Genero l'errore
			
			System.out.println("inserisci il secondo numero");
			n2 = in.nextDouble();
			
			risultato = n1/n2;
			
			System.out.println("Il risultato della divisione è: " + risultato);
			
		}catch(ArithmeticException e) { //Erorri di calcolo artmetici
			System.out.println("Non puoi dividere per 0");
			
		}catch(InputMismatchException e) {
			System.out.println("Puoi inserire solo numeri");
			
		}catch(Exception e) {
			System.out.println("Errore generico: " + e);
		}finally {
			//è un codice che viene sempre eseguito Sia che va tutto bene sia se incontro un catch
			//non è obbligatorio
			//Inserisco le cose che devo chiudere sia se il codice va a buon fine sia che fallisce
			System.out.println("sono finally");
			//in.close();//Chiudo il flusso di input
		}
		
		
		//Try su array
		int[] ar = {2,5,7};
		int indice;
		
		try {
			System.out.println("Inserisci un indice e scopri il numero: ");
			indice = in.nextInt();
			
			System.out.println("Il numero all'indice è: " + ar[indice]);
			
			System.out.println("Codice dopo l'errore");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice non presente nell'array");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			in.close();//Chiudo il buffer di lettura da console
		}
		
	}

}
