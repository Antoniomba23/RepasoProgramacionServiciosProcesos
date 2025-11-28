import java.io.*;
import java.util.Scanner;

public class LanzadorEj4Padre {
//    4.- Realiza un programa Java que lea una cadena desde la entrada estándar y visualice en
//    pantalla si la cadena es o no palíndromo o si la cadena está vacía (la longitud es 0).
//    Realiza un segundo programa Java que ejecute el anterior, debe leer la cadena desde teclado y
//    mostrar la salida en un fichero.

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena para verificar si es palíndromo:");
        String texto = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp", System.getProperty("java.class.path"),
                "Ejercicio4Hijo"
        );

        // Archivo donde se guardará la salida
        File archivoSalida = new File("salida_palindromo.txt");
        pb.redirectOutput(archivoSalida);

        // Iniciamos el proceso
        Process p = pb.start();

        // Enviamos la cadena al proceso hijo a través de su entrada estándar
        try (OutputStream os = p.getOutputStream();
             PrintWriter writer = new PrintWriter(os)) {
            writer.println(texto);
            writer.flush();
        }

        int codigo = p.waitFor();

        if (codigo == 0) {
            System.out.println("Proceso completado exitosamente.");
            System.out.println("Resultado guardado en: " + archivoSalida.getAbsolutePath());
            
            // Mostrar el contenido del archivo en consola para verificar
            System.out.println("\nContenido del archivo:");
            try (BufferedReader br = new BufferedReader(new FileReader(archivoSalida))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } else {
            System.out.println("Hubo un error en el proceso hijo.");
        }

        sc.close();
    }
}
