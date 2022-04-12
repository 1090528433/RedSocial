
package controlador;
import modelo.*;

public class Registro {
    
    public void registrarUsuario(String nombre, String apellido, int edad, String nick, String correo, String clave){
        
        if(12 > edad && edad > 100){
            System.out.println("No puede registrarse");
            return;
        }
        boolean estaRegistrado = BaseDeDatos.buscarEstudiante(nick);
        if(estaRegistrado){
            System.out.println("Esta Registrado");
            return;
        }
        
        //QUEDA PENDIENTE ENCRIPTAR LA CONTRASEÑA
        Estudiante newUsuario = new Estudiante(nombre, apellido, edad, nick, correo, clave);
        BaseDeDatos.registrarEstudiante(newUsuario);
    }
    
    public void eliminarCuenta(Estudiante estudiante, boolean asegurar){
        if(!asegurar){
            System.out.println("No se pudo eliminar la cuenta");
            return;
        }
        BaseDeDatos.eliminarEstudiante(estudiante);
    }
    
    public void crearChatPrivado(Usuario usuarioA, Usuario usuarioB){
        BaseDeDatos.registrarChatPrivado(usuarioA, usuarioB);
    }
    
    public void crearChatGeneral(Usuario usuario, String nombre){
        BaseDeDatos.registrarseEnChatGeneral(usuario, nombre);
    }
    
    public void registrarmeEnChat(Usuario usuario, String nombre){
        BaseDeDatos.registrarseEnChatGeneral(usuario, nombre);
    }
}
