package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*Diseña un programa que determine si una persona puede alquilar un vehículo. 
		 Solicita su edad y dos valores booleanos que indiquen si posee permiso de conducir y si tiene una sanción que le impida conducir. 
		 Podrá alquilarlo si es mayor de edad, tiene permiso y no tiene dicha sanción. Muestra únicamente el resultado booleano. stub
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto años tienes?");
		int edad = scan.nextInt();
		System.out.println("Tienes un permiso de conducir?");
		String respuesta = scan.next();
		boolean permiso = respuesta.equals("Si");		
		System.out.println("Tienes algina sanción?");
		respuesta = scan.next();
		boolean sancion = respuesta.equals("Si");
		scan.close();
		System.out.println("Puedes alquilar un vehículo? > " +(edad >= 18 && permiso && !sancion) );
	}	

}
