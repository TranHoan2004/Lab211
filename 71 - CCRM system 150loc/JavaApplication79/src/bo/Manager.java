/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import java.util.Arrays;
import java.util.Iterator;
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
        Iterator<Task> iterator = list.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getID() == id) {
                iterator.remove();
            } else if (task.getID() > id) {
                task.setID(task.getID() - 1);
            }
        }
    }
}
