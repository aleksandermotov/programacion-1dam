package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		/*Escribe un programa que solicite un número real y muestre su valor absoluto y su raíz cuadrada utilizando métodos de la clase Math. 
		 Prueba el programa con diferentes valores positivos.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un numero real");
		double numero = scan.nextDouble();
		scan.close();
		if (numero > 0) {
			System.out.println("Valor absolute de " + numero + " es " + Math.abs(numero) + "\nSu raíz cuadrata es " + Math.sqrt(numero));
		} else {
			System.out.println("No se puede hacer raíz cuadrata para números negativos");
		}
	}
}
