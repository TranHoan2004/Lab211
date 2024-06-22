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

    public Menu() {
        
    }
    public void menu() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT\n"+
                "1. Create\n"+
                "2. Find and Sort\n"+
                "3. Update/Delete\n"+
                "4. Report\n"+
                "5. Exit");
    }
    public int getChoice() {
        choice = Validation.getInt("Your choice: ", "Only digit", "Out of range", 1, 5);
        return choice;
    }
}
