/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Node;
import entity.Task;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private Inputer input;
    private LinkedList list;

    public Manager() {
        input = new Inputer();
        list = new LinkedList();
    }

    public void addTask() {
        Task task = new Task();
        task = input.inputTaskInformation(); 
        list.addLast(task);
    }

    public void deleteTask() {
        int id = Validation.getInt("ID: ", "Must be a positive number greater than 0", "Out of range",1, list.size());
        list.remove(Validation.findTaskByID(id, list));
    }
    public LinkedList getList() {
        return list;
    }
}
