/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import entity.Course.CourseName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Students {

    private String id;
    private String name;
    private int semester;
    private List<CourseName> course;

    public Students() {
        this.course = new ArrayList<>();
    }

    public Students(String id, String name, int semester, ArrayList<CourseName> course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String display() {
        return String.format("%-20s%-20s%-20d%s", id, name, semester, course);
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20d%s", name, semester, course);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<CourseName> getCourse() {
        return new ArrayList<>(course);
    }

    public void setCourse(ArrayList<CourseName> course) {
        this.course = course;
    }

}
