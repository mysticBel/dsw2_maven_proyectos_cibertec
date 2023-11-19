package hilosSincroParcial;

public class Hilos_sincronizacionII implements Runnable {

	public void run() {
		   for (int j = 1; j <= 7; j++) {	   
               System.out.println(j + " soy Emprendedor " + (7 - j + 1));
           	}
         }
	
}
