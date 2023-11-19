package HilosSincroParcialHerencia;


public class Hilos_SincronizacionVI extends Thread{
	

	
	@Override
	public void run(){
		synchronized (Hilos_Principal_Sincronizacion.class) {
		for(int n=1;n<=7 ;n++){
			//imprimimos mensaje por consola
			System.out.println(n +" soy Emprendedor " + (7 - n + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionVI.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		}
	} //fin del metodo run....
} // fin del metodo principal
