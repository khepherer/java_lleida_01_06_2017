/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package springremotinghessianclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.TestHessian;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("recursos/app.xml");
        TestHessian testHessian = (TestHessian) ac.getBean("testHessian");
        testHessian.test();
    }

}
