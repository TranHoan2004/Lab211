/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
import utils.Validation;

import java.util.stream.IntStream;

/**
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        String menu = """
                =========================== Worker Management ==========================
                1. Add Worker
                2. Up salary
                3. Down salar
                4. Display Information salar
                5. Exit
                """;
        while (true) {
            try {
                System.out.print(menu);
                int choice = Validation.getInt("Your choice: ", "Please enter an integer number from 1 to 5", 1, 5);
                switch (choice) {
                    case 1:
                        do {
                            managerController.createWorker();
                            System.out.printf("-------------------- Display Worker Information----------------------"
                                              + "%-15s%-15s%-15s%-15s%-15s\n",
                                    "Code", "Name", "Age", "Salary", "Work Location");
//                            for (Worker w : managerController.getList()) {
//                                System.out.println(w.toString());
//                            }
                            managerController.getList().forEach(System.out::println);
                            System.out.println("Added successfully!");
                        } while (Validation.checkYN());
                        break;
                    case 2:
                        System.out.println("--------------------------- CHANGE SALARY ---------------------------");
                        managerController.changeSalary(true);
                        System.out.println("Successfully!");
                        break;
                    case 3:
                        System.out.println("--------------------------- CHANGE SALARY ---------------------------");
                        managerController.changeSalary(false);
                        System.out.println("Successfully!");
                        break;
                    case 4:
                        System.out.printf("-------------------- Display Information Salary----------------------"
                                          + "%-15s%-15s%-15s%-15s%-15s%-15s\n",
                                "Code", "Name", "Age", "Salary", "Status", "Date");
                        System.out.println("From the newest to the oldest");
//                        for (int i = managerController.getHistory().size() - 1; i >= 0; i--) {
//                            System.out.println(managerController.getHistory().get(i).displaySalaryInformation());
//                        }
                        // co the thay the bang doan code duoi
                        IntStream
                                .iterate(managerController.getHistory().size() - 1, i -> i >= 0, i -> i - 1)
                                .mapToObj(i -> managerController.getHistory().get(i).displaySalaryInformation())
                                .forEach(System.out::println);
                        break;
                    case 5:
                        return;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
