package Hilos.EjercicioD_Parada;

/**
 * D. Finalizar un hilo (Flag de parada)
 * Ejemplo de cómo detener un hilo de forma controlada utilizando una variable booleana (stopHilo)
 * en lugar del método obsoleto stop().
 */
public class HiloEjemploDead extends Thread {
    private boolean stopHilo = false;
    
    public void pararHilo() {
        stopHilo = true;
    }

    public void run() {
        while (!stopHilo) {
            System.out.println("En el hilo");
        }
    }

    public static void main(String[] args) {
        HiloEjemploDead h = new HiloEjemploDead();
        h.start();
        // Bucle de espera simulada
        for (int i=0; i < 100000; i++); 
        h.pararHilo();
    }
}
