
package modelo;

import java.util.Vector;

public class Fachada{
    
    private Estudiante estudiante;
    private static Vector<Estudiante> newUs = new Vector<Estudiante>();
    
    public Fachada(){
        
    }
    
    public static void mostrar(Usuario obj){
        newUs.addElement(obj);
    }
    
    public static void eliminar(int pos){
        newUs.removeElementAt(pos);
    }
    
    public static Vector consultar(){
        return newUs;
    }
    
    
    
}
