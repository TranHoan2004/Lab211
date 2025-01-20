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
                ================= Doctor Management =================
                1. Add Doctor
                2. Update Doctor
                3. Delete Doctor
                4. Search Doctor
                5. Exit
                """;
        System.out.println(menu);
    }

    public int getChoice() throws Exception {
        return Validation.getInt("Your choice: ", "Only one digit", "Out of range", 1, 5);
    }
}
