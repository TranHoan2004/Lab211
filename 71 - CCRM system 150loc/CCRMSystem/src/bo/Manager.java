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

    public void deleteTask(int id) throws Exception {
        int index = findTask(id);
        updateID(index); 
        list.remove(index);
    }

    private int findTask(int id) throws Exception {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                return i;
            }
        }
        throw new Exception("Can not find the task that has this id");
    }

    private void updateID(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() > list.get(index).getID()) {
                int id = list.get(i).getID()-1;
                list.get(i).setID(id); 
            }
        }
    }
}
