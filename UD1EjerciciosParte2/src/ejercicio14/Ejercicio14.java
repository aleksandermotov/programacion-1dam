package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*Un videojuego comienza con 100 puntos y 3 vidas. 
		 Modifica estas variables utilizando los operadores +=, -=, ++ y -- para representar esta secuencia: gana 50 puntos, pierde 20 puntos, 
		 obtiene una vida extra y después pierde una vida. Muestra el estado final.
		 */
		int vidas = 3;
		int puntos = 100;
		System.out.println("Comenzas con " + vidas + " vidas y " + puntos + " puntos");
		puntos += 50;
		System.out.println("Tienes " + vidas + " vidas y " + puntos + " puntos");
		puntos -= 20;
		System.out.println("Tienes " + vidas + " vidas y " + puntos + " puntos");
		vidas++;
		System.out.println("Tienes " + vidas + " vidas y " + puntos + " puntos");
		vidas--;
		System.out.println("Acabas con " + vidas + " vidas y " + puntos + " puntos");
	}

}
