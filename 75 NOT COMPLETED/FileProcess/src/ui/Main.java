/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import java.io.File;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        String string = "Data";
        File path = new File("C:\\Users\\ADMIN\\OneDrive\\Máy tính\\hàm java\\Exercise\\TryFileIO");
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.getName().equals(string)) {
                if (file.isDirectory()) {
                    System.out.println("Directory");
                } else if (file.isFile()) {
                    System.out.println("File");
                }
                return;
            }
        }
        System.out.println("Path name invalid");
//        while (true) {
//            menu.getMenu();
//            menu.setChoice();
//            switch (menu.getChoice()) {
//                case 1:
//                    System.out.println("======================= Check Path =======================");
//                    while (true) {
//                        try {
//                            if (controller.checkInputPath()) {
//                                System.out.println("Path to file");
//                            } else {
//                                System.out.println("Path to directory");
//                            }
//                            break;
//                        } catch (Exception e) {
//                            System.out.println(e.getMessage());
//                        }
//                    }
//                    break;
//                case 2:
//                    System.out.println("=============== Get file name with type java ===============");
//                    try {
//                        int number = controller.getByTypeJava();
//                        if (number == 0 || number == 1) {
//                            System.out.println("Result: " + number + " file!");
//                        } else {
//                            System.out.println("Result: " + number + " files!");
//                        }
//                    } catch (Exception e) {
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//                case 3:
//                    System.out.println("============== Get file with size greater than input ==============");
//
//                    break;
//                case 4:
//                    System.out.println("================ Write more content to file ================");
//
//                    break;
//                case 5:
//                    System.out.println("============== Read file and count characters ==============");
//
//                    break;
//                case 6:
//                    return;
//            }
//        }
    }

}
