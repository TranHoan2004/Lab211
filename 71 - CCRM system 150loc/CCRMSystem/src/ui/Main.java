/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Task;
//import java.io.IOException;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Controller managerController = new Controller();
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
                    do {
                        try {
                            managerController.addTask();
                            System.out.println("Add successully!!\n\n\n");
//                            managerController.createFile();
//                        } catch (IOException e) {
//                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                }
                case 2 -> {
                    System.out.println("---------- Delete Task ----------");
                    try {
                        managerController.deleteTask();
                        System.out.println("Successfully\n\n\n");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("\n------------- TASK -------------");
                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time",
                            "Assigne",
                            "Reviewer");
                    for (Task task : managerController.getList()) {
                        System.out.println(task.display());
                    }
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
