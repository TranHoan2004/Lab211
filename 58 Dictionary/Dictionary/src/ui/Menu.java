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
    public void getMenu() {
        String menu = """
                DICTIONARY PROGRAM
                1. Add new word
                2. Delete word
                3. Search word
                4. Exit
                """;
        System.out.println(menu);
    }

    public int getChoice() throws Exception {
        return Validation.getInt("Your choice: ", "Only one digit", 1, 4);
    }
}
