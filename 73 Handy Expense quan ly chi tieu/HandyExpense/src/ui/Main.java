/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Expense;
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
        Menu menu = new Menu();
        Controller managerController = new Controller();
        while (true) {
            try {
                menu.menu();
                switch (menu.getInt()) {
                    case 1:
                        System.out.println("------------ Add an expense ------------");
                        do {
                            managerController.addExpense();
                            System.out.println("Successfully!");
                        } while (Validation.checkYN());
                        break;
                    case 2:
                        System.out.println("------------ Display all expenses ------------");
                        System.out.printf("%-12s%-15s%-15s%s\n", "ID", "Date", "Amount", "Content");
                        for (Expense obj : managerController.getList()) {
                            System.out.println(obj.toString());
                        }
                        System.out.println("Total: " + managerController.getTotal());
                        break;
                    case 3:
                        System.out.println("------------ Delete an expense ------------");
                        managerController.delete();
                        System.out.println("Successfully!");
                        break;
                    case 4:
                        return;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
