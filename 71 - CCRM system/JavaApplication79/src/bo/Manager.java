/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Node;
import entity.Task;
import java.util.ArrayList;
import utils.ValidationAndNormalizationTextUtil;

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
        while (true) {
            input.callInputer();
            task = input.getInormation();
            list.addLast(new Task(task.getRequirementName(), task.getAssignee(), task.getReviewer(), task.getDate(),
                    task.getPlanFrom(), task.getPlanTo(), task.getTaskTypeID(), task.getID()));            
            if (!ValidationAndNormalizationTextUtil.checkYN()) {
                break;
            }
        }
        show();
    }

    public void deleteTask() {
        if (list.isEmpty()) {
            System.out.println("List is empty, cannot be deleted");
            return;
        }
        int id = input.getID(list.size());
        list.remove(ValidationAndNormalizationTextUtil.findTaskByID(id, listOfTask));
        show();
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
        for (Task task: listOfTask) {
            System.out.println();
            System.out.printf("%-15d%-15s%-15s%-15s%-15.2f%-15s%s",
                task.getID(),
                task.getRequirementName(),
                task.getType(task.getTaskTypeID()),
                task.getDate(),
                task.getTime(),
                task.getAssignee(),
                task.getReviewer());            
        }
        System.out.println();
    }
    public void show() {
        displayTask();
    }
}
