import java.util.Scanner;

public class Reto28 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String contrasena = "pilares";
        while (true){
            System.out.print("Ingresa la constraseña:");
            String contrasenaUsuario = sc.next();
            if (contrasena.equals(contrasenaUsuario)){
                System.out.println("La constraseña es correcta.");
                break;
            }
        }
    }
}
