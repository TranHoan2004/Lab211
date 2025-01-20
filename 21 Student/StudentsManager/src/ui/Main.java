/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Report;
import entity.Students;
import utils.Validation;

import java.util.List;

/**
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
                menu.displayMenu();
                switch (menu.getChoice()) {
                    case 1 -> {
                        do {
                            controller.createStudents();
                            System.out.println("Successfully");
                        } while (Validation.checkYN());
                        System.out.printf("%-20s%-20s%s\n", "Student's name", "Semester", "Course's name");
//                        for (Students stu : controller.getList()) {
//                            System.out.println(stu.display());
//                        }
                        // co the thay the bang doan code duoi
                        controller.getList().stream().map(Students::display).forEach(System.out::println);
                    }
                    case 2 -> {
                        List<Students> list = controller.findAndSortByName();
                        System.out.println("Result:");
                        System.out.printf("%-20s%-20s%s\n", "Student's name", "Semester", "Course's name");
//                        for (Students student : list) {
//                            System.out.printf("%-20s%-20d%s",
//                                    student.getName(),
//                                    student.getSemester(),
//                                    student.getCourse());
//                        }
                        list.forEach(student -> System.out.printf("%-20s%-20d%s",
                                student.getName(),
                                student.getSemester(),
                                student.getCourse()));
                    }
                    case 3 -> {
                        controller.updateOrDelete();
                        System.out.println("Successfully");
                    }
                    case 4 -> {
                        List<Report> list = controller.report();
                        if (list.isEmpty()) {
                            System.out.println("Report is empty");
                            break;
                        }
                        System.out.println("Course that students have assigned: ");
                        System.out.printf("%-20s%-20s%s\n", "Student's name", "Course's name", "Total Course");
//                        for (Report report : list) {
//                            System.out.println(report.toString());
//                        }
                        list.stream().map(Report::toString).forEach(System.out::println);
                        System.out.println("\nTotal course of students: ");
                        for (int i = 0; i < list.size(); i++) {
                            if (i != 0) {
                                if (!list.get(i).getStudent().getName().equalsIgnoreCase(list.get(i - 1).getStudent().getName())
                                    && !list.get(i).getCourse().equals(list.get(i - 1).getCourse())) {
                                    System.out.printf("%-20s%-20s%d\n", list.get(i).getStudent().getName(),
                                            list.get(i).getCourse(),
                                            list.get(i).getTotalCourse());
                                }
                            } else {
                                System.out.printf("%-20s%-20s%d\n", list.get(i).getStudent().getName(),
                                        list.get(i).getCourse(),
                                        list.get(i).getTotalCourse());
                            }
                        }
                    }
                    case 5 -> {
                        return;
                    }
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
