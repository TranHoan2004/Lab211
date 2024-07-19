/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bo.OperatorManager.Type;
import controller.Controller;
import java.io.PrintWriter;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true) {
            menu.printMenu();
            switch (menu.getChoice()) {
                case 1:
                    System.out.println("----- Normal Calculator -----");
                    double ans = 0;
                    controller.getA();
                    Type operator = null;
                    while (true) {
                        try {
                            operator = controller.getOperation();
                            if (operator == Type.EQUAL) {
                                ans = controller.typeA(operator);
                                System.out.println("Answer: " + ans);
                                break;
                            }
                            ans = controller.typeA(operator);
                            System.out.println("Answer: " + ans);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("----- BMI Calculator -----");
                    try {
                        double bmi = controller.typeB();
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
