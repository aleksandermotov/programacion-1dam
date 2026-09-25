package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla un mensaje como el siguiente: 
		 * “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String nombre = scan.nextLine();
		System.out.println("Escribe tu edad");
		Integer edad = scan.nextInt();
		System.out.println("\"Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!\"");
		
		scan.close();
	}

}
