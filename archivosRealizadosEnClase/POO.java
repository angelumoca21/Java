public class POO {
    static void main() {
        /*Vehiculo v1 = new Vehiculo();
        v1.marca = "Honda";
        System.out.println(v1.marca);
        v1.modelo = 2025;
        System.out.println(v1.modelo);
        v1.encender();*/

        Vehiculo v2 = new Vehiculo("Toyota",2020);
        System.out.println(v2.getMarca());
        System.out.println(v2.getModelo());
        v2.setMarca("VW");
        v2.setModelo(1990);
        System.out.println(v2.getMarca());
        System.out.println(v2.getModelo());
        v2.encender();
   }
}
