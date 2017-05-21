/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.piloto.beans;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Aficion implements Serializable {

    private String nombre;

    public Aficion() {
    }

    public Aficion(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Aficion{" + "nombre=" + nombre + '}';
    }

}
