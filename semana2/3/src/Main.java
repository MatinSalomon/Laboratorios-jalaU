import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese su anio de nacimiento: ");
        int anio = sc.nextInt();
        int edad = 2025 - anio;
        System.out.printf("Su edad es: " + edad);
    }
}