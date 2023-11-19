package HilosSincroParcialHerencia;


public class Hilos_SincronizacionI extends Thread{
	

	
	@Override
	public void run(){
		for(int i=1;i<=7 ;i++){
			//imprimimos mensaje por consola
			System.out.println(i +" soy Emprendedor " + (7 - i + 1));
		//aplicamos el metodo de retardo (sleep)
			try {

				Hilos_SincronizacionI.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		
	} //fin del metodo run....
} // fin del metodo principal
