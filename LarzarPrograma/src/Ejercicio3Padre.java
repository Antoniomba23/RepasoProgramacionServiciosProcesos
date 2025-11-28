import java.io.IOException;

public class Ejercicio3Padre {
    public static void main(String[] args) {

        // System.getProperty("java.class.path") obtiene la ruta exacta
        // donde IntelliJ ha puesto tus .class compilados.
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", System.getProperty("java.class.path"), "Ejercicio3Hijo");
//        // Ruta manual"
//        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "./out/production/RepasoExamenPSP", "Ejercicio3Hijo");

        // Hacemos que la salida del hijo se muestre en la consola del padre
        // Esto evita tener que gestionar los InputStream manualmente[cite: 373, 422].
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try {
            Process p = pb.start(); // [cite: 344, 366]
            p.waitFor(); // Esperamos a que el hijo termine [cite: 375, 431]
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}