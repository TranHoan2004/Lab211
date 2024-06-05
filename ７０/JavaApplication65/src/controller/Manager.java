/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import utils.Validation;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author ADMIN
 */
public class Manager {
    private static final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C',
        'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
        'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n',
        'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
        '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x',
        'Y', 'y', 'Z', 'z', '9'};
     public static String generateCaptchaText() {
        final int LENGTH = 6;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < LENGTH; i++) {
            index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);
        }
        return sb.toString();
    }

    public static void login(Locale language) {
        Validation.getWordLanguage(language, "enterAccountNumber");
        int accountNumber = Validation.checkInputAccount(language);
        Validation.getWordLanguage(language, "enterPassword");
        String passString = Validation.checkInputPassword(language);
        String captchaGenerated = generateCaptchaText();
        while (true) {
            if (Validation.checkInputCaptcha(captchaGenerated, language)) {
                Validation.getWordLanguage(language, "loginSuccess");
                System.out.println();
                return;
            } else {
                Validation.getWordLanguage(language, "errCaptchaIncorrect");
                System.out.println();
            }
        }
    }
}
