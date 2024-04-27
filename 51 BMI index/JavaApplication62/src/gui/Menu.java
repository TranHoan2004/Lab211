/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import Manager.Validation;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu {
    
    public static void calculatorProgram() {
        int choice=0;
        do {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            choice=Validation.checkInputChoice("Please choice one option: ", 1, 3, "Please enter a number from 1 -> 3" );
            switch (choice) {
                case 1: Manager.Manager.normalCalculator();
                    break;
                case 2: Manager.Manager.bmiCalculator();
                    break;
                case 3:
                    return;
            }
        } while (choice>=1 && choice <=3);
    }
}
