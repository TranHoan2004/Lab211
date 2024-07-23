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
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            choice=Validation.checkInput("Please choice one option: " , 1, 3);
            System.out.println();
            switch (choice) {
                case 1: Manager.Manager.calculateEquation();
                    break;
                case 2: Manager.Manager.calculateQuadraticEquation();
                    break;
                case 3: 
                    return;                
            }
        } while (choice >=1 && choice<=3);
    }
}
