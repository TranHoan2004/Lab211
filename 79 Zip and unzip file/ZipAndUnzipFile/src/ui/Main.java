/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;

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
        Menu menu = new Menu();
        ManagerController mc = new ManagerController();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1 -> {
                    System.out.println("--------------- Extraction ---------------");
                    try {
                        mc.compression();
                        System.out.println("Successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("--------------- Compression ---------------");
                    try {
                        mc.extraction();
                        System.out.println("Successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("--------------- Result ---------------");
                }
                case 3 -> {
                    return;
                }
            }
        }
    }

}
