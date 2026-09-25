package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Modifica el ejercicio anterior para que, indicando dos números, 
		 por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe primero número");
		Integer dividendo = scan.nextInt();
		System.out.println("Escribe segundo número");
		Integer divisor = scan.nextInt();
		Integer respuesta = 0;
		while (dividendo%divisor > 0) {
			dividendo++;
			respuesta++;
		}
		System.out.println("Para que tu primer numero sea múltiplo de segundo nesesito sumar " + respuesta + "\n" + dividendo + " : " + divisor + " = " + (dividendo/divisor));

		scan.close();
	}

}
