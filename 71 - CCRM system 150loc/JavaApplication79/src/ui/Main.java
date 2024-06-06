/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
import entity.Task;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        String menu = """
                      ========== Task program ==========
                         1. Add Task
                         2. Delete Task
                         3. Display Task
                         4. Exit
                      """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Your choice: ", "[0-9]", "Please enter an integer number from 1 to 4", 1, 4);
            switch (choice) {
                case 1 -> {
                    System.out.println("---------- Add Task ----------");
                    try {
                        managerController.addTask();
                        System.out.println("Add successully");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 2 -> {
                    if (managerController.getList().isEmpty()) {
                        System.err.println("There is no task in the list, cannot be deleted");
                        break;
                    }
                    System.out.println("---------- Delete Task ----------");
                    managerController.deleteTask();
                    break;
                }
                case 3 -> {
                    System.out.println("\n---------------------------- TASK ----------------------------");
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Task Type", "Date", "Time",
                            "Assigne",
                            "Reviewer");
                    for (Task task : managerController.getList()) {
                        System.out.println(task.display());
                    }
                    break;
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
