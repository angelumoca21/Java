import java.util.Scanner;

public class Reto30 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero a verificar si es primo o no:");
        int numero = sc.nextInt();
        int i = 2;
        boolean esPrimo = true;
        if (numero > 1){
            while (i <= (numero/2)){
                if (numero % i == 0 || numero == 2)
                {
                    esPrimo = false;
                    System.out.printf("El numero %d es no primo.",numero);
                    break;
                }
                i++;
            }
        }
        else {
            System.out.println("Tu numero es invalido.");
        }
        if (esPrimo){
            System.out.printf("El numero %d es primo.",numero);
        }
    }
}
