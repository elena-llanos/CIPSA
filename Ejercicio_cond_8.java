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
			System.out.println("Líquido");
		}else if(temperatura >=100 ) {
			System.out.println("Gaseoso");
		}

	}

}
/*Crea una aplicación que solicite la temperatura del agua al usuario. A continuación la aplicación
debe mostrar los siguientes mensajes:
a. Si la temperatura es inferior a 0  “HELADO”
b. Si la temperatura está comprendida entre 0 incluido y 100 excluido  LIQUIDO
c. Si la temperatura es igual o superior a 100  GASEOSO*/