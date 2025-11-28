package Hilos.Practica1_Runnable;

/**
 * Práctica 1 (Sobre Runnable):
 * Modifica el ejemplo HiloRunnable para ejecutar dos hilos en vez de solo uno.
 */
public class HiloRunnable implements Runnable {
    Thread t;
    String nombre;

    public HiloRunnable(String nombre) {
        this.nombre = nombre;
        t = new Thread(this, nombre);
        System.out.println("Creando hilo: " + t);
        t.start(); // Punto de entrada del hilo
    }

    public void run() {
        System.out.println("Hilo " + nombre + " en ejecución");
        try {
            Thread.sleep(500); // Simular algo de trabajo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hilo " + nombre + " terminando");
    }

    public static void main(String[] args) {
        System.out.println("Creando hilos en el main");
        
        // Creamos dos hilos
        new HiloRunnable("Hilo 1");
        new HiloRunnable("Hilo 2");
        
        System.out.println("Termina el main (los hilos pueden seguir ejecutándose)");
    }
}
