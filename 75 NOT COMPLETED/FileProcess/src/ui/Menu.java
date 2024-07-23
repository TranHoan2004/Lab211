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

    private int choice = 0;

    public void getMenu() {
        String menu = """
                      =================== File Processing ===================
                      1. Check path
                      2. Get file name with type java
                      3. Get file with size greater than input
                      4. Write more content to file
                      5. Read file and count characters
                      6. Exit
                      """;
        System.out.println(menu);
    }

    public void setChoice() {
        this.choice = Validation.getInt("Your choice: ", "Only number!", "Out of range!", 1, 6);
    }

    public int getChoice() {
        return this.choice;
    }
}
