/*
 * Main.java
 *
 * Created on 23 de junio de 2007, 14:17
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package sprinremotingrmiserver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class Main {
    private ClassPathXmlApplicationContext ctx;
    private Log log = LogFactory.getLog(getClass());
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.cargarContexto();
    }

    private void cargarContexto() {
        String[] paths = {"recursos/applicationContext.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        log.info("Contexto cargado");
    }
    
}
