import java.util.*;
public class CiberWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaSeguridad sistema = new SistemaSeguridad();
        sistema.generarEmpleados(5);

        System.out.println("Lista de empleados:");
        sistema.mostrarEmpleados();

        System.out.println("Realizando pruebas de seguridad...");
        sistema.realizarPruebas();

        System.out.print("Ingresa el nombre del hacker sospechoso: ");
        String sospechoso = scanner.nextLine();
        sistema.identificarHacker(sospechoso);
    }
}
