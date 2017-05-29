/*
 * AccountServiceImpl.java
 *
 * Created on 23 de junio de 2007, 14:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author user
 */
public class AccountServiceImpl implements AccountService{
    private Map<String,Account> accounts = new HashMap<String,Account>();
    
    //private List<Account> accounts = new ArrayList<Account>();
    private Log log = LogFactory.getLog(getClass());
    /** Creates a new instance of AccountServiceImpl */
    public AccountServiceImpl() {
        log.info("Servidor creado");
    }
    
    public void insertAccount(Account account) {
        accounts.put(account.getNombre(),account);
    }
    
    public List<Account> getAccounts(String name) {
        List<Account> r = new ArrayList<Account>();
        r.add(accounts.get(name));
        return r;
    }
    
}
