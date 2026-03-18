import java.util.Scanner;

public class FuncionesCalculadora {
    public static void sumar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer valor:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo valor:");
        double num2 = sc.nextDouble();
        double suma = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f \n\n", num1, num2, suma);
    }

    public static void restar(double num1, double num2){
        double resta = num1 - num2;
        System.out.printf("%.2f - %.2f = %.2f \n\n", num1, num2, resta);
    }

    public static double dividir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer valor:");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo valor:");
        double num2 = sc.nextDouble();
        return num1 / num2;
    }

    public static void salir(){
        System.out.println("Hasta luego. \n");
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
}
