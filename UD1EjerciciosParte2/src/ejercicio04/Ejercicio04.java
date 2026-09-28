package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*Pide al usuario un número real y muestra: el entero inmediatamente inferior mediante Math.floor(), 
		 el entero inmediatamente superior mediante Math.ceil() y el entero más cercano mediante Math.round().
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número real");
		double numero = scan.nextDouble();
		scan.close();
		System.out.println("Entrero inferior " + (int) Math.floor(numero) + "\nEntero superior " + (int) Math.ceil(numero) + "\nEntero más cercano " + Math.round(numero));

	}

}
