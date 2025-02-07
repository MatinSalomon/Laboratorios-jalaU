import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        double radioAlCuadrado = radio * radio;
        double area = Math.PI * radioAlCuadrado;
        System.out.printf("El area del circulo es: " + area);
    }
}