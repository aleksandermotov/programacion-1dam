package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*Escribe un programa que solicite al usuario la base y la altura de un rectángulo (pueden contener decimales). 
		 Debe calcular y mostrar su perímetro y su área.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ecribe la base y la altura de rectángulo");
		double base = scan.nextDouble();
		double altura = scan.nextDouble();
		scan.close();
		System.out.println("Perímetro de rectángulo = " + 2*(base+altura) + "\nÁrea de rectángulo = " + base*altura);

	}

}
