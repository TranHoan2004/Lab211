/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import java.util.Arrays;
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
                break;
            }
        }
        for (Task task : list) {
            if (task.getID() == (id - 1)) {
                updateTask(task);                
            }
        }
    }
    
    private void updateTask(Task task) {
        int count = 0;
        for (Task t : list) {
            ++count;
            if (t == task) {
                break;
            }
        }
        Object[] a = list.toArray();
        Task[] array = Arrays.copyOf(a, a.length, Task[].class);
        for (int i = 0; i < array.length; i++) {
            Task t = array[i];
            if (i > count - 1) {
                array[i].setID(t.getID() - 1); 
            }
        }
    }
}
