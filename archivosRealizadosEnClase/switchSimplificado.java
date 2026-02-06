public class switchSimplificado {
    public static void main(String[] args) {
        char opcion = 'a';
        String resultado = switch (opcion){
            case 'a' -> "Cuadrado";
            case 'b' -> "Triangulo";
            case 'c' -> "Circulo";
            default -> "Invalido";
        };
        System.out.println(resultado);
    }
}