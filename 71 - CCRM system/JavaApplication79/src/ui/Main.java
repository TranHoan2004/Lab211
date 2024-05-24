/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bo.LinkedList;
import controller.ManagerController;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        LinkedList linkedList = new LinkedList();
        String menu = """
                      ========== Task program ==========
                         1. Add Task
                         2. Delete Task
                         3. Display Task
                         4. Exit
                      """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Your choice: ", "[0-9]",
                    "Please enter an integer number from 1 to 4", 1, 4);
            switch (choice) {
                case 1 -> {
                    System.out.println("---------- Add Task ----------");
                    while (true) {
                        linkedList = managerController.addTask();
                        System.out.println("Add successully");
                        if (!Validation.checkYN()) {
                            break;
                        }
                    }
                }
                case 2 -> {
                    if (linkedList.isEmpty()) {
                        System.out.println("List is empty, cannot be deleted");
                        return;
                    } else {
                        managerController.deleteTask();
                    }                    
                }
                case 3 ->
                    managerController.display();
                case 4 -> {
                    return;
                }
            }
        }
    }
}
