package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Escribir un programa que pida un número al usuario e 
		 * indique mediante un literal booleano (true o false) si el número es par.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		Integer numero = scan.nextInt();
		Boolean par = (numero%2 == 0);
		System.out.println("Número es par? " + par);
			
		scan.close();
	}

}
