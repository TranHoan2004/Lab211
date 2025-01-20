/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import utils.Validation;

/**
 * @author ADMIN
 */
public class Menu {

    private int choice;

    public int getChoice() {
        return Validation.getInt("Your choice: ", "Only one digit!", 1, 3);
    }

    public void displayMenu() {
        String menu = """
                LOGIN PROGRAM
                1. Vietnamese
                2. English
                3. Exit
                """;
        System.out.println(menu);
    }
}
