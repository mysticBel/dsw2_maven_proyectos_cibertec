package HilosBasicos;

import java.util.Scanner;

public class Hilos_Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese una opción (1 al 4) :");
	        int opcion = scanner.nextInt();

	        Hilos_Opciones hiloOpcion = new Hilos_Opciones(opcion);
	        hiloOpcion.start();
	        
	        scanner.close();
	}
}


