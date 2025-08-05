package inizio;

public class Lezione_02_Operatori {

	public static void main(String[] args) {
	/*
	 * Gli operatori in JAVA sono:
	 * 
	 * Somma (+) = 2 + 2 = 4
	 * 
	 * Sottrazione (-) = 4 - 2 = 2
	 * 
	 * Moltiplicazione (*) = 2 * 2 = 4
	 * 
	 * Divisione (/) = 2 / 2 = 1
	 * 
	 * Modulo (%) è il resto della divisione = 2%2 = 0  ---- 3%2 = 1
	 */

		
		int n1,n2,somma;
		String n3 = "4";
		
		//SOMMA
		
		n1 = 3;
		n2 = 2;
		System.out.println(n1 + n2); // + diventa somma perchè ci sono 2 numeri interi
		System.out.println(n1 + n3); // + diventa concatenazione perchè c'è un numero e una Stringa
		
		//SOTTRAZIONE
		System.out.println(n1 - n2);
		
		//MOLTIPLICAZIONE
		System.out.println(n1 * n2);
		
		//DIVISIONE (Controllare la divisione per 0)
		double num1 = 45;
		double num2 = 3;
		System.out.println(num1 / num2);
		
		
		//MODULO
		
		n1 = 7;
		n2 = 3;
		
		System.out.println(5%3);
		System.out.println(n1%n2);
		
		//OPERATORI DI COMPARAZIONE (ritornano true o false)
		/*
		 * 
		 *  > Maggiore (Es: 4 > 3 = True - 4 > 4 = False)
		 *  
		 *  >= Maggiore Uguale (Es: 4 >= 3 = True - 4 >= 4 = True)
		 *  
		 *  < Minore
		 *  
		 *  <= Minore Uguale 
		 *  
		 *  
		 *  = ATTENZIONE NON è UGUALE MA è ASSEGNA
		 *  
		 *  == UGUAE (ES 4 == 4 VERO)
		 *  
		 *  != DIVERSO (ES 4 != 4 FALSO  4 != 3 VERO
		 */
		
		n1 = 3;
		n2 = 3;
		
		System.out.println(n1 > n2);
		
		
		//OPERATORI DI INCREMENTO E DECREMENTO di variabili int
		/*
		 * 
		 * Incremento di 1 ++
		 * 
		 * Decremento di 1 --
		 *
		 * 
		 */
		
		int i = 1;
		
		i++;
		System.out.println("Valore di i dopo incremento: " + i);
		
		i=4;
		System.out.println("Il valorei di i è: " + ++i);
		System.out.println(i);
		
	
	}

}
