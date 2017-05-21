/*
 * AccountService.java
 *
 * Created on 23 de junio de 2007, 14:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

import java.util.List;

/**
 *
 * @author user
 */
public interface AccountService {
    public void insertAccount(Account account);
    
    public List<Account> getAccounts(String name);
    
}
