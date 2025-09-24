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

    public Figura(String codigo, double precio, Superheroes superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
        
        cont++;//nose donde meter este contador es huerfano busca familia que le cuide
    }
    public String getCodigo() {
        return codigo;
    }
    public Double getPrecio() {
        return precio;
    }
    public Dimension getDimensiones() {
        return dimensiones;
    }
    public Superheroes getSuperheroe() {
        return superheroe;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "La Figura{" + "tiene el codigo=" + codigo + ", su precio es=" + precio +
                ", su dimension es=" + dimensiones + " y el superheroe es=" + superheroe + '}';
    }   
    
}
