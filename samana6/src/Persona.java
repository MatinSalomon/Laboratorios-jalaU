import java.util.*;
public class Persona {
    private String nombre;
    private int nivelAcceso;
    private  String rol;
    private boolean esHacker;


    public Persona(String nombre, int nivelAcceso, String rol, boolean esHacker) {
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
        this.rol = rol;
        this.esHacker = esHacker;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("NivelAcceso: " + this.nivelAcceso);
        System.out.println("Rol: " + this.rol);
        System.out.println("EsHacker: " + this.esHacker);
    }

    public int realizarPruebaSeguridad(){
        Random rand = new Random();
        return esHacker ? rand.nextInt(5) + 1 : rand.nextInt(10) + 1;
    }

    public String obtenerNombre() {
        return nombre;
    }
}

