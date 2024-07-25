/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Course {

    public enum CourseName {
        Java, dotNet, C_Cpp
    }

    public CourseName getCourseName(int type) {
        switch (type) {
            case 1 -> {
                return CourseName.Java;
            }
            case 2 -> {
                return CourseName.dotNet;
            }
            case 3 -> {
                return CourseName.C_Cpp;
            }
            default -> throw new AssertionError();
        }
    }
}
