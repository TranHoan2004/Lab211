/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;
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
        String menu = """
                      ======================== Login Program ========================
                      1. Add User
                      2. Login
                      3. Exit                      
                      """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Please choice one option: ", "Must be an integer number",
                    "Please enter an integer number rom 1 to 3", 1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("------------------------- Add User -------------------------");
                    managerController.addAccount();
                }
                case 2 -> {
                    if (managerController.getAccount() == null) {
                        System.err.println("There is no account in this device, cannot be login");
                        break;
                    }
                    System.out.println("------------------------- Login -------------------------");
                    do {
                        try {
                            managerController.login();

                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        System.out.print("Hi " + managerController.getAccount().getName() + ", do you want change password now? ");
                        try {
                            managerController.changePassword();
                            break;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}
