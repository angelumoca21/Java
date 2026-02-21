import java.util.Scanner;

public class Reto35 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Ingresa un numero:");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        for (int i = numeros.length-1; i >= 0 ; i--)
        {
            System.out.println("Valor:" + numeros[i]);
        }
    }
}
