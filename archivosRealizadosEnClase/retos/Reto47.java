import java.util.Scanner;

public class Reto47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
    }
}