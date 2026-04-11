import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
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
                    System.out.print("Ingresa la descripcion de la tarea:");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingresa la prioridad de la tarea:");
                    int prioridad = sc.nextInt();
                    Tarea t = new Tarea(nombre,descripcion,prioridad);
                    listaTareas.add(t);
                    break;
                case 2:
                    for (Tarea i : listaTareas){
                        i.mostrarInformacion();
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