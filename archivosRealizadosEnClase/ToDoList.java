import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String[] nombres = new String[20];
        String[] descripciones = new String[20];
        int[] prioridades = new int[20];
        int indice = 0;
        do {
            System.out.println("TO-DO list");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Mostrar tareas");
            System.out.println("3.Salir");
            System.out.print("Ingresa una opcion:");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Ingresa el nombre de la tarea:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    nombres[indice] = nombre;
                    System.out.print("Ingresa la descripcion de la tarea:");
                    String descripcion = sc.nextLine();
                    descripciones[indice] = descripcion;
                    System.out.print("Ingresa la prioridad de la tarea:");
                    int prioridad = sc.nextInt();
                    prioridades[indice] = prioridad;
                    indice = indice + 1;
                    break;
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(nombres[i]);
                        System.out.println(descripciones[i]);
                        System.out.println(prioridades[i]);
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }
}
