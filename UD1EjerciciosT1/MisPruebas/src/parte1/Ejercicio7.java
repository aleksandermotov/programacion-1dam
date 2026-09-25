package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Escribir un programa que le pida al usuario su nombre, dirección y teléfono. 
		 * Guarda cada dato en variables distintas. 
		 * A continuación, muestra los datos de la siguiente forma:
			Nombre: Elena
			Dirección: Calle Inventada
			Teléfono: 987654321
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String nombre = scan.nextLine();
		System.out.println("Escribe tu dirección");
		String direccion = scan.nextLine();
		System.out.println("Escribe tu teléfono");
		String telefono = scan.nextLine();
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		
		scan.close();		
	}

}
