/*
 * Main.java
 *
 * Created on 23 de junio de 2007, 14:35
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package springremotingrmiclient;

import example.Account;
import example.SimpleObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] paths = {"recursos/applicationContext.xml"};
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        System.out.println("Contexto cargado");
        SimpleObject simple = (SimpleObject) ctx.getBean("simpleObject");
        Account ac = new Account();
        ac.setNombre("primera");
        simple.insertAccount(ac);
        for(Account una : simple.getAccounts("primera"))
            System.out.println(una.getNombre());
    }
    
}
