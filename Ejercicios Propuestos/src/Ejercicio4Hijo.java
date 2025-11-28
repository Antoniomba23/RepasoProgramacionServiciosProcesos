import java.util.Scanner;
//4.- Realiza un programa Java que lea una cadena desde la entrada estándar y visualice en
//pantalla si la cadena es o no palíndromo o si la cadena está vacía (la longitud es 0).

public class Ejercicio4Hijo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos lo que nos envíe el padre (o el fichero)
        if (sc.hasNextLine()) {
            String cadena = sc.nextLine();

            if (cadena.isEmpty()) {
                System.out.println("La cadena está vacía.");
            } else {
                // Lógica de palíndromo (invertir y comparar)
                String invertida = new StringBuilder(cadena).reverse().toString();
                if (cadena.equalsIgnoreCase(invertida)) {
                    System.out.println("ES PALÍNDROMO: " + cadena);
                } else {
                    System.out.println("NO ES PALÍNDROMO: " + cadena);
                }
            }
        } else {
            System.out.println("No se recibió ninguna entrada.");
        }
        sc.close();
    }
}