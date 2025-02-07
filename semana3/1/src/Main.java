import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.printf("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        if (edad >= 12 && edad >= 1.50) {
            System.out.printf("PUEDES SUBIR A LA MONTAÑA RUSA");
        }else{
            System.out.printf("Lo sentimos, no cumples con los requisitos para subir.\n");
        }
    }
}