package cipsa;

import java.util.Scanner;

public class Ejercicio_bucles_4 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String usuario = "alumno";
		String contrasena = "cipsa";
		int contador = 0;
	
		
		
		do {
			System.out.println("Introduce usuario");
			usuario = teclado.nextLine();
			contador ++;
			if(contador > 2) {
				System.out.println("usuario rechazado");
				
				
			}
			if(usuario.equals("alumno")) {
				System.out.println("usuario correcto");
				
				
			}
			
			else {
				
				System.out.println("Usuario incorrecto: try again");
				
			}
			
			
		}while( !usuario.equals("alumno") );
		
		do {
			
		
			System.out.println("Introduce contraseña");
			contrasena = teclado.nextLine();
			contador++;
			if(contrasena.equals("cipsa")) {
				System.out.println("Welcome");
			}else {
				System.out.println("contraseña incorrecta: try again");
			}
		}while(!contrasena.equals("cipsa"));
		
		
	}

}
/*Crea una aplicación que solicite al usuario un nombre de usuario y una contraseña. El nombre
de usuario correcto será “ALUMNO” y la contraseña “CIPSA”. Si el usuario introduce mal el
nombre de usuario se indica el mensaje “USUARIO INCORRECTO”. Si el usuario introduce mal la
contraseña se indica el mensaje “CONTRASEÑA INCORRECTA”. En cualquiera de los dos casos,
la aplicación debe volver a solicitar el usuario y contraseña. Si el usuario falla por cinco veces se
le muestra un mensaje “USUARIO RECHAZADO”. Si el usuario acierta se le muestra el mensaje
“BIENVENIDO.*/