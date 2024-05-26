/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final LinkedList list;

    public Manager() {
        list = new LinkedList();
    }

    public LinkedList getList() {
        return list;
    }

    public boolean addTask(Task task) {
        if (Validation.checkIdExist(task.getID(), list)) {
            return false;
        }
        list.addLast(task);
        return true;
    }

    public boolean deleteTask(int id) {
        for (Task task : list.traversal()) {
            if (!Validation.checkIdExist(task.getID(), list)) {
                return false;
            }
        }
        list.remove(findTaskByID(id));
        return true;
    }

    public Task findTaskByID(int id) {
        for (Task person : list.traversal()) {
            if (person.getID() == id) {
                return person;
            }
        }
        return null;
    }
    
}
