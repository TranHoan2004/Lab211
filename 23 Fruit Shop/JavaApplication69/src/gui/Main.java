/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import controller.Controller;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true) {
            System.out.println(menu);
            switch (menu.getChoice()) {
                case 1:
                    do {
                    } while (Validation.checkYN());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
}
