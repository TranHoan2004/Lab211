/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Menu {

    private int choice;

    public void menu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        choice = Validation.checkInput("Please choice one option: ", "[0-9]+","Please enter a number from 1->4", 1, 4);
    }

    public int getChoice() {
        return choice;
    }
}
