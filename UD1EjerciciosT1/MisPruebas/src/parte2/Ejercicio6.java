package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Solicita al usuario tres distancias:
			La primera, medida en milímetros.
			La segunda, medida en centímetros.
			La última, medida en metros.
			Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Ecribe cantidad de milímetros, centtímetros y metros una por una");
		Integer mmetros = scan.nextInt();
		Integer cmetros = scan.nextInt();
		Integer metros = scan.nextInt();
		scan.close();
		System.out.println("Suma de tres medidas es " + (mmetros/10 + cmetros + metros*100) + " centímetros");
		
	}

}
