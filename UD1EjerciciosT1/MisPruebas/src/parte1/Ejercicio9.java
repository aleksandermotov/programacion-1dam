package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
		 * (mediante un literal booleano: true o false).
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe tu edad");
		Integer edad = scan.nextInt();
		Boolean mayorOMenor = edad >= 18;
		System.out.println("Tu eres mayor de edad? Es " + mayorOMenor);
		
		scan.close();
	}

}
