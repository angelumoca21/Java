public class Tarea {

    private int id;
    private String nombre;
    private String descripcion;
    private String prioridad;

    public Tarea(String nombre, String descripcion, String prioridad){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getNombre(){ return nombre; }
    public String getDescripcion(){ return descripcion; }
    public String getPrioridad(){ return prioridad; }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setDescripcion(String descripcion){ this.descripcion = descripcion; }
    public void setPrioridad(String prioridad){ this.prioridad = prioridad; }
}