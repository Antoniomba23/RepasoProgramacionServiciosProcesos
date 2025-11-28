import java.io.File;

public class Redireccion {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

        // Redirigir la salida a un fichero
        File archivoSalida = new File("listado_archivos.txt");
        pb.redirectOutput(archivoSalida);

        pb.start();
        System.out.println("Revisa el archivo listado_archivos.txt");
    }
}
