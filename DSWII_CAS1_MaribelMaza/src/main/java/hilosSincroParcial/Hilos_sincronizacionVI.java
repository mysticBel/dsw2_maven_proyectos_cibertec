package hilosSincroParcial;

public class Hilos_sincronizacionVI implements Runnable {

	public void run() {
		   for (int p = 1; p <= 7; p++) {	   
               System.out.println(p + " soy Emprendedor " + (7 - p + 1));
           	}
         }
	
}
