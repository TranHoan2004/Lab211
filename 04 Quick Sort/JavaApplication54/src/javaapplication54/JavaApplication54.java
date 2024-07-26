/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication54;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc= new Scanner(System.in);
//    
//    //CHECKINPUT
//    public static int checkInput() {
//        while (true) {
//            try {
//                int n=Integer.parseInt(sc.nextLine().trim());
//                return n;
//            } catch (NumberFormatException e) {
//                System.out.println("Error!");
//                System.out.print("Enter again: ");
//            }
//        }
//    }
    public interface StudentManagement {
        public abstract void addStudent(Student student);
        public abstract void removeStudent(Student student);
        public abstract void displayStudent(Student student);
    }
    public static class Student {
        private String studentID;
        private String name;

        public Student() {
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
    }
    public static class School implements StudentManagement{
        List<Student> person = new ArrayList();
        public School() {
        }
        
        public int numberOfStudent() {
            System.out.println("how many students?");
            int n=sc.nextInt();
            return n;
        }
        @Override
        public void addStudent(Student student) {            
            for (int i=0;i<numberOfStudent();i++) {
                String name=sc.nextLine();
                student.setName(name);
                person.add(student);
            }
            System.out.println();
        }

        @Override
        public void removeStudent(Student student) {
            System.out.println("Remove number?");
            int num=sc.nextInt();
            person.remove(num);
        }

        @Override
        public void displayStudent(Student student) {
            for (int i=0;i<numberOfStudent();i++) {
                System.out.println(student.getName());
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> person = new ArrayList<>();   
        School obj = new School();
        obj.addStudent(person);
        obj.displayStudent((Student) person);
        obj.removeStudent((Student) person);
    }
    
}
