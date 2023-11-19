package HilosBasicos;

public class Atleta extends Thread {
    private String nombre;
    private int distanciaRecorrida;

    public Atleta(String nombre, int distanciaInicial) {
        this.nombre = nombre;
        this.distanciaRecorrida = distanciaInicial;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(nombre + " recorre " + distanciaRecorrida + " km");
            distanciaRecorrida++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

