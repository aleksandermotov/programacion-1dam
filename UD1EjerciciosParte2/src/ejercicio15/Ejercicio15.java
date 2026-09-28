package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*Solicita tres números enteros a, b y c. Calcula y muestra el resultado de las expresiones a + b * c y (a + b) * c. 
		 Comprueba que los resultados pueden ser distintos y explica mediante un comentario en el código el motivo.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe 3 números enteros");
		int valorA = scan.nextInt();
		int valorB = scan.nextInt();
		int valorC = scan.nextInt();
		scan.close();
		//resultados son distintos porque diferente orden de calcula en primer primero es * y segundo + 
		//en segundo primero es que entre parentesis y despues *
		System.out.println(valorA + " + " + valorB + " * " + valorC + " = " + (valorA+valorB*valorC));
		System.out.println("(" + valorA + " + " + valorB + ") * " + valorC + " = " + ((valorA+valorB)*valorC));
	}

}
