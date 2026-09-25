package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
		 La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
		 */
		//Este aplicaciíon devolve cuanto horas, minutos y segundos completos es cantidad de segundos que se va a esctibir
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cantidad de segundos");
		Integer segundos = scan.nextInt();
		Integer dias = segundos/(3600*24);
		segundos -= dias*3600*24;
		Integer horas = segundos/3600;
		segundos -= horas*3600;
		Integer minutos = segundos/60;
		segundos -= minutos*60;
		//añade información sobre cantidad de días en caso si más de 0
		String diasInformacion = "";
		if (dias > 0) {
			diasInformacion = "" + dias + " dias ";
		}
		System.out.println("Esto es " + diasInformacion + horas + " horas " + minutos + " minutos y " + segundos + " segundos");
		
		scan.close();
	}

}
