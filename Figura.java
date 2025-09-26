/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroes;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Figura {
    private static int cont = 1;
    private String codigo;
    private double precio;
    private Dimension dimensiones;
    private Superheroes superheroe;
    

    public Figura(double precio, Superheroes superheroe, Dimension dimensiones) {
        this.codigo = generarCodigo();
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;  
    }
    
     private String generarCodigo() {
        return "FIG" + cont++;
    }

    public String getCodigo() {
        return codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public Dimension getDimensiones() {
        return dimensiones;
    }
    public Superheroes getSuperheroe() {
        return superheroe;
    }
    
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   @Override
public String toString() {
    return "Figura [codigo=" + codigo +
           ", precio=" + precio +
           ", superheroe=" + superheroe.getNombre() +
           ", dimensiones=" + dimensiones.toString() + "]";
}

}
