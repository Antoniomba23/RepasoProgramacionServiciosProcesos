import java.io.IOException;

public class EjercicioDespertador {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("calc.exe");
            Process p = pb.start(); // El proceso nace aquí [cite: 344]

            // CORRECCIÓN: Imprimimos esto MIENTRAS la calculadora está abierta
            System.out.println("Calculadora abierta...");

            // El programa Java se "congela" aquí hasta que cierres la calculadora
            int value = p.waitFor(); // [cite: 375]

            if (value == 0) {
                System.out.println("Calculadora cerrada con éxito.");
            } else {
                System.out.println("La calculadora se cerró con errores.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}