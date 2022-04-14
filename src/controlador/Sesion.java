
package controlador;
import java.util.ArrayList;
import modelo.*;

public class Sesion {
    
    ArrayList<Estudiante> estudiantesConectados = new ArrayList<Estudiante>();
    
    private boolean buscarEstudiante(String a) {
        return true;
    }
    
    private boolean verificarCredencial(String a, String b){
        return true;
    }
    
    
    
    public void iniciarSesion(String nick, String correo, String clave){
        boolean esValida = buscarEstudiante(nick);
        if(!esValida){
            System.out.println("Credenciales Invalidas");
            return;
        }
        boolean credencialesValidas = verificarCredencial(correo,clave);
        if(!credencialesValidas){
            System.out.println("Credenciales Invalidas");
        }
        Estudiante newEstudiante = new Estudiante();
        this.estudiantesConectados.add(newEstudiante);
        System.out.println("Estudiante Conectado");
    }
    
    
    
    public void cerrarSesion(Estudiante estudiante){
        estudiantesConectados.remove(estudiante);
        System.out.println("Estudiante Desconectado");
    }
    
    
    
    public ArrayList estudiantesEnLinea(){
        return estudiantesConectados;
    }
    
    public boolean cambioContraseña(Estudiante e, String actualContrasena, String nuevaContrasena){
        boolean usuarioReal = BaseDeDatos.validarCambioContrasena(e, actualContrasena);
        if(!usuarioReal){
            System.out.println("No se pudo cambiar la contraseña");
            return false;
        }
        BaseDeDatos.cambiarContrasena(e, nuevaContrasena);
        return true;
    }
}
