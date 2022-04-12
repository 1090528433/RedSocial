/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author AbisaX
 */
public class ChatGeneral {
    
    private ArrayList<Usuario> integrantes = new ArrayList<Usuario>();
    private String nameCanal;
    
    public ChatGeneral(){
        
    }

    public ChatGeneral(String nameCanal) {
        this.nameCanal = nameCanal;
    }

    public ArrayList<Usuario> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Usuario> integrantes) {
        this.integrantes = integrantes;
    }

    public String getNameCanal() {
        return nameCanal;
    }

    public void setNameCanal(String nameCanal) {
        this.nameCanal = nameCanal;
    }
    
    
}
