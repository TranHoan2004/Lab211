/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Menu {

    public void menu() {
        String menu = "================================= Menu =================================\n"
                + "1. Enter the information for 11 countries in SoutheastAsia\n"
                + "2. Display already information\n"
                + "3. Search the country according to the entered country's name\n"
                + "4. Display the information increasing with the country's name\n"
                + "5. Exit";
        System.out.println(menu);
    }

    public int getChoice() {
        return Validation.getInt("Your choice: ", "Only one digit", "Out of range", 1, 5);
    }
}
