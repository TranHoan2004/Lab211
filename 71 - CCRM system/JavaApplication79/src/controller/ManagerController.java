/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Inputer;
import bo.Manager;
import entity.Task;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final Manager manager;

    public ManagerController() {
        manager = new Manager();
    }

    public void addTask() throws Exception, UnsupportedOperationException {
        Inputer input = new Inputer();
        if (!input.inputTaskInformation()) {
            throw new Exception("Plan to is smaller than Plan from");
        }
        if (!manager.addTask(input.getInformation())) {
            throw new Exception("Add new task failed because ID is existed");
        }
    }

    public void deleteTask() throws Exception{
        if (manager.getList().isEmpty()) {
            throw new Exception();
        } else {
            int id = Validation.getInt("ID: ", "Must be a positive number greater than 0", "Out of range", 1, manager.getList().size());
            manager.deleteTask(id);
        }        
    }

    public void display() {
        for (Task task : manager.getList().traversal()) {
            System.out.println(task.display());
        }
        System.out.println();
    }
}
