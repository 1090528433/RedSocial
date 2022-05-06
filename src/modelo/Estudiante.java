
package modelo;

import java.util.Vector;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String nickName;
    private String correo;
    private String claveA;
    

    public Estudiante(String nombre, String apellido, int edad, String nickName, String correo, String claveA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nickName = nickName;
        this.correo = correo;
        this.claveA = claveA;
    }

    public Estudiante() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClaveA() {
        return claveA;
    }

    public void setClaveA(String claveA) {
        this.claveA = claveA;
    }
    
}
