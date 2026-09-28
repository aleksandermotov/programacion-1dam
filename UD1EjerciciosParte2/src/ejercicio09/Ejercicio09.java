package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*Un depósito contiene una cantidad de litros de agua y se quiere llenar botellas de una capacidad
		 determinada. Solicita ambos valores y calcula cuántas botellas completas pueden llenarse 
		 utilizando Math.floor().
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cantidad de agua total y capacidad de las botellas");
		int cantidadDeAgua = scan.nextInt();
		double capacidadDeBottela = scan.nextDouble();
		scan.close();
		System.out.println("Con " + cantidadDeAgua + " litros de agua se puede llenar " + (int) Math.floor(cantidadDeAgua/capacidadDeBottela) + " botellas con capacidad de " + (int) capacidadDeBottela + " litros");

	}

}
