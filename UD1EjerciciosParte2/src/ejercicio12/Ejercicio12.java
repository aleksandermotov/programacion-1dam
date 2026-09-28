package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*Pide al usuario su edad y utiliza el operador ternario para calcular el precio de una entrada: 6,50 € si es menor de 18 años y 
		 9,50 € en caso contrario. Muestra el precio correspondiente.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Tu edad?");
		int edad = scan.nextInt();
		scan.close();
		double precio = 6.50;
		if (edad>=18) {
			precio = 9.50;
		}
		System.out.print("Tiene que pagar ");
		System.out.printf("%.2f", precio);
		System.out.println( "€");

	}

}
