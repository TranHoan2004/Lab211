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

    private Expense ex = null;
    private int count = 0;

    public Expense getExpense() {
        return this.ex;
    }

    public void createExpense() {
        ex = new Expense();
        ex.setId(++count);
        ex.setDate(Validation.checkInputDate("Enter Date: "));
        ex.setMoney(Validation.getDouble("Enter Amount: ", "Only real number!", 0, Double.MAX_VALUE));
        ex.setContent(Validation.getStringByRegex("Enter Content: ", "[A-Za-z ]+", "Name of expense only!"));
    }
}
