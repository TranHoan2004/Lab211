/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        ManagerController managerController = new ManagerController();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1 -> {
                    System.out.println("\n-------Addition-------");
                    try {
                        managerController.additionMatrix();
                        menu.printAnswer('+', managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                                managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n-------Subtraction-------");
                    try {
                        managerController.subtractionMatrix();
                        menu.printAnswer('-', managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                                managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("\n-------Multiplication-------");
                    managerController.addMatrix();
                    try {
                        managerController.multiplicationMatrix();
                        menu.printAnswer('*', managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                                managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
