package cipsa;

import java.util.Scanner;

public class Ejercicio_switch_1 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calificacion = 0;
		
		
	
		
		System.out.print("Introduce tu calificacion");
		calificacion = teclado.nextInt();
		
		
		
		switch(calificacion) {


		case 1:

			if(calificacion > 0 && calificacion <= 2) {
				System.out.println("Tu califación es de MD");
			}break;

		case 2:

			if(calificacion > 0.00 && calificacion <= 2) {
				System.out.println("Tu califación es de MD");
			}break;
		case 3:

			if(calificacion == 3 && calificacion == 4) {
				System.out.println("Tu califación es de INS");
			}break;

		case 4:

			if(calificacion == 5) {
				System.out.println("Tu califación es de SUF");
			}break;
		case 5:

			if(calificacion == 6) {
				System.out.println("Tu califación es de BIEN");
			}break;
		case 6:

			if(calificacion == 7 && calificacion == 8 ) {
				System.out.println("Tu califación es de NOT");
			}break;
		case 7:

			if(calificacion == 9 && calificacion == 10 ) {
				System.out.println("Tu califación es de SOB");
			}break;
		}
		
	

	}

}
/*Crear una aplicación que muestre el texto correspondiente a las
calificaciones numéricas de los exámenes de unos alumnos. Si la calificación es 0,1 o 2
debe indicarse “MD”. Si la calificación es 3 o 4 se indica “INS”. Si la calificación es 5 se
indica “SUF”. Si es 6 “BN”. Si es 7 o 8 “NT”. Si es 9 o 10 “SOB”.*/