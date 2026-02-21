import java.util.Scanner;

public class Arreglos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] apellidos = new String[5]; //declarar en memoria sin establecer los elementos
        String[] nombres = {"Erika","Oscar","Susana", "Fabian", "Angel"};
        int[] calificaciones = {10,9,8,7,6};

        for (int i = 0; i < nombres.length; i++)
        {
            System.out.println(nombres[i]);
        }

        for (int i = 0; i < apellidos.length; i++)
        {
            System.out.println("Ingresa un apellido:");
            String apellido = sc.next();
            apellidos[i] = apellido;
        }

        for (String a : apellidos){
            System.out.println(a);
        }
    }
}
