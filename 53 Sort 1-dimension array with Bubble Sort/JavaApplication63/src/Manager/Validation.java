/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
    public static int checkChoice(String msg, String err, int min, int max) {
        int choice=0;
        while (true) {
            try {
                System.out.print(msg);
                choice=Integer.parseInt(sc.nextLine().trim());
                if (choice<min || choice>max) System.out.println(err);
                else return choice;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }
    
    public static Integer checkInput(String msg, String err) {
        int number=0;
        while (true) {
            try {
                System.out.print(msg);
                number=Integer.parseInt(sc.nextLine().trim());
                if (number<=0) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
}
