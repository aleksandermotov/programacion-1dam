package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
		 (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media 
		 del curso como se utiliza en el boletín de calificaciones (solo la parte entera) y 
		 como se usa en el expediente académico (con decimales).
		 */
		Scanner scan = new Scanner(System.in);
		Integer notaDeTrimestre = 0;
		Integer sumaDeNotas = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Escribe nota de " + (i+1) + "º trimestre");
			notaDeTrimestre = scan.nextInt();
			sumaDeNotas += notaDeTrimestre;
		}
		System.out.println("Tu nota media\nBoletín de calificaciones: " + (sumaDeNotas/3) + "\nExpediente académico: " + String.format("%.2f",(sumaDeNotas/3.0)));
		
		scan.close();
	}

}
