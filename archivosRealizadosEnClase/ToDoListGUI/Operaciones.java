import java.sql.*;
import java.util.*;

public class Operaciones {

    public static void guardar(Tarea t){
        try(Connection conn = Conexion.conectar()){
            String sql = "INSERT INTO tareas(nombre, descripcion, prioridad) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());
            ps.setString(3, t.getPrioridad());

            ps.executeUpdate();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Tarea> buscar(String nombre){
        List<Tarea> lista = new ArrayList<>();

        try(Connection conn = Conexion.conectar()){
            String sql = "SELECT * FROM tareas WHERE nombre LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "%" + nombre + "%");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Tarea t = new Tarea(
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("prioridad")
                );
                lista.add(t);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static void eliminar(String nombre){
        try(Connection conn = Conexion.conectar()){
            String sql = "DELETE FROM tareas WHERE nombre=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.executeUpdate();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void actualizar(Tarea t){
        try(Connection conn = Conexion.conectar()){
            String sql = "UPDATE tareas SET descripcion=?, prioridad=? WHERE nombre=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, t.getDescripcion());
            ps.setString(2, t.getPrioridad());
            ps.setString(3, t.getNombre());

            ps.executeUpdate();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Tarea> obtenerTodas(){
        List<Tarea> lista = new ArrayList<>();

        try(Connection conn = Conexion.conectar()){
            String sql = "SELECT * FROM tareas";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Tarea t = new Tarea(
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("prioridad")
                );
                lista.add(t);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return lista;
    }
}