package parte1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		Integer numero = scan.nextInt();
		System.out.println("Tu número es " + numero);
		scan.close();
	}
}
