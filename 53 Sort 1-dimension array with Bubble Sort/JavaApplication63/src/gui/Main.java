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
        Menu menu = new Menu();
        ManagerController manager = new ManagerController();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1:
                    System.out.println("----- Input Element -----");
                    try {
                        manager.intputElement();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("----- Ascending -----");
                    try {
                        manager.sortAscending();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        break;
                    }
                    for (int i = 0; i < manager.getArray().length; i++) {
                        if (i == manager.getArray().length - 1) {
                            System.out.printf("[%d]", manager.getArray()[i]);
                            break;
                        }
                        System.out.printf("[%d]->", manager.getArray()[i]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("----- Descending -----");
                    try {
                        manager.sortDescending();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        break;
                    }
                    for (int i = 0; i < manager.getArray().length; i++) {
                        if (i == manager.getArray().length - 1) {
                            System.out.printf("[%d]", manager.getArray()[i]);
                            break;
                        }
                        System.out.printf("[%d]<-", manager.getArray()[i]);
                    }
                    System.out.println("");
                    break;
                case 4:
                    return;
            }
        }
    }
}
