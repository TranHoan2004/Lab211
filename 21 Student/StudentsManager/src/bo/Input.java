/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Course;
import entity.Course.CourseName;
import entity.Students;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Students student;

    public Input() {
        this.student = new Students();
    }

    public Students getStudents() throws Exception {
        student.setId(Validation.getStringByRegex("Student's id: ", "SE[0-9]{6}", "Must follow the format [SE******]"));
        student.setName(Validation.getStringByRegex("Student's name: ", "^[A-Za-z ]+", "Must follow the format [SE******]"));
        student.setSemester(Validation.getInt("Student's semester: ", "Only an integer number", 0, 9));
        String menu = """
                      1. Java
                      2. .Net
                      3. C/C++
                      Your course's name:  """;
        ArrayList<CourseName> list = new ArrayList<>();
        do {
            int type = Validation.getInt(menu, "Only one digit", 1, 3);
            Course course = new Course();
            list.add(course.getCourseName(type));
        } while (Validation.checkYN());
        student.setCourse(list);
        return student;
    }

}
