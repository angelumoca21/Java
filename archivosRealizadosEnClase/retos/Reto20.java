import java.util.Scanner;

public class Reto20 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de los colores. Ingresa un color (amarillo, verde o rojo)");
        String color = sc.next();
        if (color.equals("verde"))
        {
            System.out.println("Ganaste 5 puntos.");
        }
        else if (color.equals("amarillo")) {
            System.out.println("Ganaste 10 puntos.");
        }
        else if (color.equals("rojo")) {
            System.out.println("Ganaste 15 puntos.");
        }
        else {
            System.out.println("No ganaste puntos.");
        }
    }
}
