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
        this.manager = new Manager();
    }

    public void addAccount() {
        Input input = new Input();
        Account account = input.getAccountInformation();
        manager.addUser(account);
    }

    public void login() throws Exception {
        if (getAccount() == null) {
            throw new Exception("There is no account in this device, cannot be login");
        }
        String userAccount = getStringByRegex("Account: ", "Wrong account name", "[A-Za-z]+");
        String encryptedPass = Validation.MD5Encryption(getStringByRegex("Password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
        if (!manager.login(userAccount, encryptedPass)) {
            throw new Exception("Password is incorrect");
        }
    }

    public void changePassword() throws Exception {
        while (true) {
            String encryptedPass = Validation.MD5Encryption(getStringByRegex("Old password: ", "Not null", "^[a-zA-Z0-9@#$%^&+=.]+$"));
            if (!manager.checkPassMatchesAccount(encryptedPass)) {
                throw new Exception("Password is incorrect");
            }
            String newPass = Validation.getStringByRegex("New password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
            String rewritePass = Validation.getStringByRegex("Re-new password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
            if (!manager.resetPassword(newPass, rewritePass)) {
                throw new Exception("Re-new password is incorrect");
            }
        }
    }

    public Account getAccount() {
        return manager.getAccount();
    }
}
