package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia. 
	 * Para ello, el usuario debe introducir el radio, que puede contener decimales. 
	 * Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Excribe un radio de la circunferencia");
		Double radio = scan.nextDouble();
		System.out.println("La longitud de la circunferencia = " + String.format("%.2f",2*Math.PI*radio));
		System.out.println("La área de la circunferencia = " + String.format("%.2f",Math.pow(Math.PI,2)*radio));
		scan.close();
	}

}
