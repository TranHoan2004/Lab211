/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Expense;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {
    private final Manager manager;
    public ManagerController() {
        this.manager = new Manager();
    }
    public void addExpense() throws Exception {
        Input input = new Input();
        Expense expense = input.getExpense();
        manager.setList(expense);
    }    
    public void delete() throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("List is empty, cannot be deleted");
        }
        int id = Validation.getInt("Enter ID: ", "Only positive numbers!", "Out of range!", 1, manager.getList().size());
        manager.deleteExpense(id);
    }
    public ArrayList<Expense> getList() {
        return manager.getList();
    }
}
