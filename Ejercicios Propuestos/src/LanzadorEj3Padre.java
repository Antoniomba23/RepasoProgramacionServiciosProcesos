import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LanzadorEj3Padre {
//    crea un segundo programa Java que introduzca por teclado una cadena y
//    ejecute el programa anterior para visualizar 5 veces esa cadena.
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena para repetir:");
        String texto = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp", System.getProperty("java.class.path"),
                "Ejercicio2Hijo", // Reutilizamos el hijo del ejercicio anterior
                texto         // Pasamos el texto como argumento
        );

        // Guardar en fichero en vez de pantalla
        File archivoSalida = new File("resultado_repeticiones.txt");
        pb.redirectOutput(archivoSalida);

        Process p = pb.start();
        int codigo = p.waitFor();

        if (codigo == 0) {
            System.out.println("Éxito. Revisa el archivo: " + archivoSalida.getAbsolutePath());
        } else {
            System.out.println("Hubo un error en el proceso hijo.");
        }
        sc.close();
    }
}