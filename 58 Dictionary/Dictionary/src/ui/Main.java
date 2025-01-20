/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Controller;
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
                            controller.createWord();
                        } while (Validation.checkYN());
                        System.out.println("Successful");
                        break;
                    case 2:
                        controller.delete();
                        System.out.println("Successfully");                        
                        break;
                    case 3:
                        System.out.println("Vietnamese: " + controller.translate());
                        break;
                    case 4:
                        return;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
