import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;
        double total = 0;
        do {
            System.out.printf("Ingrese el precio del producto (ingrese 0 para salir): ");
            precio = sc.nextDouble();
            total = total + precio;
        }while (precio != 0);
        System.out.printf("El total es de: $%.2f",  total);
    }
}