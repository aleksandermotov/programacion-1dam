package ejercicio08;

import java.util.Scanner;

public class Ejercicios08 {

	public static void main(String[] args) {
		/*Una empresa guarda productos en cajas con una capacidad determinada. 
		 Pide al usuario el número de productos y la capacidad de cada caja. 
		 Calcula cuántas cajas son necesarias para guardar todos los productos utilizando Math.ceil(). 
		 El resultado final debe mostrarse como un número entero.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el número de productos y la capacidad de caja");
		int cantidadDeProductos = scan.nextInt();
		double capacidadDeCaja = scan.nextDouble();
		scan.close();
		System.out.println("Para " + cantidadDeProductos + " productos nececita " + (int) Math.ceil(cantidadDeProductos/capacidadDeCaja) + " cajas con capacidad de " + (int) capacidadDeCaja + " productos");
	}

}
