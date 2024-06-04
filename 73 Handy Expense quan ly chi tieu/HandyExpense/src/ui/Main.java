/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;
import entity.Expense;

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
        ManagerController managerController = new ManagerController();
        while (true) {
            menu.menu();
            switch (menu.getInt()) {
                case 1 -> {
                    System.out.println("------------ Add an expense ------------");
                    try {
                        managerController.addExpense();
                        System.out.println("Successfully!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    if (managerController.getList().isEmpty()) {
                        System.err.println("List is null");
                        break;
                    }
                    System.out.println("------------ Display all expenses ------------");
                    System.out.printf("%-12s%-15s%-15s%s\n", "ID", "Date", "Amount", "Content");
                    for (Expense obj : managerController.getList()) {
                        System.out.println(obj.toString());
                    }
                }
                case 3 -> {
                    System.out.println("------------ Delete an expense ------------");
                    try {
                        managerController.delete();
                        System.out.println("Successfully!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
