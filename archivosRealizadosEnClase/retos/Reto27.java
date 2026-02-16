import java.util.Scanner;

public class Reto27 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu palabra: ");
        String palabra = sc.nextLine();
        for (int i=1; i<11; i=i+1){
            System.out.println(palabra);
        }
    }
}
