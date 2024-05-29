/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import java.util.LinkedList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final LinkedList<Task> list;

    public Manager() {
        list = new LinkedList<>();
    }
    
    public LinkedList<Task> getList() {
        return list;
    }

    public boolean addTask(Task task) {
        list.add(task);
        return true;
    }

    public boolean deleteTask(int id) {
        for (Task task : list) {
            if (checkIdExist(task.getID())) {
                list.remove(findTaskByID(id));
                return true;
            }            
        }
        return false;
    }

    public Task findTaskByID(int id) {
        for (Task person : list) {
            if (person.getID() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean checkIdExist(int id) {
        for (Task person: list) {
            return (person.getID() == id);
        }
        return false;
    }
}
