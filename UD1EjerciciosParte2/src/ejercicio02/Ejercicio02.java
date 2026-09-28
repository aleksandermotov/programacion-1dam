package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/* Diseña una aplicación que pida una cantidad entera de segundos y la convierta en horas, minutos y segundos. 
		 Para realizar la descomposición utiliza los operadores / y %.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cantitad de segundos");
		int segundos = scan.nextInt();
		scan.close();
		int horas = segundos/3600;
		segundos = segundos%3600;
		int minutos = segundos/60;
		segundos = segundos%60;
		System.out.println(horas + " horas " + minutos + " minitos " + segundos + " segundos");
		
	}

}
