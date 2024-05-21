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
public class Inputer {
    private Task task;

    public Inputer() {
        task = new Task();
    }
    public Task getInformation() {
        return task;
    }
    
    private void inputTaskInformation() {
        task.setRequirementName(Validation.getStringByRegex("Requirement Name: ", "^([A-Z][a-z]+\\\s)*[A-Z][a-z]+$",
                "Each word in name of task must begin with an upper case letter and following by lower case letters"));
        task.setTaskTypeID(Validation.getInt("Task Type: ", "Must be a positive number greater than 0",
                "Out of range", 1, 4));
        task.setDate(Validation.getStringByRegex("Date: ", "^([0-2][0-9]|(3)[0-1])(\\-)(((0)[0-9])|((1)[0-2]))(\\-)\\d{4}$",
                "Date must be in the format dd-MM-yyyy"));
        task.setPlanFrom(Validation.getDouble("From: ", "Must be a number greater than 0", 1, 24));
        task.setPlanTo(Validation.getDouble("To: ", "Must be a number greater than 0", 1, 24));
        task.setAssignee(Validation.getStringByRegex("Assignee: ", "^[A-Z][a-z]+$", "Please enter a word"));
        task.setReviewer(Validation.getStringByRegex("Reviewer: ", "^([A-Z][a-z]+\\\s)*[A-Z][a-z]+$",
                "Each word in name of task must begin with an upper case letter and following by lower case letters"));
        task.setID();
    }
    
    public void callInputer() {
        inputTaskInformation();
    }
}
