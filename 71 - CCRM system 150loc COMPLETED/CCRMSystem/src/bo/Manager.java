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
    private static int count; //ID sàn (ID nhỏ nhất)

    public Manager() {
        this.list = new LinkedList<>();
        count = 0;
    }

    public LinkedList<Task> getList() {
        return list;
    }

    public void addTask(Task task) {
        task.setID(++count);
        list.add(task);
    }

    public void deleteTask(int id) throws Exception {
        int index = findTask(id);
        updateID(index); //cập nhật tất cả các ID phía sau task sẽ bị xóa 
        list.remove(index);
        count = findMaxIndex(); //cập nhật ID sàn cho các task kế tiếp sẽ được tạo 
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
        for (Task task : list) {
            if (task.getID() > list.get(index).getID()) {
                int id = task.getID() - 1;
                task.setID(id);
            }
        }
    }

    private int findMaxIndex() {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            ++index;
        }
        return index;
    }
}
