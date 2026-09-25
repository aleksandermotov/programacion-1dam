package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		 /*Escribe un programa en el que declares una constante IVA de valor igual a 21. 
		  A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) 
		  y calcula cuál será el precio final con el IVA aplicado.
		  */
		final Integer IVA = 21;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el precio de un producto sin IVA");
		Double precioSinIva = scan.nextDouble();
		Double precioConIva = precioSinIva + (precioSinIva*IVA/100);
		System.out.println("Precio del producto con IVA es " + String.format("%.2f",precioConIva) + "€");

		scan.close();
	}

}
