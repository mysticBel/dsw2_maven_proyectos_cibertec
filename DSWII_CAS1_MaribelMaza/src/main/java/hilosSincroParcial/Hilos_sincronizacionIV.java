package hilosSincroParcial;

public class Hilos_sincronizacionIV implements Runnable {

	public void run() {
		   for (int m = 1; m <= 7; m++) {	   
               System.out.println(m + " soy Emprendedor " + (7 - m + 1));
           	}
         }
	
}
