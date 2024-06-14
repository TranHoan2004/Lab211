/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Task;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.LinkedList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Manager manager;

    public Controller() {
        this.manager = new Manager();
    }

    public void addTask() throws Exception {
        Input input = new Input();
        Task task;
        task = input.getTaskInformation();
        manager.addTask(task);
    }

    public void deleteTask() throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("There is no task in the list, cannot be deleted");
        }
        int id = Validation.getInt("ID: ", "Must be a positive number greater than 0", "Out of range", 1, manager.getList().size());
        manager.deleteTask(id);
    }

//    public void createFile() throws IOException {
//        File file = new File("Data.txt");
//        boolean isEmpty = !file.exists() || file.length() == 0;
//        FileWriter fw = new FileWriter("Data.txt", true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        if (isEmpty) {
//            bw.write("\n------------- TASK -------------\n");
//            String string = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Task Type", "Date", "Time",
//                    "Assigne",
//                    "Reviewer");
//            bw.write(string);
//        }
//        bw.write("\n");
//        for (Task handy : manager.getList()) {
//            bw.write(handy.display());
//        }
//        bw.close();
//        fw.close();
//    }
    public LinkedList<Task> getList() {
        return manager.getList();
    }
}
