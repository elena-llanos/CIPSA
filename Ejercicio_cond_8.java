package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_8 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introcude temperatura agua");
		int temperatura = teclado.nextInt();
		
		if(temperatura < 0) {
			System.out.println("Helado");
		}else if(temperatura >=0 && temperatura < 100) {
			System.out.println("L�quido");
		}else if(temperatura >=100 ) {
			System.out.println("Gaseoso");
		}

	}

}
/*Crea una aplicaci�n que solicite la temperatura del agua al usuario. A continuaci�n la aplicaci�n
debe mostrar los siguientes mensajes:
a. Si la temperatura es inferior a 0  �HELADO�
b. Si la temperatura est� comprendida entre 0 incluido y 100 excluido  LIQUIDO
c. Si la temperatura es igual o superior a 100  GASEOSO*/