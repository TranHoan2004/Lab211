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
    private Task task;
    private ArrayList<Task> listOfTask;
    private LinkedList list;

    public Manager() {
        input = new Inputer();
        listOfTask = new ArrayList<>();
        list = new LinkedList();
    }

    public void addTask() {
        System.out.println("---------- Add Task ----------");
        input.callInputer();
        task = input.getInformation();
        list.addLast(new Task(task.getRequirementName(), task.getAssignee(), task.getReviewer(), task.getDate(),
                task.getPlanFrom(), task.getPlanTo(), task.getTaskTypeID(), task.getID()));
    }

    public void deleteTask() {
        if (list.isEmpty()) {
            System.out.println("List is empty, cannot be deleted");
            return;
        }
        int id = Validation.getInt("ID: ", "Must be a positive number greater than 0", "Out of range",1, list.size());
        list.remove(Validation.findTaskByID(id, listOfTask));
    }

    public void displayTask() {
        System.out.println("---------------------------- TASK ----------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                "ID",
                "Name",
                "Task Type",
                "Date",
                "Time",
                "Assigne",
                "Reviewer");
        listOfTask = list.traversal();
        for (Task task : listOfTask) {
            task.display();
        }
        System.out.println();
    }
}
