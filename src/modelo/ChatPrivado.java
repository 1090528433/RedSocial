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
    
    private Usuario us1;
    private Usuario us2;
    
    public ChatPrivado(){
        
    }

    public ChatPrivado(Usuario us1, Usuario us2) {
        this.us1 = us1;
        this.us2 = us2;
    }

    public Usuario getUs1() {
        return us1;
    }

    public void setUs1(Usuario us1) {
        this.us1 = us1;
    }

    public Usuario getUs2() {
        return us2;
    }

    public void setUs2(Usuario us2) {
        this.us2 = us2;
    }
    
    
}
