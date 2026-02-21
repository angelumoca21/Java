import java.util.Random;

public class Aleatorio {
    static void main() {
        Random r = new Random();
        int numeroAleatorio = r.nextInt(101);
        System.out.println(numeroAleatorio);
    }
}
