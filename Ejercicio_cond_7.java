package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_7 {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int numeroAdivinar =0;
		
		System.out.println("Introduce un número");
		int numero = teclado.nextInt();
		
		System.out.println("ahora adivina el número");
		numeroAdivinar = teclado.nextInt();
		
		if(numeroAdivinar > numero) {
			System.out.println("Too big");
			
		}else if(numeroAdivinar < numero) {
			System.out.println("too small");
		}
		
		
		
		

	}

}
/*Crear un programa que solicite al usuario un número secreto. Después el programa le pedirá al
usuario que adivine el número. Si el usuario introduce un número superior el programa
muestra el mensaje “NUMERO DEMASIADO GRANDE”. Si el usuario introduce un número
inferior el programa muestra el mensaje “NUMERO DEMASIADO PEQUEÑO”*/