public class Ejercicio1Hijo {
//    "1.- Realiza un programa Java que admita argumentos desde main() y devuelva con
//            System.exit() los siguientes valores:
//             Si el número de argumentos es < 1 debe devolver 1.
//             Si el argumento es una cadena debe devolver 2.
//             Si el argumento es un número entero menor que 0 debe devolver 3.
//             En cualquier otra situación debe devolver 0."
    public static void main(String[] args) {
        // [cite: 4] Si argumentos < 1 devuelve 1
        if (args.length < 1) {
            System.exit(1);
        }

        try {
            // Intentamos convertir el texto a número
            int numero = Integer.parseInt(args[0]);

            // [cite: 6] Si es menor que 0 devuelve 3
            if (numero < 0) {
                System.exit(3);
            } else {
                // [cite: 7] Cualquier otra situación (numero positivo) devuelve 0
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            // [cite: 5] Si falla la conversión, es una cadena (texto), devuelve 2
            System.exit(2);
        }
    }
}
