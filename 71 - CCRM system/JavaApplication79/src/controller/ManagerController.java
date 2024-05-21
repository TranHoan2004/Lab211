/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Manager;
import utils.Validation;

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
        while (true) {
            manager.addTask();
            System.out.println("Add successully");
            display();
            if (!Validation.checkYN()) {
                break;
            }
        }
    }

    public void deleteTask() {
        manager.deleteTask();
        display();
    }

    public void display() {
        manager.displayTask();
    }
}
