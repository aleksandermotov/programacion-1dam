package parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*El cinquecento es un periodo del arte europeo (principalmente italiano) enclavado en pleno Renacimiento. 
		Aunque su nombre esconde el número cinco, en realidad ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, 
		"años [mil] quinientos", en italiano, y es que el siglo XVI comprendió los años desde el 1501 al 1600, igual que el siglo XXI empezó en el 2001, 
		con un 20 en sus dos primeros dígitos y no un 21.
 		Dado un año, ¿de qué siglo es?
 		*/
		//es metodo principal que conventa año en siglo númerico
		//por defecto siglo es antes cristo
		String antesDespuesCristo = "a.c."; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Escibe un año, si es año antes de 0 lo escribe con -XXXX");
		int ano = scan.nextInt();
		scan.close();
		//restamos uno para que años tipo XX00 entran en siglo correcto
		//eliminamos parte que no nos enteresan
		int siglo = (ano-1)/100;
		if (ano > 0) {
		//para siglo positivo tiene sumar uno y apuntar que es siglo despues cristo
			siglo++;
			antesDespuesCristo = "d.c.";
		} else {
		//y para negativo disminuar uno
			siglo--;
		}
		//vamos a usar otro metodo para preparar convertir cifras arabico en romanos
		String sigloRomano = romaConvert(siglo);
		
		System.out.println(ano + " año es " + sigloRomano + " siglo " + antesDespuesCristo);
	}
	
	public static String romaConvert(int siglo) {
        //Esto metodo preparo el numero de siglo para convertacion
		String returnDeConvert ="" ;
		//converte en un número positivo
		siglo = Math.abs(siglo);
		//divide a dos partes: decenas y unidades
		int sigloPrimeraParte = siglo/10;
		int sigloUltimaPatre = siglo%10;
		//comprovamos si hay decenas y usamos otro metodo que va a convertir un cifra arabica en romano, damos como atributos
		//una cifra y simbolos para decenas o unidades
		if (sigloPrimeraParte > 0) {
			returnDeConvert += cifraConvert(sigloPrimeraParte, "CLX");
		}
		returnDeConvert += cifraConvert(sigloUltimaPatre, "XVI");
		//devolvemos string completo
		return returnDeConvert;
	}
	public static String cifraConvert(int cifra, String letras) {
		//esto metodo converte un cifra a una cadena de cimbolos desde atributos
        String returnDeConvert ="" ;
        //tenemos cuatro situaciones: 9, 8-5, 4, 3-1, para cada necectita sus acciones
        if (cifra == 9) {
        	returnDeConvert += letras.substring(2) + letras.substring(0,1);
        } else {
        	if (cifra >= 5) {
        		returnDeConvert += letras.substring(1,2) + letras.substring(2).repeat(Math.abs(5-cifra));   		
        	} else {
        		if (cifra == 4) {
        			returnDeConvert += letras.substring(2) + letras.substring(1,2);
        		} else {
        			returnDeConvert += letras.substring(2).repeat(cifra);
        		}
        	}
        }
        //devolvemos string de una cifra
        return returnDeConvert;
	}
}
