public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, int modelo, int numeroPuertas){
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    //get
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    //set
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void encender(){
        System.out.println("El auto se ha encendido");
    }
}
