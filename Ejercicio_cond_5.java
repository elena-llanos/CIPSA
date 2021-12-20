package cipsa;

import java.util.Scanner;

public class Ejercicio_cond_5 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int billetes =0;
		int billetesAcumulados = 0;
		int plazas = 40;

			
				System.out.println("Bienvenido a la estación");
				System.out.println("Cuantos billetes desea comprar?");
				billetes = teclado.nextInt();
				teclado.nextLine();
				
				if(billetes < plazas) {
					
			
				System.out.println("todavía hay plazas libres " + (plazas  - billetes));
				
				System.out.println("Desea comprar más billetes?  NO = 1 : Si = 2 ");
				int respuesta = teclado.nextInt();
				
				if (respuesta == 1) {
					System.out.println("Gracias por su visita");
				}else if (respuesta ==2) {
					System.out.println("Cuantos billetes desea comprar?");
					billetes = teclado.nextInt();
					billetesAcumulados = billetesAcumulados + billetes;
					System.out.println(String.valueOf(billetesAcumulados));
					}

				}else {
					System.out.print("Ya no quedan plazas libres");
				}

			
				

	
			if (billetes > 5) {
				System.out.println("Son demasiados billetes, debes escoger menos");
			}
		

	}

}
