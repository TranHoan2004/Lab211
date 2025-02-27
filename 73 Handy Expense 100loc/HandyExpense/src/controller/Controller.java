/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.ExpenseManager;
import bo.FileManager;
import bo.Input;
import entity.Expense;
import utils.Validation;

import java.util.List;

/**
 * @author ADMIN
 */
public class Controller {

    private ExpenseManager manager;
    private final FileManager file;

    public Controller() {
        this.file = new FileManager();
        this.manager = new ExpenseManager();
    }

    public void addExpense() throws Exception {
        manager = new ExpenseManager(file.getMaxID());
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

    public double getTotal() {
        return manager.calcSummaryOfExpense();
    }

    public List<Expense> getList() throws Exception {
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
