/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
import utils.ValidationAndNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public static void menu() throws Exception {
        ManagerController managerController = new ManagerController();
        String menu = """
                      ======= Worker Managerment =======
                          1. Add Worker
                          2. Up salary
                          3. Down salary
                          4. Display Information salary
                          5. Exit
                      
                      """;
        
        while (true) {
            System.out.print(menu);
            int choice = ValidationAndNormalizationTextUtil.checkInputInRange("Your choice: ", "Please enter an integer number from 1 to 5", 1, 5);
            switch (choice) {
                case 1:
                    managerController.addWorker();
                    break;
                case 2:
                    managerController.upSalary();
                    break;
                case 3:
                    managerController.downSalary();
                    break;
                case 4:
                    managerController.getInformationSalary();
                    break;
                case 5:
                    return;
            }
        }
    }
}
