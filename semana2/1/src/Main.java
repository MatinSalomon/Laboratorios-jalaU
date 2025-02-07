import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, yo soy " + nombre);
    }
}