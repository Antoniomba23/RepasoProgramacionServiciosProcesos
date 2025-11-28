package Hilos.EjercicioE_Prioridades;

/**
 * E. Gestión de Prioridades
 * Ejemplo base para probar la priorización de hilos, donde los hilos imprimen un mensaje y duermen 100ms.
 */
public class Hilo extends Thread {
    public Hilo(String nombre) { super(nombre); }

    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try { sleep(100); } catch (InterruptedException e) {}
        }
    }

    public static void main(String args[]) {
        Hilo h1 = new Hilo("HOLA LUNA ....");
        Hilo h2 = new Hilo("HOLA SOL ....");
        h1.start();
        h2.start();
    }
}
