import java.io.File;
import java.io.IOException;

public class Ejercico3Padre {
    public static void main(String[] args){
        try {

            // Nota el "./out/production/..."
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", "./out/production/RepasoExamenPSP", "Ejercicio3Hijo");
            Process p = pb.start();

// Obtenemos el tubo de audio del hijo
            java.io.InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c); // Imprimimos letra por letra
            }
            p.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

