package parte1;

import java.util.Scanner;

public class Ejercico2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe su edad");
		Integer edad = scan.nextInt();
		System.out.println("En siguiente año tendrás " + (edad+1) + " años");
		scan.close();
	}

}
