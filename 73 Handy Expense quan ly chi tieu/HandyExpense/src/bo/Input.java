/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Expense;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Expense expense;

    public Input() {
        this.expense = new Expense();
    }

    public Expense getExpense() {
        expense.setDate(Validation.getDate("Enter Date: "));
        expense.setMoney(Validation.getDouble("Enter Amount: ", "Only real number!", 0, Double.MAX_VALUE));
        expense.setContent(Validation.getStringByRegex("Enter Content: ", "[A-Za-z0-9]+", "Name of expense only!"));
        return expense;
    }
}
