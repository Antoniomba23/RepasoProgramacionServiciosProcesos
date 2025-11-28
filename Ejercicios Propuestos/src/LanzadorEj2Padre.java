import java.io.IOException;
import java.util.Scanner;

public class LanzadorEj2Padre {
//    2.- Crea un programa Java que visualice 5 veces la cadena que se le envía desde los
//    argumentos de main(). Si no se le envía ninguna cadena que muestre un mensaje indicándolo y
//    que finalice el programa con System.exit(1).
//    A continuación, crea un segundo programa Java que introduzca por teclado una cadena y
//    ejecute el programa anterior para visualizar 5 veces esa cadena.

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena para repetir 5 veces:");
        String texto = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp", System.getProperty("java.class.path"),
                "Ejercicio2Hijo",
                texto
        );

        // Heredar la salida para que se vea en pantalla
        pb.inheritIO();

        Process p = pb.start();
        int codigo = p.waitFor();

        if (codigo == 1) {
            System.out.println("\nEl proceso hijo finalizó con error (no recibió cadena).");
        } else if (codigo == 0) {
            System.out.println("\nProceso completado exitosamente.");
        }

        sc.close();
    }
}
