
package controlador;
import java.util.ArrayList;
import modelo.*;

public class Sesion {
    
    ArrayList<Usuario> usuariosConectados = new ArrayList<Usuario>();
    
    private boolean buscarUsuario(String a) {
        return true;
    }
    
    private boolean verificarCredencial(String a, String b){
        return true;
    }
    
    
    
    public void iniciarSesion(String nick, String correo, String clave){
        boolean esValida = buscarUsuario(nick);
        if(!esValida){
            System.out.println("Credenciales Invalidas");
            return;
        }
        boolean credencialesValidas = verificarCredencial(correo,clave);
        if(!credencialesValidas){
            System.out.println("Credenciales Invalidas");
        }
        Usuario newUsuario = new Usuario(nick, correo, clave);
        this.usuariosConectados.add(newUsuario);
        System.out.println("Usuario Conectado");
    }
    
    
    
    public void cerrarSesion(Usuario usuario){
        usuariosConectados.remove(usuario);
        System.out.println("Usuario Desconectado");
    }
    
    
    
    public ArrayList usuariosEnLinea(){
        return usuariosConectados;
    }
}
