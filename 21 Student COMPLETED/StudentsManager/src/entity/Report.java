/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import entity.Course.CourseName;

/**
 *
 * @author ADMIN
 */
public final class Report {

    private Students student;
    private CourseName course;
    private int totalCourse;

    public Report() {
    }

    public Report(Students student, CourseName course) {
        this.student = student;
        this.course = course;
        this.totalCourse = 0;
        setTotalCourse();
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public CourseName getCourse() {
        return course;
    }

    public void setCourse(CourseName course) {
        this.course = course;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse() {
        for (CourseName course : student.getCourse()) {
            ++totalCourse;
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s%s",
                student.getName(),
                course);
    }

}
