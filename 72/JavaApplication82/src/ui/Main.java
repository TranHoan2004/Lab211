/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;
import entity.Account;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManagerController managerController = new ManagerController();
        Account acc = null;
        String menu = """
                      ======================== Login Program ========================
                      1. Add User
                      2. Login
                      3. Exit                      
                      """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Please choice one option: ", "Must be an integer number", "Please enter an integer number rom 1 to 3", 1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("------------------------- Add User -------------------------");
                    while (true) {
                        try {
                            acc = managerController.addAccount();
                            break;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
                case 2 -> {
                    if (acc == null) {
                        System.err.println("There is no account in this device, cannot be login");
                        break;
                    }
                    System.out.println("------------------------- Login -------------------------");
                    while (true) {
                        try {
                            acc = managerController.login();
                            while (true) {
                                System.out.print("Hi " + acc.getName() + ", do you want change password now? ");
                                if (!Validation.checkYN()) {
                                    break;
                                }
                                try {
                                    managerController.changePassword();
                                    break;
                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }
                            }
                            break;
                        } catch (Exception e) {
                            System.err.println("Password is incorrect");
                        }
                    }
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}
