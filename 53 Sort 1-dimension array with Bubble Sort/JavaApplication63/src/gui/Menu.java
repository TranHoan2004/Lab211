/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import Manager.Validation;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public static void menu() {
        int choice=0;
        do {
            System.out.println("========= Bubble Sort program =========");
            System.out.println("1. Input Element");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Exit");
            choice=Validation.checkChoice("Please choice one option: ", "Please enter a number from 1->4", 1, 4);
            switch (choice) {
                case 1: Manager.Manager.intputElement();
                    break;
                case 2: Manager.Manager.printAscendingArray();
                    break;
                case 3: Manager.Manager.printDescendingArray();
                    break;
                case 4:
                    return;
            }
        } while (choice >=1 && choice <=4);
    }
}
