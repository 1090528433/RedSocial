/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author AbisaX
 */
public class ChatPrivado {
    
    private Estudiante es1;
    private Estudiante es2;
    
    public ChatPrivado(){
        
    }

    public ChatPrivado(Estudiante es1, Estudiante es2) {
        this.es1 = es1;
        this.es2 = es2;
    }

    public Estudiante getEs1() {
        return es1;
    }

    public void setEs1(Estudiante us1) {
        this.es1 = us1;
    }

    public Estudiante getEs2() {
        return es2;
    }

    public void setEs2(Estudiante es2) {
        this.es2 = es2;
    }
    
    
}
