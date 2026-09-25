package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Dado el siguiente polinomio de segundo grado:
			y=ax2+bx+c
			Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe valor de a,b,c y x uno por uno");
		Integer valorA = scan.nextInt();
		Integer valorB = scan.nextInt();
		Integer valorC = scan.nextInt();
		Integer valorX = scan.nextInt();
		Integer valorY = valorA*valorX+valorX*valorX*valorB+valorC;
		System.out.println(valorA + " x " + valorX + "^2 + " + valorB + " x " + valorX + " + " + valorC + " = " + valorY);
		
		scan.close();
	}

}
