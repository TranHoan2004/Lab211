/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bo.Manager;
import controller.ManagerController;
import utils.ValidationAndNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class Menu {

    public static void menu() {
        ManagerController manager = new ManagerController();
        while (true) {
            String menu = """
                      =======Calculator Program=======
                      1. Addition Matrix
                      2. Subtraction Matrix
                      3. Multiplication Matrix
                      4. Quit
                      """;
            System.out.print(menu);
            int choice = ValidationAndNormalizationTextUtil.checkInputInRange("Your choice: ", "Please enter an integer number from 1 to 4", 1, 4);
            switch (choice) {
                case 1:
                    manager.additionMatrix();
                    break;
                case 2:
                    manager.subtractionMatrix();
                    break;
                case 3:
                    manager.multiplicationMatrix();
                    break;
                case 4:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }
}
