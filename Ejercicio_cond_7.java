package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_7 {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int numeroAdivinar =0;
		
		System.out.println("Introduce un n�mero");
		int numero = teclado.nextInt();
		
		System.out.println("ahora adivina el n�mero");
		numeroAdivinar = teclado.nextInt();
		
		if(numeroAdivinar > numero) {
			System.out.println("Too big");
			
		}else if(numeroAdivinar < numero) {
			System.out.println("too small");
		}
		
		
		
		

	}

}
/*Crear un programa que solicite al usuario un n�mero secreto. Despu�s el programa le pedir� al
usuario que adivine el n�mero. Si el usuario introduce un n�mero superior el programa
muestra el mensaje �NUMERO DEMASIADO GRANDE�. Si el usuario introduce un n�mero
inferior el programa muestra el mensaje �NUMERO DEMASIADO PEQUE�O�*/