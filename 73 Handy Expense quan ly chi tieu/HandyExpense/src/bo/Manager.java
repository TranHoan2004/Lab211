/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Expense;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Expense> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Expense> getList() {
        return list;
    }

    public void addExpense(Expense ex) {
        list.add(ex);
    }

    public void deleteExpense(int id) {
        Iterator<Expense> iterator = list.iterator();
        while (iterator.hasNext()) {
            Expense ex = iterator.next();
            if (ex.getId() == id) {
                iterator.remove();
            } else if (ex.getId() > id) {
                ex.setId(ex.getId() - 1);
            }
        }
    }
}
