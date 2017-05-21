/*
 * SimpleObject.java
 *
 * Created on 23 de junio de 2007, 14:37
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
public class SimpleObject {
    private AccountService accountService;
    /** Creates a new instance of SimpleObject */
    public SimpleObject() {
    }
    
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    
    public void insertAccount(Account account){
        accountService.insertAccount(account);
    }
    
    public List<Account> getAccounts(String name){
        return accountService.getAccounts(name);
    }
}
