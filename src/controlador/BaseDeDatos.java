
package controlador;
import java.sql.*;
import modelo.*;

public class BaseDeDatos {
    private static Connection cn = Conexion.getConexion();
    
    public static void crearChatPrivado(Estudiante estudianteA, Estudiante estudianteB){
        return;
    }
    
    public static void registrarseEnChatGeneral(Estudiante estudiante, String nombre){}

    //ESTE METODO DEBE SER CORREGIDO
    public static String crearChatGeneral(String nombre){
        String respuesta = "";
        try{
            String sql = "INSERT INTO ChatG (nombre) VALUES ('" + nombre + "')";
            Statement stmt = cn.createStatement();
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
            respuesta = rs.getString(1);
           }
        }catch(SQLException e){
            System.err.println(e);
        }
        return respuesta;
    }
    
    public static void registrarEstudiante(Estudiante estudiante){
        try{
            //La funcion PreparedStatement sirve para hacer consultas en la base de datos(SQL)
            String sql = "INSERT INTO Estudiante (nombre, apellido, edad, nickname, correo, contrasena) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setInt(3, estudiante.getEdad()); 
            ps.setString(4, estudiante.getNickName());
            ps.setString(5, estudiante.getCorreo());
            ps.setString(6, estudiante.getClaveA());
            
            ps.execute();
            System.out.println("Registro Exitoso");
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public static boolean mostrarExistenciaCuenta(Estudiante estudiante){
        boolean respuesta = false;
        try{
            String sql = "SELECT COUNT(*)  AS total FROM Estudiante WHERE nickname = ? OR correo = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, estudiante.getNickName());
            ps.setString(2, estudiante.getCorreo());
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int total = rs.getInt("total");
                respuesta = total > 0 ? true: false;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return respuesta;
    }
    public static void eliminarEstudiante(Estudiante estudiante){
        try{
            String sql = "DELETE FROM Estudiante WHERE nickname = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, estudiante.getNickName());
            System.out.println("La cuenta ha sido eliminada con exito");
        }catch(SQLException e){
            System.err.println(e);
        }
    }

    public static boolean validarCambioContrasena(Estudiante es, String actualContrasena) {
        boolean respuesta = false;
        try{
            String sql = "SELECT COUNT(*) AS total FROM Estudiante WHERE nickname = ? AND contrasena = ? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, es.getNickName());
            ps.setString(2, actualContrasena);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int total = rs.getInt("total");
                respuesta = total > 0 ? true: false;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return respuesta;
    }

    public static void cambiarContrasena(Estudiante es, String nuevaContrasena) {
        try{
            String sql = "UPDATE Estudiante SET contransena = ? WHERE nickname = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nuevaContrasena);
            ps.setString(2, es.getNickName());
            
            ps.execute();
            System.out.println("Su contrase??a ha sido cambiada con exito");
        }catch(SQLException e){
            System.err.println(e);
        }
    }
}

class Test{
    public static void main(String[] args) {
       String name = "SPARTANS";
        String id = BaseDeDatos.crearChatGeneral(name);
        System.out.println("Se registr?? el chat: " + name + "con identificador: " + id);
    }
}