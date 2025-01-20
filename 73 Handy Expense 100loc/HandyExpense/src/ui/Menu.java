/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import utils.Validation;

/**
 * @author ADMIN
 */
public class Menu {

    public void menu() {
        String menu = """
                ======== Handy Expense Program ========
                1. Add an expense
                2. Display all expenses
                3. Delete an expense
                4. Quit
                """;
        System.out.println(menu);
    }

    public int getInt() throws Exception {
        return Validation.getInt("Your choice: ", "Only Number!", "Out of range!", 1, 4);
    }
}
