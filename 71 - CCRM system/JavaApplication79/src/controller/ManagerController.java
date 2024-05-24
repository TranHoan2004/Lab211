/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.LinkedList;
import bo.Manager;
import entity.Task;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private Manager manager;
    private LinkedList listOfTask;

    public ManagerController() {
        manager = new Manager();
        listOfTask = new LinkedList();
    }

    public LinkedList addTask() {
        manager.addTask();
        listOfTask = manager.getList();
        display();
        return listOfTask;
    }

    public void deleteTask() {
        manager.deleteTask();
        display();
    }

    public void display() {
        System.out.println("---------------------------- TASK ----------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                "ID",
                "Name",
                "Task Type",
                "Date",
                "Time",
                "Assigne",
                "Reviewer");
        for (Task task : listOfTask.traversal()) {
            task.display();
        }
        System.out.println();
    }
}
