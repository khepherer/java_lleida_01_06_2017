/*
 * Account.java
 *
 * Created on 23 de junio de 2007, 14:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Account implements Serializable {
    private String nombre;
    /** Creates a new instance of Account */
    public Account() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
