package ejercicio06;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*Simula el lanzamiento de un dado. Genera mediante Math.random() un número entero aleatorio comprendido entre 1 y 6, ambos incluidos. 
		Recuerda que será necesario realizar una conversión de tipo (cast).
		*/
		for (int i = 0; i < 6; i++) {
			int lanzo = (int) (Math.random()*(6))+1;
			System.out.println("Tu número es " + lanzo);
		}
	}

}
