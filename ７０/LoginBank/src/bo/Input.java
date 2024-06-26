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

    public Account getAccountInVietnamese() {
        account.setAccountNumber(Validation.getStringByRegex("So tai khoan: ", "[0-9 ]+", "So tai khoan phai la 1 so va phai co 10 chu so"));
        account.setAccountPassword(Validation.getStringByRegex("Mat khau: ", "[A-Za-z0-9 ]+", "Mat khau phai trong khoang 9-31 ky tu va phai chua ky tu va so"));
        return account;
    }

    public Account getAccountInEnglish() {
        account.setAccountNumber(Validation.getStringByRegex("Account number: ", "[0-9 ]+", "Account number must be a number and must have 10 digits"));
        account.setAccountPassword(Validation.getStringByRegex("Password: ", "[A-Za-z0-9 ]+", "Password must be between 8 and 31 characters and must be alphanumberic"));
        return account;
    }

    public String getCapchaInVietnamese() {
        String capcha = Validation.getStringByRegex("Nhap 1 ky tu captcha: ", "[A-Za-z0-9]{6}+", "Capcha sai");
        return capcha;
    }

    public String getCapchaInEnglish() {
        String capcha = Validation.getStringByRegex("Enter a Captcha: ", "[A-Za-z0-9]{6}+", "Captcha incorrect");
        return capcha;
    }
}
