/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import java.util.ArrayList;
import utils.Validation;
import static utils.Validation.getStringByRegex;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private Input input;
    private Account account;
    private ArrayList<Account> listOfAccount;

    public Manager() {
        input = new Input();
        account = new Account();
        listOfAccount = new ArrayList<>();
    }

    public Account addUser() {
        input.callInput();
        return account = input.getAccount();
    }

    public boolean login() {
        while (true) {
            try {
                String userAccount = getStringByRegex("Account: ", "Not null or empty", "[A-Za-z]+");
                String encryptedPass = Validation.MD5Encryption(getStringByRegex("Password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
                if (Validation.checkUsername(userAccount, account) && Validation.checkPassword(encryptedPass, account)) {
                    System.out.print("Hi " + account.getName() + ", do you want change password now? ");
                    return Validation.checkYN();
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Wrong username or password");
            }
        }

    }

    public void changePassword() {
        if (login()) {
            while (true) {
                try {
                    String encryptedPass = Validation.MD5Encryption(getStringByRegex("Old password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
                    if (Validation.checkPassword(encryptedPass, account)) {
                        String newPass = Validation.getStringByRegex("New password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
                        String renewPass = Validation.getStringByRegex("Renew password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
                        if (newPass.equalsIgnoreCase(renewPass)) {
                            account.setPassword(Validation.MD5Encryption(newPass)); 
                            return;
                        }
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Wrong password");
                }
            }
        } else {
            return;
        }
    }
}
