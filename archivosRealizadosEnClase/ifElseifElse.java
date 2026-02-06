public class ifElseifElse {
    public static void main(String[] args) {
        //edad<11 - niñez
        //edad 11-17 adolescencia
        //edad 18-59 adultez
        //edad>=60 adulto mayor
        int edad = -65;
        if (edad < 11 && edad > -1) {
            System.out.println("Niño");
        } else if (edad > 10 && edad <= 17){
            System.out.println("Adolescente");
        } else if (edad > 17 && edad <= 59){
            System.out.println("Adulto");
        } else if (edad >= 60){
            System.out.println("Adulto mayor");
        } else {
            System.out.println("La edad es invalida.");
        }
    }
}
