package Hilos.EjercicioA_Runnable;

/**
 * A. Creación de un Hilo implementando Runnable
 * Este ejemplo muestra cómo crear un hilo utilizando la interfaz Runnable.
 * El hilo imprime sus características y "Hilo en ejecución".
 */
// HiloRunnable.java
public class HiloRunnable implements Runnable {
    Thread t;
    public HiloRunnable() {
        t = new Thread(this, "Nuevo Hilo");
        System.out.println("Creando hilo.. " + t);
        t.start(); // Punto de entrada del hilo
    }

    public void run() {
        System.out.println("Hilo en ejecución");
    }

    public static void main(String[] args) {
        System.out.println("Creando un hilo en el main");
        new HiloRunnable();
        System.out.println("Termina el hilo");
    }
}
