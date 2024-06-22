/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
import entity.History;
import entity.Worker;
import java.util.Stack;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        String menu = """
                      ========================== Worker Managerment ==========================
                          1. Add Worker
                          2. Up salary
                          3. Down salary
                          4. Display Information salary
                          5. Exit                      
                      """;
        while (true) {
            System.out.print(menu);
            int choice = Validation.checkInputInRange("Your choice: ", "Please enter an integer number from 1 to 5", 1, 5);
            switch (choice) {
                case 1 -> {
                    do {
                        try {
                            managerController.createWorker();
                            System.out.printf("""
                                            -------------------- Display Worker Information -----------------------
                                            %-15s%-15s%-15s%-15s%-15s
                                            """, "Code", "Name", "Age", "Salary", "Work Location");
                            for (Worker w : managerController.getList()) {
                                System.out.println(w.toString());
                            }
                            System.out.println("Added successfully!");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                }
                case 2, 3 -> {                    
                    System.out.println("--------------------------- CHANGE SALARY ---------------------------");
                    while (true) {
                        try {
                            managerController.changeSalary(choice);
                            System.out.println("Successfully!");
                            break;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
                case 4 -> {
                    System.out.printf("""
                                    -------------------- Display Information Salary -----------------------
                                    %-15s%-15s%-15s%-15s%-15s%-15s
                                    """, "Code", "Name", "Age", "Salary", "Status", "Date");
                    System.out.println("From the newest to the oldest");
                    Stack<History> list = managerController.getHistory();
                    while (!list.isEmpty()) {
                        System.out.println(list.pop().displaySalaryInformation());
                    }
                }
                case 5 -> {
                    return;
                }
            }
        }
    }
}
