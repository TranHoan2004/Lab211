/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import utils.Validation;
import entity.Order;

/**
 *
 * @author ADMIN
 */
public class Menu {

    public void menu() {
        String menu = "\n=====FRUIT SHOP SYSTEM=====\n"
                + "1. Create Fruit\n"
                + "2. View orders\n"
                + "3. Shopping (for buyer)\n"
                + "4. Exit";
        System.out.println(menu);
    }

    public int getChoice() throws Exception {
        return Validation.getInt("Your choice: ", "Only one digit", "Out of range!", 1, 4);
    }
}
