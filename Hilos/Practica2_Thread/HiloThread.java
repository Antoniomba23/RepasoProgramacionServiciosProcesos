package Hilos.Practica2_Thread;

/**
 * Práctica 2 (Sobre Thread):
 * Modifica el ejemplo HiloThread para ejecutar dos hilos en vez de solo uno.
 */
public class HiloThread extends Thread {
    public HiloThread(String str) {
        super(str);
    }

    public void run() {
        System.out.println("Creando hilo.. " + this);
        System.out.println("Ejecutando " + getName());
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminando " + getName());
    }

    public static void main(String[] args) {
        System.out.println("Creando hilos en el main");
        
        // Ejecutamos dos hilos
        new HiloThread("Hilo Thread 1").start();
        new HiloThread("Hilo Thread 2").start();
        
        System.out.println("Termina el main");
    }
}
