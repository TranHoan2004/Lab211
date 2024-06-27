/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.FileManager;
import bo.Input;
import bo.Manager;
import entity.Expense;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Manager manager;
    private final FileManager file;

    public Controller() {
        this.file = new FileManager();
        this.manager = new Manager(file.getMaxID());
    }

    public void addExpense() throws Exception {
        openFile();
        Input input = new Input();
        Expense expense = input.getExpense();
        manager.setList(expense);
        file.createText(expense.toString());
    }

    public void delete() throws Exception {
        openFile();
        if (manager.getList().isEmpty()) { //chinh sua 
            throw new Exception("List is empty, cannot be deleted");
        }
        int id = Validation.getInt("Enter ID: ", "Only one positive number!", "Out of range!", 1, manager.getList().size());
        manager.deleteExpense(id);
        updateFile();
    }

    public int getTotal() {
        return manager.calcSummaryOfExpense();
    }

    private void updateFile() throws Exception {
        file.clear();
        for (Expense expense : manager.getList()) {
            file.createText(expense.toString());
        }
    }

    public ArrayList<Expense> getList() throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("List is empty, cannot be deleted");
        }
        updateFile();
        return manager.getList();
    }

    public void openFile() throws Exception {
        file.openFile();
        manager.setList(file.readFromFile()); 
    }
}
