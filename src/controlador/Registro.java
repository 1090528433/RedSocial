
package controlador;
import modelo.*;

public class Registro {
    
    public void registrarEstudiante(String nombre, String apellido, int edad, String nick, String correo, String contrasena){
        
        if(12 > edad && edad > 100){
            System.out.println("No puede registrarse");
            return;
        }
        boolean estaRegistrado = BaseDeDatos.mostrarExistenciaCuenta(new Estudiante(nombre, apellido, edad, nick, correo, contrasena));
        if(estaRegistrado){
            System.out.println("No puede registrarse");
            return;
        }
        
        //QUEDA PENDIENTE ENCRIPTAR LA CONTRASEÑA
        Estudiante newEstudiante = new Estudiante(nombre, apellido, edad, nick, correo, contrasena);
        BaseDeDatos.registrarEstudiante(newEstudiante);
    }
    
    public void eliminarCuenta(Estudiante estudiante, boolean asegurar){
        if(!asegurar){
            System.out.println("No se pudo eliminar la cuenta");
            return;
        }
        BaseDeDatos.eliminarEstudiante(estudiante);
    }
    
    public void crearChatPrivado(Estudiante estudianteA, Estudiante estudianteB){
        BaseDeDatos.crearChatPrivado(estudianteA, estudianteB);
    }
	
    public void crearChatGeneral(Estudiante estudiante, String nombre){
        BaseDeDatos.registrarseEnChatGeneral(estudiante, nombre);

    }
    
    public void registrarmeEnChat(Estudiante estudiante, String nombre){
        BaseDeDatos.registrarseEnChatGeneral(estudiante, nombre);
    }
}
//
//class Test{
//    public static void main(String[] args) {
//        Registro r = new Registro();
//        r.registrarEstudiante("Ricardo", "Cophene", 45, "Rickpene", "elvergalarga@ufps.edu.co", "bytepalamierda");
//        //Estudiante e = new Estudiante("Ricardo", "Cophene", 45, "Rickpene", "elvergalarga@ufps.edu.co", "bytepalamierda");
//        //r.eliminarCuenta(e, true);
//    }
//}