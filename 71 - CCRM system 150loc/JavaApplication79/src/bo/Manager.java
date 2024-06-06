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
        this.list = new LinkedList<>();
    }

    public LinkedList<Task> getList() {
        return list;
    }

    public void addTask(Task task) {
        list.add(task);
    }

    public void deleteTask(int id) {
        for (Task task : list) {
            if (task.getID() == id) {
                list.remove(task);
                return;
            }
        }
    }
}
