package Hilos.EjercicioC_Join;

/**
 * C. Uso del método join()
 * Este ejemplo ilustra cómo el hilo principal espera a que finalicen los hilos hijos usando join().
 * El hilo hijo realiza un bucle de iteraciones.
 */
public class Main {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Hilo 1", 4);
        Hilo h2 = new Hilo("Hilo 2", 5);
        Hilo h3 = new Hilo("Hilo 3", 7);
        
        h1.start();
        try {
            h1.join(); // Esperamos a que h1 termine
        } catch (InterruptedException e) { }
        
        h2.start();
        h3.start();
        System.out.println("Final del programa");
    }
}
