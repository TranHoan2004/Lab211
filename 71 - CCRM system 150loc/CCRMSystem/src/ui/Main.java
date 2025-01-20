/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Task;
import utils.Validation;

import java.util.List;

/**
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
            try {
                int choice = Validation.getInt("Your choice: ", "[0-9]", "Please enter an integer number from 1 to 4", 1, 4);
                switch (choice) {
                    case 1:
                        System.out.println("---------- Add Task ----------");
                        do {
                            managerController.addTask();
                            System.out.println("Add successfully!!");
                        } while (Validation.checkYN());
                        break;
                    case 2:
                        System.out.println("---------- Delete Task ----------");
                        managerController.deleteTask();
                        System.out.println("Successfully");
                        break;
                    case 3:
                        List<Task> tasks = managerController.getList();
                        if (tasks.isEmpty()) {
                            throw new Exception("There is no task in the list, cannot be deleted");
                        }
                        System.out.println("\n------------- TASK -------------");
                        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time",
                                "Assigne",
                                "Reviewer");
//                        for (Task task : tasks) {
//                            System.out.println(task.display());
//                        }
                        // co the thay the bang doan code duoi
                        tasks.stream().map(Task::display).forEach(System.out::println);
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
