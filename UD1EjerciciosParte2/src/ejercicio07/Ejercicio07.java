package ejercicio07;

import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*Utiliza la clase Random para generar y mostrar tres valores: un número entero aleatorio entre 1 y 100, 
		 un número real aleatorio y un valor booleano aleatorio (true o false).
		 */
		Random rand = new Random();
		int numeroEntrero = rand.nextInt(1,101);
		//apunto diapasono para double porque sin eso solo da valores < 1
		double numeroReal = rand.nextDouble(-100,101);
		boolean trueFalse = rand.nextBoolean();
		System.out.println("Un número entero es " + numeroEntrero + "\nUn número real es " + numeroReal + "\nUn valor booleano es " + trueFalse);
	}

}
