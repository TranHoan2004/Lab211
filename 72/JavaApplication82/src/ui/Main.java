/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu = """
                      ======================== Login Program ========================
                      1. Add User
                      2. Login
                      3. Exit                      
                      """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Please choice one option: ", "Must be an integer number", "Please enter an integer number rom 1 to 3", 1, 3);
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    return;                
            }
        }
    }
    
}
