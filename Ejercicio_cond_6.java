package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_6 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número entre el 1 - 7");
		int numero = teclado.nextInt();
		
		if(numero == 1) {
			System.out.println("Lunes");
		}else if(numero == 2) {
			System.out.println("Martes");
			
		}else if(numero == 3) {
			System.out.println("Miércoles");
			
		}else if(numero == 4) {
			System.out.println("Jueves");
			
		}else if(numero == 5) {
			System.out.println("Viernes");
			
		}else if(numero == 6) {
			System.out.println("Sábado");
			
		}else if(numero == 7) {
			System.out.println("Domingo");
			
		}else  {
			System.out.print("Número incorreto");
			
		}
		
		
		

	}

}
/*Crea un programa que solicita un valor numérico comprendido entre 1 y 7 y devuelve el
nombre de un día de la semana correspondiente, tal que el 1 es Lunes, y el 7 es el Domingo.*/