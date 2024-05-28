/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;
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
        ManagerController managerController = new ManagerController();
        int type;
        String title ="""
                     =============== Change number system ===============                     
                     """;
        String menu = """
                      1. Binary
                      2. Decimal
                      3. Hexadecimal
                      """;
        while (true) {
            System.out.println(title);
            System.out.println(menu);
            int choice = Validation.getInt("Enter base number input: ", "Enter a number from 1 to 3", 1, 3);
            switch (choice) {
                case 1:
                    System.out.println("menu");
                    type = Validation.getInt("Enter base number output: ", "Enter a number from 1 to 3", 1, 3);
                    managerController.convertBinary(type); 
                    break;
                case 2:
                    System.out.println("menu");
                    type = Validation.getInt("Enter base number output: ", "Enter a number from 1 to 3", 1, 3);
                    managerController.convertDec(type); 
                    break;
                case 3:
                    System.out.println("menu");
                    type = Validation.getInt("Enter base number output: ", "Enter a number from 1 to 3", 1, 3);
                    managerController.convertHex(type); 
                    break;                
            }
            
        }
    }
}
