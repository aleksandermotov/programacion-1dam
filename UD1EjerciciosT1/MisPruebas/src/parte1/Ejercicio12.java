package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
		 * Por este motivo, es necesario diseñar una aplicación que solicite las ventas 
		 * (en kilos, tanto de las peras como de las manzanas). 
		 * La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ 
		 * y el kilo de peras en 1,95€.
		 */
		final Double MANZANAS_PRECIO = 2.35;
		final Double PERAS_PRECIO = 1.95;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cantidad de manzanas que ha ventado en este año en kilo");
		Double manzanasVentanas = scan.nextDouble();
		System.out.println("Escribe cantidad de peras que ha ventado en este año en kilo");
		Double perasVentanas = scan.nextDouble();
		System.out.println("Tu beneficio anual es " + String.format("%.2f",((manzanasVentanas*MANZANAS_PRECIO)+(perasVentanas*PERAS_PRECIO))) + "€");
		
		scan.close();
	}

}
