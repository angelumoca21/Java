import java.sql.*;

public class Conexion {

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/todo_db",
                    "root",
                    "toor"
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}