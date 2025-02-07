import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        do{
            System.out.printf("1. Buscar un libro\n2. Mostrar horarios de atención\n3. Salir\nElige una opicon ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Buscando libros...");
                    continue;
                case 2:
                    System.out.println("El horario de atención es de 9:00 AM a 5:00 PM.");
                    continue;
                case 3:
                    System.out.println("Gracias por visitar la biblioteca.");
                    bandera = false;
                    break;
            }
        }while (bandera);
    }
}