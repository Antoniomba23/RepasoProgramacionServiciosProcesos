package Hilos.Practica5_Prioridades;

/**
 * Práctica 5 (Sobre Prioridades):
 * Utilizando el código de ejemplo de prioridades (HOLA LUNA / HOLA SOL), realiza las siguientes pruebas:
 * - Lo ejecutamos sin asignar prioridad.
 * - Lo ejecutamos asignando más prioridad a la luna (Mirar antes qué prioridad tiene cada uno).
 * - Lo ejecutamos asignando más prioridad al sol.
 * - Lo ejecutamos asignando la mínima prioridad a uno de los 2.
 * ¿Obtienes los resultados esperados?
 */
public class HiloPrioridad extends Thread {
    public HiloPrioridad(String nombre) { super(nombre); }

    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println(getName() + ":" + i + " (Prioridad: " + getPriority() + ")");
            try { sleep(100); } catch (InterruptedException e) {}
        }
    }

    public static void main(String args[]) {
        HiloPrioridad hLuna = new HiloPrioridad("HOLA LUNA ....");
        HiloPrioridad hSol = new HiloPrioridad("HOLA SOL ....");

        // Descomenta la sección que quieras probar:

        // 1. Sin asignar prioridad (Heredan la del padre, normal = 5)
        // (No hacemos nada)

        // 2. Más prioridad a la luna
        // hLuna.setPriority(Thread.MAX_PRIORITY); // 10
        // hSol.setPriority(Thread.MIN_PRIORITY);  // 1

        // 3. Más prioridad al sol
        // hSol.setPriority(Thread.MAX_PRIORITY); // 10
        // hLuna.setPriority(Thread.MIN_PRIORITY); // 1

        // 4. Mínima prioridad a uno de los 2 (ej. Luna)
        // hLuna.setPriority(Thread.MIN_PRIORITY);
        
        // Configuración actual para demostración (Ejemplo: Sol > Luna)
        System.out.println("Probando con Sol > Luna");
        hSol.setPriority(Thread.MAX_PRIORITY);
        hLuna.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Prioridad Luna: " + hLuna.getPriority());
        System.out.println("Prioridad Sol: " + hSol.getPriority());

        hLuna.start();
        hSol.start();
    }
}
