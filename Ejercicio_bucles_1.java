package cipsa;

import java.util.Scanner;

public class Ejercicio_bucles_1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = 0;

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		do {
			System.out.println(numero++);
		}while(numero <=10);
		
		
		while (numero<=10) {
			System.out.println(numero++);
		}
	} 	
	

}
/*Crea una aplicación que muestre los números del 1 al 10 empleando los tres tipos de sentencias
repetitivas vistas ( for, while, do while )*/