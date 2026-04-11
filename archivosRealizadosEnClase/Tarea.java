public class Tarea {
    //atributos
    private String nombre;
    private String descripcion;
    private int prioridad;
    //constructor
    public Tarea (String nombre, String descripcion, int prioridad){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrioridad() {
        return prioridad;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    //Metodos
    public void mostrarInformacion(){
        System.out.println("Nombre:" + getNombre() + " \nDescripcion:" + getDescripcion() + "\nPrioridad:" + getPrioridad());
    }
}
