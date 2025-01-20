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
public class AccountInput {

    private final Account account;

    public AccountInput() {
        this.account = new Account();
    }

    public Account getAccountInformation() throws Exception {
        account.setUserName(Validation.getStringByRegex("Account: ", "Not null", "[A-Za-z0-9]+"));
        account.setPassword(Validation.getPassword("Password: "));  
        account.setName(Validation.getStringByRegex("Name: ", "Do not have digits", "[A-Za-z ]+")); 
        account.setPhone(Validation.getPhone("Phone: "));
        account.setEmailAddress(Validation.getEmail("Email: "));
        account.setAddress(Validation.getStringByRegex("Address: ", "Must have a name of street or city", "^[a-zA-Z0-9 ,./-]+$"));
        account.setDob(Validation.getDate()); 
        return account;
    }

}
