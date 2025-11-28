public class Ejercicio2Hijo {
//    Realiza un segundo programa Java que ejecute al anterior. Este segundo programa deberá
//    mostrar en pantalla lo que pasa dependiendo del valor devuelto al ejecutar el programa
//    anterior.

    public static void main(String[] args) {
        // [cite: 11] Si no hay cadena, mensaje y exit(1)
        if (args.length < 1) {
            System.err.println("¡ERROR! Necesito una cadena.");
            System.exit(1);
        }

        //  Visualizar 5 veces la cadena
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + args[0]);
        }
    }
}