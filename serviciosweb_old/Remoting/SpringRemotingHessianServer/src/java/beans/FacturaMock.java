/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author user
 */
public class FacturaMock implements Factura {

    public Double importe(Long facturaId) {
        return facturaId.doubleValue() + 1000.0d;
    }
}
