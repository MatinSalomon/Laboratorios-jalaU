import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] consonantes = {
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuántas palabras ingresarás: ");
        int cantidadPalabras = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println("Ingresa una palabra: ");
            String palabra = sc.nextLine().toUpperCase();
            int contadorConsonantes = 0;
            boolean esDificil = false;

            for (char letra : palabra.toCharArray()) {
                if (esConsonante(letra, consonantes)) {
                    contadorConsonantes++;
                } else {
                    contadorConsonantes = 0;
                }

                if (contadorConsonantes >= 4) {
                    System.out.println("La palabra " + palabra + " es difícil.");
                    esDificil = true;
                    break;
                }
            }

            if (!esDificil) {
                System.out.println("La palabra " + palabra + " es fácil.");
            }
        }

        sc.close();
    }

    private static boolean esConsonante(char letra, char[] consonantes) {
        for (char consonante : consonantes) {
            if (letra == consonante) {
                return true;
            }
        }
        return false;
    }
}