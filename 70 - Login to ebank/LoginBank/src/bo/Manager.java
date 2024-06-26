/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private Account account;
    private String captcha;
    private static final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C',
        'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
        'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n',
        'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
        '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x',
        'Y', 'y', 'Z', 'z', '9'};

    public void addAccount(Account account) {
        this.account = account;
    }

    public String generateCaptchaText() {
        final int LENGTH = 6;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            int index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);
        }
        captcha = sb.toString();
        return captcha;
    }

    public boolean checkCaptcha(String captcha) {
        if (this.captcha.compareTo(captcha) == 0) {
            return true;
        }
        return false;
    }

    public boolean isAccountNumberMatches(String accNumber) {
        if (account.getAccountNumber().compareTo(accNumber) == 0) {
            return true;
        }
        return false;
    }

    public boolean isPasswordMatches(String password) {
        if (account.getAccountPassword().compareTo(password) == 0) {
            return true;
        }
        return false;
    }
}
