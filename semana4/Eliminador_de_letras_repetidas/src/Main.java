import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese el texto");
        String texto = sc.nextLine();
        String nuevoTexto = "";

        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            boolean repetida = false;

            for (int j = 0; j < nuevoTexto.length(); j++) {
                if (nuevoTexto.charAt(j) == letraActual) {
                    repetida = true;
                    break;
                }
            }
            if (!repetida) {
                nuevoTexto = nuevoTexto + letraActual;
            }
        }
        System.out.println(nuevoTexto);
    }
}