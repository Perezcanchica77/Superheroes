/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superheroes;

/**
 *
 * @author perez
 */
public class Superheroes {
// Atributos
    private String nombre;
    private String descripcion;
    private Boolean capa;
    
//Constructores
    public Superheroes(){
        this.descripcion = ""; //cadena vacia
        this.capa = false; //valor boleano falso
    }

    public Superheroes(String nombre, String descripcion, Boolean capa) {
        this.nombre = nombre;
        this.descripcion = descripcion; 
        this.capa = capa; 
             
    }
//get
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getCapa() {
        return capa;
    }
//set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(Boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Superheroes{" + "Nombre=" + nombre + ", Descripcion=" + descripcion + ", Capa=" + capa + '}';
    }
    
    
    }
