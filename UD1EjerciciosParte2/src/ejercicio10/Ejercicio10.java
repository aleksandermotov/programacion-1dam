package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Solicita al usuario un año. Calcula mediante una expresión booleana si el año es bisiesto. Muestra el resultado como true o false.
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un año");
		int ano = scan.nextInt();
		scan.close();
		boolean bisiesto = ano%400 == 0 || (ano%4 == 0 && ano%100 != 0); 
		System.out.println("Año es bisiesto? > " + bisiesto);

	}

}
