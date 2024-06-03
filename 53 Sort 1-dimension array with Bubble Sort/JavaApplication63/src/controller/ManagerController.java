/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    public Manager manager;

    public ManagerController() {
        this.manager = new Manager();
    }

    public void intputElement() throws Exception {
        Input input = new Input();
        int size = input.getInt();
        if (!manager.addArray(input.getArray(size))) {
            throw new Exception("Error!");
        }
    }

    public void sortAscending() throws Exception {
        if (manager.getArray() == null) {
            throw new Exception("There is no array in this program");
        }
        manager.sortAscending();
    }

    public void sortDescending() throws Exception {
        if (manager.getArray() == null) {
            throw new Exception("There is no array in this program");
        }
        manager.sortDescending();
    }

    public int[] getArray() {
        return manager.getArray();
    }
}
