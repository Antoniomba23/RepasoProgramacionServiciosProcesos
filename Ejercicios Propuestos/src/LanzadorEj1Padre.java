import java.io.IOException;

public class LanzadorEj1Padre {
//    1.- Realiza un programa Java que admita argumentos desde main() y devuelva con
//    System.exit() los siguientes valores:
//     Si el número de argumentos es < 1 debe devolver 1.
//     Si el argumento es una cadena debe devolver 2.
//     Si el argumento es un número entero menor que 0 debe devolver 3.
//     En cualquier otra situación debe devolver 0.
//    Realiza un segundo programa Java que ejecute al anterior. Este segundo programa deberá
//    mostrar en pantalla lo que pasa dependiendo del valor devuelto al ejecutar el programa
//    anterior.

    public static void main(String[] args) throws IOException, InterruptedException {
        // PRUEBA CAMBIANDO ESTE VALOR: "Hola", "-5", "10" o dejándolo vacío ""
        String argumentoPrueba = "Hola";

        ProcessBuilder pb = new ProcessBuilder(
                "java",
                "-cp", System.getProperty("java.class.path"),
                "Ejercicio1Hijo",
                argumentoPrueba
        );

        Process p = pb.start();
        int exitCode = p.waitFor(); // Esperamos el resultado

        // Analizamos qué pasó según el código devuelto
        switch (exitCode) {
            case 0: System.out.println("Finalizó correctamente (Número positivo)."); break;
            case 1: System.out.println("Error: Faltan argumentos."); break;
            case 2: System.out.println("Error: El argumento es una cadena de texto."); break;
            case 3: System.out.println("Error: El número es negativo."); break;
            default: System.out.println("Error desconocido.");
        }
    }
}