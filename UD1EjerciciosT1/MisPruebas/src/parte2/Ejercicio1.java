package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo. 
		 (SIN UTILIZAR Math.round())
		 */
		Scanner scan = new Scanner(System.in);
		//Ecribe numero en formato entero,decimal
		System.out.println("Escribe un número con decimales");
		double numero = scan.nextDouble();
		if ((numero - (int) numero) >= 0.5) {
			numero++;
		}
		System.out.println((int) numero);
		
		scan.close();
	}

}
