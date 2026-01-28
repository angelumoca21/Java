public class Reto18 {
    static void main() {
        // area = PI*radio^2 = PI*radio*radio
        // perimetro = PI * diametro = PI*(2*radio)
        final float PI = 3.14159f;
        float radio = 999f;
        float area = PI * radio * radio;
        float perimetro = PI * radio * 2f;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
    }
}