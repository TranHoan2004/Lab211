/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.AccountManager;
import bo.Input;
import bo.ListOfAccountManager;
import entity.Account;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final AccountManager accManager;
    private Input input;

    public Controller() {
        this.accManager = new AccountManager();
    }

    public void createAccount(boolean type) {
        input = new Input();
        Account account;
        if (type) {
            account = input.getAccountByVietnamese();
        } else {
            account = input.getAccountByEnglish();
        }
    }
}
