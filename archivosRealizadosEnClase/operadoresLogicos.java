public class operadoresLogicos {
    static void main() {
        boolean estado1 = true;
        boolean estado2 = false;
        System.out.println("Tabla de verdad: AND");
        System.out.println("0&0:"+(estado2&&estado2));
        System.out.println("0&1:"+(estado2&&estado1));
        System.out.println("1&0:"+(estado1&&estado2));
        System.out.println("1&1:"+(estado1&&estado1));
        System.out.println("Tabla de verdad: OR");
        System.out.println("0|0:"+(estado2||estado2));
        System.out.println("0|1:"+(estado2||estado1));
        System.out.println("1|0:"+(estado1||estado2));
        System.out.println("1|1:"+(estado1||estado1));
        System.out.println("Tabla de verdad: NOT");
        System.out.println("!0:"+(!estado2));
        System.out.println("~1:"+(!estado1));
    }
}
