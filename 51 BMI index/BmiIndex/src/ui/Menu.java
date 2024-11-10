/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import util.Validation;

/**
 *
 * @author ADMIN
 */
public class Menu {

    public void printMenu() {
        String menu = "\n========= Calculator Program =========\n"
                + "1. Normal Calculator\n"
                + "2. BMI Calculator\n"
                + "3. Exit\n";
        System.out.println(menu);
    }

    public int getChoice() {
        return Validation.getInt("Please choice one option: ", 1, 3, "Please enter a number from 1 -> 3");
    }
}
