/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private Manager manager = new Manager();

    public void inputAccount(int choice) {
        Input input = new Input();
        switch (choice) {
            case 1 -> manager.addAccount(input.getAccount("So tai khoan: ", "So tai khoan phai la 1 so va phai co 10 chu so"),
                        input.getPassword("Mat khau: " , "Mat khau phai trong khoang 9-31 ky tu va phai chua ky tu va so"));
            case 2 -> manager.addAccount(input.getAccount("Account number: ", "Account number must be a number and must have 10 digits"), 
                input.getPassword("Password: ", "Password must be between 8 and 31 characters and must be alphanumberic"));
        }
    }

    public void login() {

    }
    
    public String getAccount() {
        return manager.getAccount();
    }

    public String getPassword() {
        return manager.getPassword();
    }
}
