/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Student;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Controller {
    private Manager manager;
    private Input input;

    public Controller() {
        this.manager = new Manager();
    }
    public void add() throws Exception {
        this.input = new Input();
        Student student = input.getStudent();
        manager.addToList(student); 
    }
    public void findAndSort() {
        
    }
    public void updateOrDelete() {
        
    }
    public void report() {
        
    }
    public ArrayList<Student> getList() {
        return manager.getList();
    }
}
