import java.util.*;
public class SistemaSeguridad {
    private List<Persona> empleados;
    private boolean hackerIdentificado;
    private static final String[] NOMBRES = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank"};
    private static final String[] ROLES = {"Analista", "Ingeniero", "Técnico", "Administrador"};

    public SistemaSeguridad() {
        this.empleados = new ArrayList<>();
        this.hackerIdentificado = false;
    }

    public void generarEmpleados(int cantidad) {
        Random rand = new Random();
        int hackerIndex = rand.nextInt(cantidad);
        for (int i = 0; i < cantidad; i++) {
            String nombre = NOMBRES[i];
            int nivelAcceso = rand.nextInt(5) + 1;
            String rol = ROLES[rand.nextInt(ROLES.length)];
            boolean esHacker = (i == hackerIndex);
            empleados.add(new Persona(nombre, nivelAcceso, rol, esHacker));
        }
    }

    public void mostrarEmpleados() {
        for (Persona empledo : empleados){
            empledo.mostrarDatos();
        }
    }

    public void realizarPruebas() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Intento " + (i + 1) + "/3 - Realizando pruebas de seguridad...");
            for (Persona empleado : empleados) {
                System.out.println("Respuesta: " + empleado.realizarPruebaSeguridad());
            }
        }
    }

    public void identificarHacker(String nombre) {
        for (Persona empleado : empleados) {
            if (empleado.obtenerNombre().equalsIgnoreCase(nombre)) {
                if (empleado.realizarPruebaSeguridad() <= 5) {
                    hackerIdentificado = true;
                    System.out.println("¡Correcto! Has identificado al hacker.");
                } else {
                    System.out.println("¡Fallaste! El hacker ha escapado con los datos.");
                }
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }





}
