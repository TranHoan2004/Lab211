/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author ADMIN
 */
public class Manager {

    private final List<Task> list;
    private static int count; //ID sàn (ID nhỏ nhất)

    public Manager() {
        this.list = new LinkedList<>();
        count = 0;
    }

    public List<Task> getList() {
        return new LinkedList<>(list);
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
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getID() == id) {
//                return i;
//            }
//        }
//        throw new Exception("Can not find the task that has this id");
        // co the thay the doan code tren bang doan code duoi
        Task index = list
                .stream().filter(i -> i.getID() == id)
                .findAny().orElseThrow(() -> new Exception("Can not find the task that has this id"));
        return list.indexOf(index);
    }

    private void updateID(int index) throws Exception {
//        for (Task task : list) {
//            if (task.getID() > list.get(index).getID()) {
//                int id = task.getID() - 1;
//                task.setID(id);
//            }
//        }
        // co the thay the bang doan code duoi
        Task t = list
                .stream().filter(task -> task.getID() > list.get(index).getID())
                .findAny().orElseThrow(() -> new Exception("Can not find the task that has this id"));
        int id = t.getID() - 1;
        t.setID(id);
    }

    private int findMaxIndex() {
//        int index = 0;
//        for (int i = 0; i < list.size(); i++) {
//            ++index;
//        }
        // co the thay the bang doan code duoi
        return (int) IntStream.range(0, list.size()).count();
    }
}
