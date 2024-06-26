/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Account;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Manager manager;
    private final Input input;

    public Controller() {
        this.manager = new Manager();
        this.input = new Input();
    }

    public void doBySelection(int choice) throws Exception {
        String catpcha = null;
        Account account = null;
        switch (choice) {
            case 1:
                account = inputAccountInVietnamese();
                catpcha = input.getCapchaInVietnamese();
                break;
            case 2:
                account = inputAccountInEnglish();
                catpcha = input.getCapchaInEnglish();
                break;
        }
        manager.addAccount(account);
        if (!manager.checkCaptcha(catpcha)) {
            throw new Exception("Wrong Captcha");
        }
        switch (choice) {
            case 1:
                loginInVietnamese();
                break;
            case 2:
                loginInEnglish();
                break;
        }
    }

    public String displayCaptcha() {
        return manager.generateCaptchaText();
    }

    private Account inputAccountInVietnamese() {
        Account account = input.getAccountInVietnamese();
        return account;
    }

    private Account inputAccountInEnglish() {
        Account account = input.getAccountInEnglish();
        return account;
    }

    private boolean loginInVietnamese() throws Exception {
        String accNumber = Validation.getStringByRegex("So tai khoan: ", "[0-9 ]+", "So tai khoan phai la 1 so va phai co 10 chu so");
        if (!manager.isAccountNumberMatches(accNumber)) {
            throw new Exception("So tai khoan khong trung khop");
        }
        String password = Validation.getStringByRegex("Mat khau: ", "[A-Za-z0-9 ]+", "Mat khau phai trong khoang 9-31 ky tu va phai chua ky tu va so");
        if (!manager.isPasswordMatches(password)) {
            throw new Exception("Mat khau khong dung");
        }
        return true;
    }

    private boolean loginInEnglish() throws Exception {
        String accNumber = Validation.getStringByRegex("So tai khoan: ", "[0-9 ]+", "So tai khoan phai la 1 so va phai co 10 chu so");
        if (!manager.isAccountNumberMatches(accNumber)) {
            throw new Exception("So tai khoan khong trung khop");
        }
        String password = Validation.getStringByRegex("Mat khau: ", "[A-Za-z0-9 ]+", "Mat khau phai trong khoang 9-31 ky tu va phai chua ky tu va so");
        if (!manager.isPasswordMatches(password)) {
            throw new Exception("Mat khau khong dung");
        }
        return true;
    }
}
