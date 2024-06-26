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

    private int choice;

    public void getMenu() {
        String menu = "Login Program\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit\n";
        System.out.println(menu);
    }

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one positive digit", "Out of range", 1, 3);
        return choice;
    }
}
