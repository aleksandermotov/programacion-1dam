package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*Una tienda aplica un descuento fijo del 15% y, posteriormente, un IVA del 21%. Declara ambos porcentajes como constantes. 
		 Pide el precio inicial al usuario, calcula el precio final y muéstralo redondeado a dos cifras decimales utilizando Math.round().
		 */
		final double DESCUENTO = 0.15;
		final double IVA = 0.21;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escrive precio inicial");
		double precioInicial = scan.nextDouble();
		scan.close();
		double precioConDescuento = Math.round(precioInicial*(1-DESCUENTO)*100)/100.0;
		System.out.println(precioConDescuento);
		double precioConIVA = Math.round(precioConDescuento*(1+IVA)*100)/100.0;
		System.out.println("El precio final es " + precioConIVA + "€");
		
	}
}
