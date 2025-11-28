import java.io.File;
import java.io.IOException;

public class LanzadorEj5Padre {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Definimos los ficheros
        File ficheroEntrada = new File("entrada.txt"); // Debe existir y tener texto
        File ficheroSalida = new File("salida_palindromo.txt"); // Se creará solo

        // Comprobamos si existe el fichero de entrada para evitar errores
        if (!ficheroEntrada.exists()) {
            System.out.println("¡OJO! Crea primero el archivo 'entrada.txt' en la raíz del proyecto.");
            return;
        }

        ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp", System.getProperty("java.class.path"),
                "Ejercicio4Hijo"
        );

        //  Redirección TOTAL:
        // Lo que lee el hijo viene del fichero entrada.txt
        pb.redirectInput(ficheroEntrada);

        // Lo que escribe el hijo va al fichero salida_palindromo.txt
        pb.redirectOutput(ficheroSalida);

        Process p = pb.start();
        p.waitFor();

        System.out.println("Proceso terminado.");
        System.out.println("Entrada leída de: " + ficheroEntrada.getName());
        System.out.println("Resultado guardado en: " + ficheroSalida.getName());
    }
}
