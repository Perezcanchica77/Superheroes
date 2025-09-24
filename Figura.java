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
    private Double precio;

    public Figura(String codigo, Double precio) {
        this.codigo = codigo;
        this.precio = precio;
        cont++;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "La Figura{" + "tiene el codigo=" + codigo + ", y su precio es=" + precio + '}';
    }
    
    
    
    
    
}
