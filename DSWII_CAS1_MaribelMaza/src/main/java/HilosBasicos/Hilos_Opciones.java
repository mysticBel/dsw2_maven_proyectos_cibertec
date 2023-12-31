
package HilosBasicos;

public class Hilos_Opciones extends Thread{
    
	// Declaramos variable opcion para consulta en consola
	private int opcion;

	
    public Hilos_Opciones(int opcion)  {
        this.opcion = opcion;
    }

    //metodo run
    @Override
    public void run() {
        switch (opcion) {
            case 1:
                mostrarNumerosPares();
                break;
            case 2:
                mostrarLetras();
                break;
            case 3:
                mostrarSerieMenor1000();
                break;
            case 4:
                recorridoAtletas();
                break;
            default:
                System.out.println("Opci�n no v�lida");
        }
    }// fin metodo run

    // Case 1 :
    private void mostrarNumerosPares() {
        for (int numPar = 2; numPar <= 20; numPar += 2) {
            System.out.print(numPar + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        System.out.println("Termin� mostrar n�meros pares menores a 20.");
    } // fin metodo mostrarNumerosPares

    // Case 2 :
    private void mostrarLetras() {
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            System.out.print(caracter + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        System.out.println("Termin� mostrar letras abecedario.");
    } // fin metodo mostrarLetras

    // Case 3 :
    private void mostrarSerieMenor1000() {
        int num = 1;
        while (num < 1000) {
            System.out.print(num + " ");
            num = (int) Math.pow(num, 2) + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        System.out.println("Termin� la serie (n^2 + 1) menor a 1000.");
    } // fin metodo mostrarSerieMenor1000

    // Case 4 :
    private void recorridoAtletas() {
        Atleta alberto = new Atleta("Alberto", 7);
        Atleta martin = new Atleta("Martin", 2);
        Atleta ricardo = new Atleta("Ricardo", 2);

        alberto.start();
        martin.start();
        ricardo.start();
        try {
            alberto.sleep(100);
            ricardo.sleep(100);
            martin.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    } // fin metodo recorridoAtletas
    
} // fin claseHilos_Opciones
