package Hilos.Practica4_Sleep;

/**
 * Práctica 4 (Sobre sleep):
 * Modifica el ejemplo anterior para que los hilos acaben antes de que finalice el hilo padre sin utilizar join,
 * utilizando solo sleep(). Cada iteración de los bucles dentro del hilo deberá tener un sleep de 100 ms.
 */
public class HiloSleep extends Thread {
    private int n;
    
    public HiloSleep(String nom, int n) {
        super(nom);
        this.n = n;
    }
    
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(getName() + ":" + i);
            try { 
                // Cada iteración duerme 100ms como pide el enunciado
                sleep(100); 
            } catch (InterruptedException e) {}
        }
        System.out.println("Fin bucle " + getName());
    }

    public static void main(String[] args) {
        HiloSleep h1 = new HiloSleep("Hilo 1", 4); // Tardará aprox 400ms
        HiloSleep h2 = new HiloSleep("Hilo 2", 5); // Tardará aprox 500ms
        HiloSleep h3 = new HiloSleep("Hilo 3", 7); // Tardará aprox 700ms
        
        h1.start();
        h2.start();
        h3.start();
        
        // NO usamos join(). Usamos sleep() en el main para esperar.
        // El hilo más largo tarda ~700ms (7 * 100ms).
        // Dormimos el main un poco más para asegurar que terminen.
        try {
            System.out.println("Main durmiendo esperando a los hijos...");
            Thread.sleep(1000); // 1000ms > 700ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final del programa (Main despierta)");
    }
}
