/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
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
                            managerController.addWorker();
                        } catch (Exception e) {
                            System.err.println("ID is existed, worker will not be added");
                        }
                    } while (Validation.checkYN());
                    System.out.printf("""
                                            -------------------- Display Worker Information -----------------------
                                            %-15s%-15s%-15s%-15s%-15s
                                            """, "Code", "Name", "Age", "Salary", "Work Location");
                    managerController.show();
                    System.out.println("Added successfully!");
                }
                case 2 -> {
                    System.out.println("--------------------------- INCREASE SALARY ---------------------------");
                    while (true) {
                        try {
                            managerController.changeSalary(choice);
                            System.out.println("Successfully!");
                            break;
                        } catch (Exception e) {
                            System.err.println("ID is not existed");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("--------------------------- DECREASE SALARY ---------------------------");
                    while (true) {
                        try {
                            managerController.changeSalary(choice);
                            System.out.println("Successfully!");
                            break;
                        } catch (Exception e) {
                            System.err.println("Amount is greater than salary or id is not existed, cannot be decreased");
                        }
                    }
                }
                case 4 -> {
                    System.out.printf("""
                                            -------------------- Display Information Salary -----------------------
                                            %-15s%-15s%-15s%-15s%-15s%-15s
                                            """, "Code", "Name", "Age", "Salary", "Status", "Date");
                    managerController.display();
                }
                case 5 -> {
                    return;
                }
            }
        }
    }
}
