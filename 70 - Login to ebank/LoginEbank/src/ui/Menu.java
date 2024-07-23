/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Menu {

    private int choice;

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one digit!", 1, 3);
        return choice;
    }

    public void displayMenu() {
        String menu = "LOGIN PROGRAM\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit\n";
        System.out.println(menu);
    }
}
