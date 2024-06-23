/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import controller.Controller;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    private static Controller controller = new Controller();

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            System.out.println(menu);
            switch (menu.getChoice()) {
                case 1:
                    do {
                        try {
                            controller.addFruit();
                            System.out.println("Successfully!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                    display();
                    break;
                case 2:
                    do {
                        try {
                            display();
                            int item = Validation.getInt("Your selection: ", "Only one digit", "Out of range", 1, controller.getFruit().size());
                            System.out.println("You selected: " + Validation.getNameByItem(controller.getFruit(), item));

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (Validation.checkYN());
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void display() {
        try {
            System.out.printf("List of fruits:\n"
                    + "%-15s%-15s%-15s%s\n", "Item", "Fruit Name", "Origin", "Price");
            for (Fruit fruit : controller.getFruit()) {
                System.out.println(fruit.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
