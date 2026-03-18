import java.util.Scanner;

public class Reto48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        String nombreMayus = nombre.toUpperCase();
        int cantidadLetras = nombre.replace(" ", "").length();
        System.out.println(nombreMayus + " tiene " + cantidadLetras + " letras");
    }
}