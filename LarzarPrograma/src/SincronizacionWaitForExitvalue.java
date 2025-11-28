import java.io.IOException;

public class SincronizacionWaitForExitvalue {
    public static void main(String[] args) {
            // 1. Preparamos el proceso: Queremos abrir el Bloc de notas
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        try {
            Process p = pb.start();
            // Java se queda "congelado" aquí hasta que cierres el notepad
            int notaFinal = p.waitFor();

            if (notaFinal == 0) {
                System.out.println("El programa terminó correctamente.");
            } else {
                System.out.println("El programa se cerró con errores.");
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
