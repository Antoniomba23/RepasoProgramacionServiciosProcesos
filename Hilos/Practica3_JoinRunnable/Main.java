package Hilos.Practica3_JoinRunnable;

/**
 * Práctica 3 (Sobre join):
 * Modifica el ejemplo de join anterior para utilizar Runnable en lugar de extender Thread.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos los objetos Runnable
        HiloRunnable r1 = new HiloRunnable("Hilo 1", 4);
        HiloRunnable r2 = new HiloRunnable("Hilo 2", 5);
        HiloRunnable r3 = new HiloRunnable("Hilo 3", 7);

        // Creamos los objetos Thread pasándoles el Runnable
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        
        t1.start();
        try {
            t1.join(); // Esperamos a que t1 termine
            System.out.println("Hilo 1 ha terminado, lanzando los siguientes...");
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        
        t2.start();
        t3.start();
        
        // Opcional: esperar a que terminen todos para imprimir "Final del programa"
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final del programa");
    }
}
