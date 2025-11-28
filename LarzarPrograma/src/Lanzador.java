import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) {
        // 1. Preparamos el proceso: Queremos abrir el Bloc de notas
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");

        try {
            // 2. ¡Arrancamos!
            Process p = pb.start();
            System.out.println("He lanzado el bloc de notas.");
        } catch (IOException e) {
            System.out.println("Error: No encontré el programa.");
        }
    }
}
