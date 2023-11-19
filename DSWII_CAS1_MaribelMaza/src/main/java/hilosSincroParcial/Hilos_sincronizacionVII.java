package hilosSincroParcial;

public class Hilos_sincronizacionVII implements Runnable {

	public void run() {
		   for (int q = 1; q <= 7; q++) {	   
               System.out.println(q + " soy Emprendedor " + (7 - q + 1));
           	}
         }
	
}
