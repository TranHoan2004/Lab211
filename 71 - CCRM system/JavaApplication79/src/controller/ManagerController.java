/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Manager;

/**
 *
 * @author ADMIN
 */
public class ManagerController {
    private Manager manager;

    public ManagerController() {
        manager = new Manager();
    }
    public void addTask() {
        manager.addTask();
    }
    public void deleteTask() {
        manager.deleteTask();
    }
    public void display() {
        manager.show();
    }
}
