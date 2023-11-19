package HilosSincroParcialHerencia;


public class Hilos_SincronizacionIV extends Thread{
	

	
	@Override
	public void run(){
		synchronized (Hilos_Principal_Sincronizacion.class) {
		for(int h=1;h<=7 ;h++){
			//imprimimos mensaje por consola
			System.out.println(h +" soy Emprendedor " + (7 - h + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionIV.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		}
	} //fin del metodo run....
} // fin del metodo principal
