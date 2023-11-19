package hilosSincroParcial;


public class Hilos_Principal_Sincronizacion {

	public static void main(String[] args) throws InterruptedException{

 
        Thread intefhilo1=new Thread(new Hilos_sincronizacionI());
        Thread intefhilo2=new Thread(new Hilos_sincronizacionII());
        Thread intefhilo3=new Thread(new Hilos_sincronizacionIII());
        Thread intefhilo4=new Thread(new Hilos_sincronizacionIV());
        Thread intefhilo5=new Thread(new Hilos_sincronizacionV());
        Thread intefhilo6=new Thread(new Hilos_sincronizacionVI());
        Thread intefhilo7=new Thread(new Hilos_sincronizacionVII());
        

        // Iniciar los hilos
        intefhilo1.start();
        intefhilo1.sleep(100);
        intefhilo2.start();
        intefhilo2.sleep(100);
        intefhilo3.start();
        intefhilo3.sleep(100);
        intefhilo4.start();
        intefhilo4.sleep(100);
        intefhilo5.start();
        intefhilo5.sleep(100);
        intefhilo6.start();
        intefhilo6.sleep(100);
        intefhilo7.start();
        intefhilo7.sleep(100);



	}

}
