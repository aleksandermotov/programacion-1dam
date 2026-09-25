package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Escribir un programa que le pida dos números al usuario. 
		 * A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. 
		 * Debe mostrarse el resultado de cada operación en una línea distinta.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ecribe 1º numero");
		Integer numeroPrimero = scan.nextInt();
		System.out.println("Ecribe 2º numero");
		Integer numeroSegundo = scan.nextInt();
		System.out.println(numeroPrimero + " + " + numeroSegundo + " = " + (numeroPrimero+numeroSegundo));
		System.out.println(numeroPrimero + " - " + numeroSegundo + " = " + (numeroPrimero-numeroSegundo));
		System.out.println(numeroPrimero + " * " + numeroSegundo + " = " + (numeroPrimero*numeroSegundo));
		//comprobamos si vamos obtener un numero entero o no
		if (numeroPrimero%numeroSegundo == 1 || numeroPrimero<numeroSegundo) {
			Float rezultadoDividirFloat = (float) numeroPrimero/numeroSegundo;
			System.out.println(numeroPrimero + " : " + numeroSegundo + " = " + String.format("%.2f",rezultadoDividirFloat));
		} else {
			Integer rezultadoDividirInteger = numeroPrimero/numeroSegundo;
			System.out.println(numeroPrimero + " : " + numeroSegundo + " = " + rezultadoDividirInteger);
		}
		
		scan.close();
	}

}
