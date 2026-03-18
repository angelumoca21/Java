import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("0.SALIR");
            System.out.println("CALCULADORA");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.DIVIDIR");
            System.out.println("4.MULTILPICAR");
            System.out.print("Elige un opcion:");
            opcion = sc.nextInt();
            double num1, num2;
            switch (opcion){
                case 0:
                    FuncionesCalculadora.salir();
                    break;
                case 1:
                    FuncionesCalculadora.sumar();
                    break;
                case 2:
                    System.out.println("Ingresa el primer valor:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo valor:");
                    num2 = sc.nextDouble();
                    FuncionesCalculadora.restar(num1,num2);
                    break;
                case 3:
                    double division = FuncionesCalculadora.dividir();
                    System.out.printf("El resultado de la division es %f\n\n", division);
                    break;
                case 4:
                    System.out.println("Ingresa el primer valor:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo valor:");
                    num2 = sc.nextDouble();
                    double multiplicacion = FuncionesCalculadora.multiplicar(num1,num2);
                    System.out.printf("%.2f * %.2f = %.2f \n\n", num1, num2, multiplicacion);
                    break;
                default:
                    System.out.println("Opcion incorrecta. \n");
            }
        } while (opcion != 0);
    }
}
