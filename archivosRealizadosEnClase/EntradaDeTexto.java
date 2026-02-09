import java.util.Scanner;

public class EntradaDeTexto {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = sc.nextInt();
        System.out.println("Mi edad es :" + edad);
        sc.nextLine();
        System.out.println("Ingresa tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Mi nombre es:" + nombre);
    }
}
