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
    private Double alto;
    private Double ancho;
    private Double profundidad;

    public Dimension(){
        this.alto = 0.0; //cadena vacia
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }     
    public Dimension(Double alto, Double ancho, Double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;  
    }
    public Double getAlto() {
        return alto;
    }
    public Double getAncho() {
        return ancho;
    }
    public Double getProfundidad() {
        return profundidad;
    }
    public void setAlto(Double alto) {
        this.alto = alto;
    }
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
    public double getVolumen() {
        double volumen = alto * ancho * profundidad;
        return volumen;
    }

    @Override
    public String toString() {
        return "Dimension{" + "El alto es=" + alto + ", el ancho es=" + ancho + ", la profundidad es=" + profundidad + "y el volumen maximo es=" +getVolumen()+ '}';
    }
       
}
