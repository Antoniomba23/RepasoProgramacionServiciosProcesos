import java.io.InputStream;

public class LectorConsola {
    public static void main(String[] args) throws Exception {
        // En Windows necesitamos "CMD /C" antes del comando
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
        Process p = pb.start();

        // Obtenemos el "tubo" de información que viene del proceso
        InputStream is = p.getInputStream();

        int letra;
        // Leemos byte a byte hasta que se acabe (-1)
        while ((letra = is.read()) != -1) {
            System.out.print((char) letra); // Convertimos el código numérico a letra
        }
    }
}