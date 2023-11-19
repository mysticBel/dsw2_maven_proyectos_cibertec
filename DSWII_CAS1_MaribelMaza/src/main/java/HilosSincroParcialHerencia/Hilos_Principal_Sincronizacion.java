package HilosSincroParcialHerencia;

public class Hilos_Principal_Sincronizacion  {
	
    public static void main(String[] args) throws InterruptedException{
        // Crear instancias de los hilos
        Hilos_SincronizacionI hilo1 = new Hilos_SincronizacionI();
        Hilos_SincronizacionII hilo2 = new Hilos_SincronizacionII();
        Hilos_SincronizacionIII hilo3 = new Hilos_SincronizacionIII();
        Hilos_SincronizacionIV hilo4 = new Hilos_SincronizacionIV();
        Hilos_SincronizacionV hilo5 = new Hilos_SincronizacionV();
        Hilos_SincronizacionVI hilo6 = new Hilos_SincronizacionVI();
        Hilos_SincronizacionVII hilo7 = new Hilos_SincronizacionVII();

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();

    
		
    }
    
}

