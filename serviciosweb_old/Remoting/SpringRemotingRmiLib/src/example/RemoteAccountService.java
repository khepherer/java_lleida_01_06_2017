/*
 * RemoteAccountService.java
 *
 * Created on 23 de junio de 2007, 14:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author user
 */
public interface RemoteAccountService extends Remote{
    public void insertAccount(Account account) throws RemoteException;
    
    public List<Account> getAccounts(String name) throws RemoteException;
    
}
