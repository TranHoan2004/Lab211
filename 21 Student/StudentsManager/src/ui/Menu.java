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

    public void displayMenu() {
        String menu = """
                      WELCOME TO THE STUDENT MANAGEMENT
                      1. Create
                      2. Find and Sort
                      3. Update/Delete
                      4. Report
                      5. Exit
                      """;
        System.out.println(menu);
    }

    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only one digit", 1, 5);
        return choice;
    }
}
