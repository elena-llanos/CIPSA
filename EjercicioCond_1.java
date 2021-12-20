package cipsa;

import java.util.Scanner;

public class EjercicioCond_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unidades = 0;
		double precioVenta = 0;
	
		
		System.out.println("Introduce unidades");
		unidades = sc.nextInt();
		System.out.println("Introduce precio unidad");
		precioVenta = sc.nextInt();
		
		
		double resultado = unidades * precioVenta;
		if (resultado > 10 ) {
			resultado = resultado - (resultado * 0.05) ;
			
		}else {
			resultado = resultado - (resultado * 0.03);
		}
		System.out.println("El precio final es de " + resultado);
		
		

	}

}
