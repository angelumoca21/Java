import java.util.Scanner;

public class BellaNapoli {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char ingrediente;
        System.out.println("Pizzeria Bella Napoli");
        System.out.println("1.Pizza vegetaria");
        System.out.println("2.Pizza no vegetetariana");
        System.out.print("Indica una opcion:");
        int tipoPizza = sc.nextInt();
        switch (tipoPizza){
            case 1:
                System.out.println("a.Pimiento\nb.Tofu");
                ingrediente = sc.next().charAt(0);
                switch (ingrediente){
                    case 'a':
                        System.out.println("Escogiste pizza vegetariana con pimiento, tomate y queso.");
                        break;
                    case 'b':
                        System.out.println("Escogiste pizza vegetariana con tofu, tomate y queso.");
                        break;
                    default:
                        System.out.println("El ingrediente es invalido.");
                }
            break;
            case 2:
                System.out.println("a.Peperoni\nb.Jamon\nc.Salami");
                ingrediente = sc.next().charAt(0);
                switch (ingrediente){
                    case 'a':
                        System.out.println("Escogiste pizza no vegetariana con peperoni, tomate y queso.");
                        break;
                    case 'b':
                        System.out.println("Escogiste pizza no vegetariana con jamon, tomate y queso.");
                        break;
                    case 'c':
                        System.out.println("Escogiste pizza no vegetariana con salami, tomate y queso.");
                        break;
                    default:
                        System.out.println("El ingrediente es invalido.");
                }
                break;
            default:
                System.out.println("Tipo de pizza invalida.");
        }
    }
}
