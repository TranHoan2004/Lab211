/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Task;
import java.util.LinkedList;
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

    public void addTask() throws Exception {
        do {
            Input input = new Input();
            Task task = input.getTaskInformation();
            manager.addTask(task);
        } while (Validation.checkYN());
    }

    public void deleteTask() throws Exception{
        if (manager.getList().isEmpty()) {
            throw new Exception("There is no task in the list, cannot be deleted");
        }
        int id = Validation.getInt("ID: ", "Must be a positive number greater than 0", "Out of range", 1, manager.getList().size());
        manager.deleteTask(id);
    }

    public LinkedList<Task> getList() {
        return manager.getList();
    }
}
