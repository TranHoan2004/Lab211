/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Expense;
import utils.Validation;

import java.util.List;

/**
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        Controller controller = new Controller();
        while (true) {
            try {
                menu.menu();
                switch (menu.getInt()) {
                    case 1 -> {
                        System.out.println("------------ Add an expense ------------");
                        do {
                            controller.addExpense();
                            System.out.println("Successfully!");
                        } while (Validation.checkYN());
                    }
                    case 2 -> {
                        List<Expense> list = controller.getList();
                        if (!list.isEmpty()) {
                            System.out.println("------------ Display all expenses ------------");
                            System.out.printf("%-12s%-15s%-15s%s\n", "ID", "Date", "Amount", "Content");
//                        for (Expense expense : list) {
//                            System.out.println(expense.toString());
//                        }
                            // co the thay the bang doan code duoi
                            list.stream().map(Expense::toString).forEach(System.out::println);
                            System.out.println("Total: " + controller.getTotal());
                        } else {
                            System.out.println("List is empty");
                        }
                    }
                    case 3 -> {
                        System.out.println("------------ Delete an expense ------------");
                        controller.delete();
                        System.out.println("Successfully!");
                    }
                    case 4 -> {
                        return;
                    }
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
