package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe año actual");
		Integer anoActual = scan.nextInt();
		System.out.println("Escribe tu año de nacimiento");
		Integer anoNacimiento = scan.nextInt();
		System.out.println("Tienes " + (anoActual-anoNacimiento) + " años");
		scan.close();
	}

}
