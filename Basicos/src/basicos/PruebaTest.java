package basicos;

//public class PruebaTest {
	//public int calcula() {
		//return 1 + 1;
	//}

	public static void main(String[] args) {

		System.out.println("HOLA MÁLAGA");

		// for (int a = 0; (a % 6) < 6; a++) {
		// System.out.println(a);
		// }

		Object cadena = "HOLA";
		//File fichero = (File)cadena;//esto no funciona porque cadena es del tipo string no fichero

		if (cadena instanceof String saludo) {
			saludo.length();
			String palabra = (String) cadena;

			int longi = palabra.length();
			System.out.println("cadena es un String de tamaño " + longi);
		} else {
			System.out.println("cadena no es un string");

		}
		// System.out.println (calcula());
	}

}
