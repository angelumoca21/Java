public class POO {
    static void main() {
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Honda");
        v1.setModelo(2025);
        System.out.println(v1.getMarca());
        System.out.println(v1.getModelo());
        v1.encender();

        Vehiculo v2 = new Vehiculo("Toyota",2020);
        System.out.println(v2.getMarca());
        System.out.println(v2.getModelo());
        v2.encender();
        v2.setMarca("VW");
        v2.setModelo(1990);
        System.out.println(v2.getMarca());
        System.out.println(v2.getModelo());

        Auto v3 = new Auto("BMW",2000,3);
        System.out.println(v3.getMarca());
        System.out.println(v3.getModelo());
        System.out.println(v3.getNumeroPuertas());
        v3.encender();
   }
}
