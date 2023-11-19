package HilosSincroParcialHerencia;


public class Hilos_SincronizacionV extends Thread{
	

	
	@Override
	public void run(){
		synchronized (Hilos_Principal_Sincronizacion.class) {
		for(int m=1;m<=7 ;m++){
			//imprimimos mensaje por consola
			System.out.println(m +" soy Emprendedor " + (7 - m + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionV.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		}
	} //fin del metodo run....
} // fin del metodo principal
