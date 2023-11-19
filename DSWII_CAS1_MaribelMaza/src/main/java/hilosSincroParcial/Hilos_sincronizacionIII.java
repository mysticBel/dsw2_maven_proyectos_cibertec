package hilosSincroParcial;

public class Hilos_sincronizacionIII implements Runnable {

	public void run() {
		   for (int k = 1; k <= 7; k++) {	   
               System.out.println(k + " soy Emprendedor " + (7 - k + 1));
           	}
         }
	
}
