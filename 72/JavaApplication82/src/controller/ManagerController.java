/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Account;
import utils.Validation;
import static utils.Validation.getStringByRegex;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final Manager manager;

    public ManagerController() {
        manager = new Manager();
    }

    public void addAccount() throws Exception {
        Input input = new Input();
        input.inputAccountInformation();
        Account account = input.getAccount();
        manager.addUser(account);
        if (!manager.addUser(account)) {
            throw new Exception("Add account failed");
        }
    }

    public Account login() throws Exception, NullPointerException {
        if (manager.getAccount() == null) {
            throw new NullPointerException();
        }
        String userAccount = getStringByRegex("Account: ", "Wrong account name", "[A-Za-z]+");
        String encryptedPass = Validation.MD5Encryption(getStringByRegex("Password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
        if (!manager.login(userAccount, encryptedPass)) {
            throw new Exception();
        }
        return manager.getAccount();
    }

    public void changePassword() throws Exception {
        while (true) {
            String encryptedPass = Validation.MD5Encryption(getStringByRegex("Old password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
            if (!manager.checkPassMatchesAccount(encryptedPass)) {
                throw new Exception("Password is incorrect");
            }
            manager.resetPassword(getNewPassword());
        }
    }

    public String getNewPassword() throws Exception {
        String newPass = Validation.getStringByRegex("New password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
        String rewritePass = Validation.getStringByRegex("Re-new password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
        if (!manager.checkPassMatchesPass(newPass, rewritePass)) {
            throw new Exception("Re-new password is incorrect");
        } else {
            return rewritePass;
        }
    }

}
