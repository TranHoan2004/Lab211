/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Student;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1:
                    do {
                        try {
                            controller.add();
                            System.out.println("Successfully");
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (Validation.pressYNtoContinue("Do you want to continue? "));
                    System.out.printf("%-15s%-15s%-15s%s\n", "ID", "Name", "Semester", "Course");
                    for (Student st: controller.getList()) {
                        System.out.println(st.toString());
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }
    }

}
