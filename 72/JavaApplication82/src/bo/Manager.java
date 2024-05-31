/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import utils.Validation;
/**
 *
 * @author ADMIN
 */
public class Manager {

    private Account account;

    public Manager() {
        account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public boolean addUser(Account acc) {
        if (acc == null) {
            return false;
        }
        account = acc;
        return true;
    }

    public boolean login(String userAccount, String encryptedPass) {
        return !(!Validation.checkUsername(userAccount, account)
                || !Validation.checkPassword(encryptedPass, account));
    }
    
    public void resetPassword(String password) {
        account.setPassword(Validation.MD5Encryption(password));  
    }
    public void account() {
        account.toString();
    }
    public boolean checkPassMatchesAccount(String encryptedPass) {
        return Validation.checkPassword(encryptedPass, account);
    }
    
    public boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }
}
