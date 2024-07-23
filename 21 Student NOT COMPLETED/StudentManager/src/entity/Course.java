/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public enum Course {
    Java, dotNet, C_Cpp;

    public Course getCourse(int choice) {
        switch (choice) {
            case 1 -> {
                return Course.Java;
            }
            case 2 -> {
                return Course.dotNet;
            }
            case 3 -> {
                return Course.C_Cpp;
            }
            default ->
                throw new AssertionError();
        }
    }
}
