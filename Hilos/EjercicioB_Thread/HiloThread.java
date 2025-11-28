package Hilos.EjercicioB_Thread;

/**
 * B. Creación de un Hilo extendiendo Thread
 * Este ejemplo es equivalente al anterior, pero creando una subclase que extiende de Thread.
 */
// HiloThread.java
public class HiloThread extends Thread {
    public HiloThread(String str) {
        super(str);
    }

    public void run() {
        System.out.println("Creando hilo.. " + this);
        // ... lógica del hilo ...
    }

    public static void main(String[] args) {
        System.out.println("Creando un hilo en el main");
        new HiloThread("Hilo Thread").start();
        System.out.println("Termina el hilo");
    }
}
