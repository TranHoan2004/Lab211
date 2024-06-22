/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Course;
import entity.Student;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Student student;

    public Input() {
        student = new Student();
    }

    public Student getStudent() {
        student.setId(Validation.getStringByRegex("ID: ", "Must follow the format SExxxxx", "SE[0-9]{6}"));
        student.setName(Validation.getStringByRegex("Name: ", "Only letters and spaces", "[A-Za-z ]+"));
        student.setSemester(Validation.getInt("Semester: ", "Only digits", "Out of range", 1, 9));
        String menu = """
                      1. Java
                      2. dotNet
                      3. C/C++
                      Which langugue have you been learning? 
                      """;
        int choice = Validation.getInt(menu, "Only digits", "Out of range", 1, 3);
        Course c = Course.C_Cpp;
        student.setCourse(c.getCourse(choice));
        return student;
    }
}
