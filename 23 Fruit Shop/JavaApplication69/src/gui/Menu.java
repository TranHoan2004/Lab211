/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import utils.Validation;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public static void menu() {
//        int choice=0;
//        String continueChoice;
//        ArrayList<Fruit> fruit = new ArrayList<>();
//        Hashtable<String, ArrayList<Order>> hashTable = new Hashtable<>();
//        do {
//            System.out.println("");
//            System.out.println("=====FRUIT SHOP SYSTEM=====");
//            System.out.println("1. Create Fruit");
//            System.out.println("2. View orders");
//            System.out.println("3. Shopping (for buyer)");
//            System.out.println("4. Exit");
//            choice = Validation.checkInputChoice("(Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to exit program) ", "Please enter an integer number from 1 to 4",1,4);
//            switch (choice) {
//                case 1: 
//                    while (true) {
//                        bo.Manager.createFruit();
//                        if (!Validation.checkYN("Do you want to continue (Y/N)? ", "Please enter Y or N")) break;                                                    
//                    } 
//                    break;
//                case 2: 
//                    bo.Manager.viewOrders(hashTable);
//                    break;
//                case 3: 
//                    bo.Manager.Shopping(fruit, hashTable);
//                    break;
//                case 4:
//                    return;                
//            }
//        } while (choice>=1 && choice<=4);
        int choice=0;
        String continueChoice;
        ArrayList<Fruit> fruit = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> hashTable = new Hashtable<>();
        String menu = """
                      =====FRUIT SHOP SYSTEM=====
                      1. Create Fruit
                      2. View orders
                      3. Shopping (for buyer) 
                      4. Exit
                      """;
        while (true) {
            System.out.println(menu);
            choice = Validation.checkInputChoice("(Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to exit program) ", "Out of range!",1,4);
            switch (choice) {
                case 1: 
                    do {
//                        bo.Manager.createFruit();                                                  
                    }  while (Validation.checkYN("Do you want to continue (Y/N)? ", "Please enter Y or N"));
                    break;
                case 2: 
//                    bo.Manager.viewOrders(hashTable);
                    break;
                case 3: 
//                    bo.Manager.Shopping(fruit, hashTable);
                    break;
                case 4:
                    return;                
            }
        } 
    }
}
