/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import controller.ManagerController;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        Menu menu = new Menu();
        while (true) {
            int choice = menu.calculatorProgram();
            switch (choice) {
                case 1:
                    System.out.println("----- Normal Calculator -----");
                    managerController.typeA();
                    break;
                case 2:
                    System.out.println("----- BMI Calculator -----");
                    managerController.typeB();
                    break;
                case 3:
                    return;
            }
        }
    }
}
