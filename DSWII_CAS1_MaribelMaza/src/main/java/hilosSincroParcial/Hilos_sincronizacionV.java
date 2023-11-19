package hilosSincroParcial;

public class Hilos_sincronizacionV implements Runnable {

	public void run() {
		   for (int n = 1; n <= 7; n++) {	   
               System.out.println(n + " soy Emprendedor " + (7 - n + 1));
           	}
         }
	
}
