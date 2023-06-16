import java.security.PublicKey;
import java.util.Iterator;

/**
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:
 * 
 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
 * PERTENECE A LA CADENA O NO perteneceACadena 2) HACER UN MÉTODO QUE RECIBA UNA
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
 * 
 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
 * 
 * 
 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar 4) HACER UN
 * MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
 * mayorDeEdad 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI
 * EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota - 6)
 * HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 7)
 * HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres
 *
 *
 * // DEFINO UN MÉTODO // DARLE UN NOMBRE - camelCase // ID la entrada - // ID
 * la salida -
 *
 * //pensar los pasos en español en psuedocódigo.
 */

public class EjercicosBasicos {
	public static void main(String[] args) {
		int resultado = sumarDeTresEnTres();
		
	}
		
	public static int sumarDeTresEnTres() {
		int numero = 3;
		while (numero < 100) {
			System.out.println(numero);
			numero = numero + 3;
		}
		return numero;
	}
}
	
		/*String cadena = "Hola, mundo!";
		char caracter = 'a';
		int i;

		if (cadena.contains(Character.toString(caracter))) {
			System.out.println("El carácter '" + caracter + "' está presente en la cadena.");
		} else {
			System.out.println("El carácter '" + caracter + "' no está presente en la cadena.");
		}

		int contar = contarCaracteres(cadena, caracter);
		System.out.println("el caracter " + caracter + " aparece " + contar + " veces");

		int posicion = posicionCaracteres(cadena, caracter);
		System.out.println("el caracter " + caracter + " se encuentra en la posicion " + contar);

	}

	public static record contarCaracteres(String cadena, char caracter) { c 
		int contar = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contar++;
			}
		}
		return 0;
	}
	

	public static record posicionCaracteres(String cadena, char caracter) {
    	int contador = 0;
    	for (contador = cadena.length() - 1; contador <= 0; contador--) {
			if (cadena.charAt(contador) == caracter) {
				return contador ;
			}
		}
    	return -1;/
    }
}
}*/