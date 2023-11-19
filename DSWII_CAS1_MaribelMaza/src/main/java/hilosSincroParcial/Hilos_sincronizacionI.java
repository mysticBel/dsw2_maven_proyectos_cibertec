package hilosSincroParcial;

public class Hilos_sincronizacionI implements Runnable {

	public void run() {
		   for (int i = 1; i <= 7; i++) {	   
               System.out.println(i + " soy Emprendedor " + (7 - i + 1));
           	}
         }
	
}
