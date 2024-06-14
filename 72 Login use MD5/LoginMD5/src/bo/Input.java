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
public class Input {

    private final Account account;

    public Input() {
        this.account = new Account();
    }

    public Account getAccountInformation() {
        account.setUserName(Validation.getStringByRegex("Account: ", "Not null or empty", "[A-Za-z]+"));
        String password = Validation.getStringByRegex("Password: ", "Not null", "^[a-zA-Z0-9@#$%^&+=.]+$");
        account.setPassword(Validation.MD5Encryption(password)); 
        account.setName(Validation.getStringByRegex("Name: ", "Only letters and spaces", "^([A-Z][a-z]+\\\s)*[A-Z][a-z]+$"));
        account.setPhone(Validation.getPhone("Phone: "));
        account.setEmailAddress(Validation.getEmail("Email: "));
        account.setAddress(Validation.getStringByRegex("Address: ", "Must have a name of street or city", "^[a-zA-Z0-9 ,./-]+$"));
        account.setDob(Validation.getDate()); 
        return account;
    }

}
