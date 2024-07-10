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

    private Manager manager;
    private final FileManager file;

    public Controller() {
        this.file = new FileManager();
        this.manager = new Manager();
    }

    public void addExpense() throws Exception {
        manager = new Manager(file.getMaxID());
        openFile();
        Input input = new Input();
        Expense expense = input.getExpense();
        manager.addToList(expense);
        updateFile();
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

    public ArrayList<Expense> getList() throws Exception {
        openFile();
        return manager.getList();
    }

    private void updateFile() throws Exception {
        file.clear();
        for (Expense expense : manager.getList()) {
            file.createText(expense.toString());
        }
    }

    private void openFile() throws Exception {
        manager.setList(file.readFromFile());
    }
}
