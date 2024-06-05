/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private String account;
    private String password;

    public String getAccount(String message, String err) {
        return account = Validation.getStringByRegex(message, "[0-9 ]+", err);
    }

    public String getPassword(String message, String err) {
        return password = Validation.getStringByRegex(message, "^[a-zA-Z0-9]+$", err);
    }
}
