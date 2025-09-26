/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroes;

/**
 *
 * @author perez
 */
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension(){
        this.alto = 0.0; //cadena vacia
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }     
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;  
    }
    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getProfundidad() {
        return profundidad;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    public double getVolumen() {
        return Math.round((alto * ancho * profundidad) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Dimension{" + "El alto es=" + alto + ", el ancho es=" + ancho + ", la profundidad es=" + profundidad +
                "y el volumen es=" +getVolumen()+ '}';
    }
       
}

