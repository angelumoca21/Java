import java.util.Scanner;

public class Reto50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine().replace(" ","");
        String textoInvertido = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        System.out.println(textoInvertido);
        if (texto.equals(textoInvertido)) {
            System.out.println("Verdadero: Es un palíndromo");
        } else {
            System.out.println("Falso: No es un palíndromo");
        }
    }
}