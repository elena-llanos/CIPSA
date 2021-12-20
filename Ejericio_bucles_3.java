package cipsa;

import java.util.Scanner;

public class Ejericio_bucles_3 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce un número del 1 -10");
		int numero = teclado.nextInt();
		
		for(int i = 1; i <= 10 ; i++) {
			
			System.out.println(i + " x " + numero +  " =  " +  i * numero     );
		}
		
		

	}

}
/*Crea una aplicación que solicite un valor comprendido entre 1 y 10 y muestre a continuación la
tabla de múltiplicar del valor introducido.*/