package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dime un n�mero");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro n�mero");
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
/*Crea una aplicaci�n que solicite dos valores. Si el primer n�mero es mayor que el segundo debe
mostrarse el mensaje �A MAYOR QUE B�. Si el segundo n�mero es mayor que el primero debe
mostrarse el mensaje �B MAYOR QUE A�. Si ambos valores son iguales debe mostrarse el
mensaje �A IGUAL A B�.*/