package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_3 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Dime tu edad");
		int edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			
		}else {
			System.out.print("Eres menor de edad");
		}
		

	}

}
/*Crea una aplicación que solicite al usuario su edad y después muestre el mensaje “ERES MAYOR
DE EDAD” si la edad introducida es igual o mayor que 18. En caso contrario; debe mostrarse el
mensaje “ERES MENOR”*/