package HilosSincroParcialHerencia;


public class Hilos_SincronizacionII extends Thread{
	

	@Override
	public void run(){
		synchronized (Hilos_Principal_Sincronizacion.class) {
		for(int j=1;j<=7 ;j++){
			//imprimimos mensaje por consola
			System.out.println(j +" soy Emprendedor " + (7 - j + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionII.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		}
	} //fin del metodo run....
} // fin del metodo principal
