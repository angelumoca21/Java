public class operadoresAritmeticos {
    static void main() {
        float a = 20.5f, b = 4f;
        float suma = a + b;
        float resta = a - b;
        float division = a / b;
        float multiplicacion = a * b;
        float modulo = a % b;
        System.out.println("Suma es: " + suma);
        System.out.println("Resta es: " + resta);
        System.out.println("El producto es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.printf("La division es: %.2f \n",division);
        System.out.println("El modulo es: " + modulo);
    }
}
