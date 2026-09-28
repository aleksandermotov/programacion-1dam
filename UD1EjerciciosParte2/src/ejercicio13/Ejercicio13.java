package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Pide al usuario una cantidad de dinero con decimales. 
		 Mediante un cast a int obtén la cantidad de euros enteros. 
		 A partir de la parte decimal, calcula también los céntimos y redondéalos correctamente.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cantidad de dinero con decimales");
		double cantidadConDecimales = scan.nextDouble();
		scan.close();
		int cantidadEntero = (int) cantidadConDecimales;
		int cantidadDeCentimos = (int) (cantidadConDecimales%1*100);
		System.out.println("Esto es " + cantidadEntero + " euros y " + cantidadDeCentimos + " céntimos");
	}

}