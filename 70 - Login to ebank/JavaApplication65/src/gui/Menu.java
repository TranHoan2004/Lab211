/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import utils.Validation;
import java.util.Locale;
/**
 *
 * @author ADMIN
 */
public class Menu {
    public static void menu() {
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;
        int choice=0;
        do {
            System.out.println("-------Login Program-------");
            System.out.println("1. Vietnamese");
            System.out.println("2. English");
            System.out.println("3. Exit");
            choice=Validation.checkInputChoice(1, 3, english);
            switch (choice) {
                case 1: controller.Manager.login(vietnamese);
                    break;
                case 2: controller.Manager.login(english);
                    break;
                case 3:
                    return;
            }
        } while (choice>=1 && choice<=3);
    }
}
