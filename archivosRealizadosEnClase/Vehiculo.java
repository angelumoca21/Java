public class Vehiculo {
    private String marca;
    private int modelo;

    Vehiculo(){
    }

    public Vehiculo(String marca, int modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //getters
    public String getMarca() {
        return marca;
    }
    public int getModelo() {
        return modelo;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void encender(){
        System.out.println("El vehiculo se ha encendido");
    }
}
