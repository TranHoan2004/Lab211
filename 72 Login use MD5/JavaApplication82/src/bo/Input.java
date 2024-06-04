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

    private Account account;

    public Input() {
        account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public void inputAccountInformation() {
        account.setUserName(Validation.getStringByRegex("Account: ", "Not null or empty", "[A-Za-z]+"));
        String password = Validation.getStringByRegex("Password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
        account.setPassword(Validation.MD5Encryption(password)); 
        account.setName(Validation.getStringByRegex("Name: ", "Only letters and spaces, not null", "[A-Za-z ]+"));
        account.setPhone(Validation.getPhone(10, "Phone: "));
        account.setEmailAddress(Validation.getEmail("Email: "));
        account.setAddress(Validation.getStringByRegex("Address: ", "Must have a name of street or city", "^[a-zA-Z0-9 ,./-]+$"));
        account.setDob(Validation.checkInputDate()); 
    }

}
