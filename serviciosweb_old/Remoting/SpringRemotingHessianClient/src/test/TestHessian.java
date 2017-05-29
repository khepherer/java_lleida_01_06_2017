package test;


import beans.Factura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TestHessian {

    private Factura factura;

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void test() {
        System.out.println("El importe es " + factura.importe(1000L));
    }
}
