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

    public void getMenu() {
        System.out.println("\n================ Doctor Management ================\n"
                + "1. Add Doctor\n"
                + "2. Update Doctor\n"
                + "3. Delete Doctor\n"
                + "4. Search Doctor\n"
                + "5. Exit\n");
    }

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one digit", "Out of range", 1, 5);
        return choice;
    }
}
