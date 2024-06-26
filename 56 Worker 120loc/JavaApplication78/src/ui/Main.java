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
        String menu = "========================== Worker Managerment ==========================\n"
                + "1. Add Worker\n"
                + "2. Up salary\n"
                + "3. Down salary\n"
                + "4. Display Information salary\n"
                + "5. Exit\n";
        while (true) {
            System.out.print(menu);
            int choice = Validation.checkInputInRange("Your choice: ", "Please enter an integer number from 1 to 5", 1, 5);
            switch (choice) {
                case 1:
                    do {
                        try {
                            managerController.createWorker();
                            System.out.printf("\n-------------------- Display Worker Information----------------------\n"
                                    + "%-15s%-15s%-15s%-15s%-15s\n",
                                    "Code", "Name", "Age", "Salary", "Work Location");
                            for (Worker w : managerController.getList()) {
                                System.out.println(w.toString());
                            }
                            System.out.println("Added successfully!");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                    break;
                case 2:
                case 3:
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
                    break;
                case 4:
                    System.out.printf("\n-------------------- Display Information Salary----------------------\n"
                            + "%-15s%-15s%-15s%-15s%-15s%-15s\n",
                            "Code", "Name", "Age", "Salary", "Status", "Date");
                    System.out.println("From the newest to the oldest");
                    Stack<History> list = managerController.getHistory();
                    while (!list.isEmpty()) {
                        System.out.println(list.pop().displaySalaryInformation());
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}
