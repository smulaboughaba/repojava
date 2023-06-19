/**
 * TODO
 * HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO
 * SU ESTATURA EN METROS Y SU PESO EN KG Y LE INFORME SU 
 * INFORME DE SU ÍNDICE DE MASA CORPORAL (IMC) SEGÚN LA SIGUIENTE FÓRMULA
 * 
 * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS
 *  * SI IMC < 16 ->> su imc es DESNUTRIDO
 * SIr IMC >= 16 Y < 18  ->> su imc es DELGADO
 * SI IMC >= 18 Y < 25  ->> su imc es IDEAL
 * SI IMC >= 25 Y < 31  ->> su imc es SOBREPESO
 * SI IMC >= 31 ->> su imc es OBESO
 ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL,
pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
  */




package ejercicios_3;

import java.util.Scanner;

public class ejercicios_3 {
	public static void main(String[] args) {
	
		
		double imc = pideDatosYCalculaIMC();
		System.out.println("Su IMC numerico es " + imc );
	}
	
	
	public static double pideDatosYCalculaIMC() {
		
		double imc;
		double peso =0;
		double altura =0;
		
			Scanner teclado;
			
			System.out.println("Indica tu peso en kg :");
			teclado = new Scanner(System.in);
			peso = teclado.nextDouble();
			
			System.out.println("y ahora indica tu altura en metros :");
			 altura = teclado.nextDouble();
			teclado.close();
			
			imc = peso/((altura*altura));
			System.out.println(imc);
			
			switch ((imc < 16) ? 0 : (imc > 16 && imc < 18) ? 1 : (imc > 18 && imc < 25) ? 2 : (imc > 25 && imc < 31) ? 3 : 4 ) {
			case 0 : System.out.println("su IMC es desnutrido");break;
			case 1 : System.out.println("su IMC es delgado");break;
			case 2 : System.out.println("su IMC es el ideal");break;
			case 3 : System.out.println("su IMC es sobrepeso");break;
			case 4 : System.ou
			t.println("su IMC es obeso");break;
			}
		return imc;
		
	}

}
