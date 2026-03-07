import java.util.Scanner;

public class ToDoList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int numeroDeTarea = 0;
        String[] listaDeTareas = new String[20];
        while(opcion != 3){
            System.out.println("TO-DO LIST");
            System.out.println("1.Agregar una tarea");
            System.out.println("2.Mostrar lista de tareas");
            System.out.println("3.Salir");
            System.out.print("Ingresa una opcion:");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    sc.nextLine();
                    System.out.print("Ingresa la nueva tarea:");
                    String tarea = sc.nextLine();
                    listaDeTareas[numeroDeTarea] = tarea;
                    numeroDeTarea = numeroDeTarea + 1;
                    break;
                case 2:
                    for (int i = 0; i < listaDeTareas.length; i++) {
                        if (listaDeTareas[i] == null) {
                            continue;
                        }
                        else {
                            System.out.println(listaDeTareas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }

        }
    }
}
