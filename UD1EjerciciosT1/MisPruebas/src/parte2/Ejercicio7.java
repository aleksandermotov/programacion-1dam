package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular 
		 el importe que hay que cobrar en la taquilla por la compra de una serie de entradas 
		 (cuyo número será introducido por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; 
		 y de adultos, que cuestan 20€. En el caso de que el importe total sea igual o superior a 100€, 
		 se aplicará automáticamente un bono descuento del 5%.
		 */
		final Double entradaInfantilesPrecio = 15.50;
		final Double entradaAdultosPrecio = 20.00; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe camtidad de entrada compradas de infantiles y de adultos uno por uno");
		Integer entradasInfantiles = scan.nextInt();
		Integer entradasAdultos = scan.nextInt();
		scan.close();
		Double importeTotal = entradasAdultos*entradaAdultosPrecio + entradasInfantiles*entradaInfantilesPrecio;
		if (importeTotal > 100) {
			importeTotal *= 0.95;
		}
		System.out.println("Importe que hay que cobrar es " + importeTotal + "€");
	}

}
