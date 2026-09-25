package parte1;

import java.util.Scanner;

public class Ejercicio4y1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe su primera nota");
		Float notaPrimera = scan.nextFloat();
		System.out.println("Escribe su segunda nota");
		Float notaSegunda = scan.nextFloat();
		System.out.println("Tu nota media es " + ((notaPrimera+notaSegunda)/2));
		scan.close();
	}

}
