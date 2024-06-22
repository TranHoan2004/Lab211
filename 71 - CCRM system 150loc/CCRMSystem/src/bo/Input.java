/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private static int counter = 0;
    private final Task task;

    public Input() {
        this.task = new Task();
    }

    public Task getTaskInformation() throws Exception {
        task.setRequirementName(Validation.getStringByRegex("Requirement Name: ", "[A-Za-z ]+",
                "Do not have specials characters"));
        task.setTaskTypeID(Validation.getInt("Task Type: ", "Must be a positive number greater than 0",
                "Out of range", 1, 4));
        task.setDate(Validation.getDate());
        task.setPlanFrom(Validation.getDouble("From: ", "Must be a number greater than 0", 1, 18));
        task.setPlanTo(Validation.getDouble("To: ", "Must be a number greater than 0", task.getPlanFrom() + 0.5, 24)); 
        task.setAssignee(Validation.getStringByRegex("Assignee: ", "[A-Za-z]+", "Please enter a word"));
        task.setReviewer(Validation.getStringByRegex("Reviewer: ", "[A-Za-z]+", "Do not have specials characters"));
        task.setID(++counter);
        return task;
    }

}
