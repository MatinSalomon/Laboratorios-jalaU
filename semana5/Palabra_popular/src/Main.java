import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el párrafo: ");
        String parrafo = sc.nextLine();
        parrafo = parrafo.toLowerCase();

        String[] palabras = parrafo.split(" ");

        int maxRepeticiones = 0;
        String palabraMasRepetida = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabraActual = palabras[i];
            int contador = 0;

            for (int j = 0; j < palabras.length; j++) {
                if (palabraActual.equals(palabras[j])) {
                    contador++;
                }
            }

            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                palabraMasRepetida = palabraActual;
            }
        }

        System.out.printf("La palabra más repetida es " + palabraMasRepetida + " con " + maxRepeticiones + " apariciones");

    }

}