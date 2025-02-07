import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese Cantidad de millas a convertir: ");
        double m = sc.nextDouble();
        double km = m * 1.609;
        System.out.printf("Cantidad de Kilometros: " + km);
    }
}