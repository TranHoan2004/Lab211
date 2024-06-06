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

    public Account getAccount() {
        return account;
    }

    public void addUser(Account account) {
        this.account = account;
    }

    public boolean login(String userAccount, String encryptedPass) {
        return !(!Validation.checkUsername(userAccount, account)
                || !Validation.checkPassword(encryptedPass, account));
    }

    public boolean resetPassword(String password, String rewritePass) {
        if (!checkPassMatchesPass(password, rewritePass)) {
            return false;
        } else {
            account.setPassword(Validation.MD5Encryption(rewritePass));
            return true;
        }
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
