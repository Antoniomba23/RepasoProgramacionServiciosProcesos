package Hilos.Practica3_JoinRunnable;

public class HiloRunnable implements Runnable {
    private int n;
    private String nombre;

    public HiloRunnable(String nom, int n) {
        this.nombre = nom;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(nombre + ":" + i);
            try {
                Thread.sleep(50); // Pequeña pausa para ver la alternancia
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin bucle " + nombre);
    }
}
