package parte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Integer calculador = 1;
		Scanner scan = new Scanner(System.in);
		Float nota = 1F;
		Float notaSumma = 0F;
		//escribe 0 < o < 10 para acabar caclular, no calculo numero fuera de rango
		while (nota > 0 && nota < 11) {
			System.out.println("Escribe su " + calculador + "ª nota");
			nota = scan.nextFloat();
			notaSumma += nota;
			calculador++;
		}
		Float notaMedia = notaSumma/calculador; 
		System.out.println("Tu nota media es " + String.format("%.2f",notaMedia));
		scan.close();
	}

}
