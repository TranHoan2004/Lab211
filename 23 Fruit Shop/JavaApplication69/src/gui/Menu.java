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

    private int choice;

    public Menu() {
        this.choice = 0;
    }

    public void menu() {
        String menu = """
                      =====FRUIT SHOP SYSTEM=====
                      1. Create Fruit
                      2. View orders
                      3. Shopping (for buyer) 
                      4. Exit
                      """;
        System.out.println(menu);
    }

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one digit", "Out of range!", 1, 4);
        return choice;
    }
}
