public class switchAreas {
    public static void main(String[] args) {
        char opcion = 'b';
        System.out.println("a.Cuadrado");
        System.out.println("b.Triangulo");
        System.out.println("c.Circulo");
        switch (opcion){
            case 'a':
                System.out.println("Cuadrado");
                break;
            case 'b':
                System.out.println("Triangulo");
                break;
            case 'c':
                System.out.println("Circulo");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
