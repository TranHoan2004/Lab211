/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Account;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Account account;

    public Input() {
        this.account = new Account();
    }

    public Account getAccountByVietnamese() {
        account.setAccountNumber(Validation.getAccountNumber("So tai khoan: ", "STK phai la 1 so", "STK phai co 10 chu so"));
        account.setPassword(Validation.getPassword("Mat khau: ", "Mat khau phai chua ky tu va so", "Mat khau phai trong khoang 8-31 ky tu"));
        return account;
    }
    
    public Account getAccountByEnglish() {
        account.setAccountNumber(Validation.getAccountNumber("Account number: ", "Account number must is a number", "Account number must have 10 digits"));
        account.setPassword(Validation.getPassword("Password: ", "Password must be alphanumeric", "Password must be between 8 and 31 characters"));
        return account;
    }
}
