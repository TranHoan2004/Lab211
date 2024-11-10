/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Fruit;
import entity.Order;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            try {
                menu.menu();
                switch (menu.getChoice()) {
                    case 1:
                        do {
                            controller.addFruit();
                            System.out.println("Successfully!");
                        } while (Validation.checkYN());
                        display();
                        break;
                    case 2:
                        System.out.println("VIEW ORDERS");
                        int count = 0;
                        double total = 0;
                        for (Order order : controller.getListOfOrder()) {
                            System.out.printf("%-15s%-15s%-15s%s\n", "Product", "Quantity", "Price", "Amount");
                            for (Order o : order.getListOfOrder()) {
                                System.out.printf("%-15s%-15s%-15s%s\n", ++count + "." + o.getFruit().getFruitName(),
                                        o.getQuantity(), o.getFruit().getPrice(), o.getPrice());
                                total += o.getPrice();
                            }
                            count = 0;
                            System.out.println("\nTotal: " + total);
                            System.out.println("Customer: " + order.getName());
                        }
                        break;
                    case 3:
                        display();
                        controller.shopping();
                        break;
                    case 4:
                        return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void display() {
        try {
            System.out.printf("List of fruits:\n"
                    + "%-15s%-15s%-15s%-15s%s\n", "Item", "Fruit Name", "Price", "Quantities", "Origin");
            for (Fruit fruit : controller.getListOfFruit()) {
                System.out.println(fruit.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
