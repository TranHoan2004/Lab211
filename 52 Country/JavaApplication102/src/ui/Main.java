/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Country;

import java.util.List;

/**
 * @author ADMIN
 */
public class Main {

    private static final Controller controller = new Controller();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        while (true) {
            menu.menu();
            int choice = 0;
            try {
                choice = menu.getChoice();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            switch (choice) {
                case 1:
                    System.out.println("============= Add countries =============");
                    try {
                        controller.addCountryInformation();
                        System.out.println("Add successfully");
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 2:
                    display(controller.getRecentlyEnteredInformation());
                    break;
                case 3:
                    try {
                        display(controller.searchInformationByName());
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 4:
                    display(controller.sortInformationByAscendingOrder());
                    break;
                case 5:
                    return;

            }
        }
    }

    public static void display(List<Country> list) {
        System.out.println("============= Display =============");
        System.out.printf("%-15s%-15s%-15s%s\n", "ID", "Name", "Total Area", "Terrain");
//        for (Country country : list) {
//            System.out.println(country.display());
//        }
        // doan code tren co the thay the bang doan code duoi
        list.forEach(country -> System.out.println(country.display()));
    }
}
