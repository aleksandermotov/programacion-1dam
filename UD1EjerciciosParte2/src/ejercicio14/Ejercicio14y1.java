package ejercicio14;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14y1 {

	public static void main(String[] args) {
		/*Un videojuego comienza con 100 puntos y 3 vidas. 
		 Modifica estas variables utilizando los operadores +=, -=, ++ y -- para representar esta secuencia: gana 50 puntos, pierde 20 puntos, 
		 obtiene una vida extra y después pierde una vida. Muestra el estado final.
		 */
		//Pruebo hacer un juego de calculos para usar sistema + - puntos y vidas
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int vidas = 3;
		int puntos = 100;
		int numUno = 0;
		int numDos = 0;
		int sum = 0;
		while (vidas > 0 && vidas < 5) {
			System.out.println(vidas + " vidas " + puntos + " puntos");
			numUno = rand.nextInt(1,11);
			numDos = rand.nextInt(1,11);
			System.out.print(numUno + " + " + numDos + " = ");
			sum = scan.nextInt();
			if (sum == numUno+numDos) {
				puntos += 50;
			} else {
				puntos -= 20;
			}
			if (puntos >= 500) {
				vidas++;
				puntos = 100;
			}
			if (puntos < 0) {
				vidas--;
				puntos = 100;
			}
		}
		scan.close();	
		if (vidas > 0) {
			System.out.println("You WIN");
		} else {
			System.out.println("You LOSE");
		}
	}

}
