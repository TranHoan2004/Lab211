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

    public void menu() {
        String menu = """
                      ============= Word Program =============
                      1. Count Word In File
                      2. Find File By Word
                      3. Exit
                      """;
        System.out.println(menu);
        choice = Validation.getInt("Your choice: ", "Number only!", "Out of range!", 1, 3);
    }

    public int getChoice() {
        return choice;
    }
}
