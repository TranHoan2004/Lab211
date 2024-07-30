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
        String menu = "\nDICTIONARY PROGRAM"
                + "\n1. Add new word"
                + "\n2. Delete word"
                + "\n3. Search word"
                + "\n4. Exit";
        System.out.println(menu);
    }

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one digit", 1, 4);
        return choice;
    }
}
