package Hilos.EjercicioC_Join;

public class Hilo extends Thread {
    private int n;
    public Hilo(String nom, int n) {
        super(nom);
        this.n = n;
    }
    public void run() {
        for (int i=1; i <= n; i++) {
            System.out.println(getName() + ":" + i);
        }
        System.out.println("Fin bucle " + getName());
    }
}
