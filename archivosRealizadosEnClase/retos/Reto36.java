import java.util.Random;

public class Reto36 {
    static void main() {
        Random r = new Random();
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < numero.length; i++)
        {
            int numeroAleatorio = r.nextInt(101);
            numero[i] = numeroAleatorio;
            cuadrado[i] = numeroAleatorio * numeroAleatorio;
            cubo[i] = numeroAleatorio * numeroAleatorio * numeroAleatorio;
        }
        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
        }
    }
}
