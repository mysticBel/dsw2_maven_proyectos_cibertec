package HilosSincroParcialHerencia;


public class Hilos_SincronizacionIII extends Thread{
	

	
	@Override
	public void run(){
		synchronized (Hilos_Principal_Sincronizacion.class) {
		for(int k=1;k<=7 ;k++){
			//imprimimos mensaje por consola
			System.out.println(k +" soy Emprendedor " + (7 - k + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionIII.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		}
	} //fin del metodo run....
} // fin del metodo principal
