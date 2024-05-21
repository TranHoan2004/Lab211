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
public class ManagerController {

    private Manager manager;
    private Account account = new Account();

    public ManagerController() {
        manager = new Manager();
    }

    public void addAccount() {
        account = manager.addUser();
        System.out.println("Add successfully");
    }

    public void login() {
        manager.changePassword();
    }
}
