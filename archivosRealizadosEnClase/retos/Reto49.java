import java.util.Scanner;

public class Reto49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingresa una vocal: ");
        String vocal = scanner.nextLine().toLowerCase();
        String vocalMayus = vocal.toUpperCase();
        String resultado = frase.replace(vocal, vocalMayus);
        System.out.println("Resultado: " + resultado);
    }
}