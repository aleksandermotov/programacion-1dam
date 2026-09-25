package parte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Diseñar un algoritmo que nos indique si podemos salir a la calle. 
		Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y 
		hemos finalizado nuestras tareas. 
		Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: 
		el hecho de tener que ir a la biblioteca.
		Solicitar al usuario (mediante un booleano) si llueve, 
		si ha finalizado las tareas y si necesita ir a la biblioteca.
		El algoritmo debe mostrar mediante un booleano (true o false) 
		si es posible que se le otorgue permiso para salir a la calle.
		*/
		final String NO_PUEDES_SALIR = "Tu no puedes salir a la calle";
		final String PUEDES_SALIR = "Tu puedes salir a la calle";
		Scanner scan = new Scanner(System.in);
		System.out.println("Tienes que ir a la biblioteca?");
		//tienes dar todos respuesta en manera "Si" o "No"
		String respuesta = scan.nextLine();
		if (respuesta.equals("Si")) {
			System.out.println(PUEDES_SALIR);
			scan.close();
			System.exit(0);
		}
		System.out.println("Está lloviendo?");
		respuesta = scan.nextLine();
		if (respuesta.equals("Si")) {
			System.out.println(NO_PUEDES_SALIR);
			scan.close();
			System.exit(0);
		}
		System.out.println("Has finalizado todos tareas?");
		respuesta = scan.nextLine();
		if (respuesta.equals("No")) {
			System.out.println(NO_PUEDES_SALIR);
			scan.close();
			System.exit(0);
		}
		System.out.println(PUEDES_SALIR);
		scan.close();
	}

}
