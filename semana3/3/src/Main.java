import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un  numero: ");
        int numero = sc.nextInt();


        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}