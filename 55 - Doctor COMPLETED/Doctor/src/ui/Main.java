/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Controller;
import entity.Doctor;
import java.util.ArrayList;
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
            try {
                menu.getMenu();
                switch (menu.getChoice()) {
                    case 1:
                        do {
                            System.out.println("==========Add Doctor==========");
                            controller.createDoctor();
                            System.out.println("Successfully");
                        } while (Validation.checkYN());
                        System.out.printf("%-15s%-15s%-20s%s\n", "Code", "Name", "Specialization", "Avaibility");
                        for (Doctor doctor : controller.getListOfDoctor()) {
                            System.out.println(doctor.toString()); 
                        }
                        break;
                    case 2:
                        System.out.println("==========Update Doctor==========");
                        controller.update();
                        System.out.println("Successfully");
                        break;
                    case 3:
                        System.out.println("==========Delete Doctor==========");
                        controller.delete();
                        System.out.println("Successfully");
                        break;
                    case 4:
                        System.out.println("==========Search Doctor==========");
                        ArrayList<Doctor> list = controller.search();
                        if (list.isEmpty()) {
                            System.out.println("No data");
                            break;
                        }
                        System.out.println("----------Result----------");
                        System.out.printf("%-15s%-15s%-20s%s\n", "Code", "Name", "Specialization", "Avaibility");
                        for (Doctor doctor : list) {
                            System.out.println(doctor.toString());
                        }
                        break;
                    case 5:
                        return;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}