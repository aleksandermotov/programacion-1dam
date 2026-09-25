package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Escribe un programa que tome como entrada un número entero e 
		 indique qué cantidad hay que sumarle para que sea múltiplo de 7. 
		 Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
		 En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		Integer numero = scan.nextInt();
		Integer respuesta = 0;
		while (numero%7 > 0) {
			numero++;
			respuesta++;
		}
		System.out.println("Para que tu numero sea múltiplo de 7 nesesito sumar " + respuesta + "\n" + numero + " : 7 = " + (numero/7));

		scan.close();
	}

}
