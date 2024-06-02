/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import controller.ManagerController;
import java.io.PrintWriter;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        Menu menu = new Menu();
        while (true) {
            menu.printMenu();
            switch (menu.getChoice()) {
                case 1:
                    System.out.println("----- Normal Calculator -----");
                    try {
                        managerController.typeA();
                        System.out.println("Answer: " + managerController.getAnswer());
                        System.out.println("Successfully!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("----- BMI Calculator -----");
                    try {
                        managerController.typeB();
                        double bmi = managerController.getBMI();
                        if (bmi < 19) {
                            System.out.println("BMI Status: UNDER_STANDARD");
                        } else if (bmi >= 19 && bmi <= 25) {
                            System.out.println("BMI Status: STANDARD");
                        } else if (bmi >= 25 && bmi <= 30) {
                            System.out.println("BMI Status: OVERWEIGHT");
                        } else if (bmi >= 30 && bmi <= 40) {
                            System.out.println("BMI Status: FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
                        } else if (bmi > 40) {
                            System.out.println("BMI Status: VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}
