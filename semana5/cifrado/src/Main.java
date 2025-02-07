import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abecedario = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine().toUpperCase();
        String nombreCifrado = "";
        int contador = 1    ;

        for (int posicionNombre = 0; posicionNombre < nombre.length(); posicionNombre++) {
            char letra = nombre.charAt(posicionNombre);

            for (int i = 0; i < abecedario.length; i++) {
                if (abecedario[i].charAt(0) == letra) {
                    nombreCifrado += abecedario[i + contador];
                    contador++;
                    break;
                }
            }
        }
        System.out.println(nombreCifrado);
    }
}