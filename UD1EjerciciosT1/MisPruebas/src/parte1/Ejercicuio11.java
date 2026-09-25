package parte1;

import java.util.Scanner;

public class Ejercicuio11 {

	public static void main(String[] args) {
		/*Realiza un conversor de pesetas a euros. 
		 * Para ello, pídele al usuario que te introduzca el valor en pesetas y, a posteriori, 
		 * debes mostrarle el resultado de la conversión.(1€ = 166 ptas).
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ecribe un valor en pesetas");
		Integer ptas = scan.nextInt();
		System.out.println(ptas + " pesetas = " + String.format("%.2f",(ptas/166.0)) + " €");
		
		scan.close();	
	}

}
