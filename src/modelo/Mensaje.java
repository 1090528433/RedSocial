/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author AbisaX
 */
public class Mensaje {
    
    private String contenido;
    private Calendar fecha;
    
    public Mensaje(){
        
    }

    public Mensaje(String contenido, Calendar fecha) {
        this.contenido = contenido;
        this.fecha = fecha;
    }
    
    
    
}
