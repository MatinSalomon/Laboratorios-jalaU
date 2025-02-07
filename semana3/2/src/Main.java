import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double Chocolate= 5;
        double Fresa= 4.50;
        double Vainilla= 4;
        double Menta= 6;
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. Chocolate \n2. Fresa \n3. Vainilla \n4. Menta \nElige un sabor: ");
        int saborElegido = sc.nextInt();
        switch (saborElegido) {
            case 1:
                System.out.println("El sabor elegido es Chocolate y su precios es de " + Chocolate);
                break;
            case 2:
                System.out.println("El sabor elegido es Fresa y su precios es de " + Fresa);
                break;
            case 3:
                System.out.println("El sabor elegido es Vainilla y su precios es de " + Vainilla);
                break;
            case 4:
                System.out.println("El sabor elegido es Menta y su precios es de " + Menta);
                break;
        }
    }
}