/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.beans;

import com.curso.config.Util;

/**
 *
 * @author usuario
 */
public class Persona implements Util {

    private String nombre;

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

    public Persona() {
        log();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
}
