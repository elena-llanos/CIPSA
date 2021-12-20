package cipsa;

import java.util.Scanner;

public class Ejercicio_bucles_0 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int suma = 0;
		int numero;

		
		System.out.println("Introduce un valor: ( -1 para finalizar )");
		numero = teclado.nextInt();
		while ( numero != -1 ) {
		suma += numero;
		System.out.println("Introduce un valor: ( -1 para finalizar )");
		numero = teclado.nextInt();
		}
		
		System.out.println("Sumatorio es: " + String.valueOf(suma));

	}

}
