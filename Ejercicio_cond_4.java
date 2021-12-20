package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dime un número");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro número");
		int numero2 = teclado.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("A es mayor que B");
			
		}else if (numero1 < numero2) {
			System.out.println("A es menor que B");
		}
		else if (numero1 == numero2) {
			System.out.println("Ambos valores son iguales");
		}

	}

}
/*Crea una aplicación que solicite dos valores. Si el primer número es mayor que el segundo debe
mostrarse el mensaje “A MAYOR QUE B”. Si el segundo número es mayor que el primero debe
mostrarse el mensaje “B MAYOR QUE A”. Si ambos valores son iguales debe mostrarse el
mensaje “A IGUAL A B”.*/