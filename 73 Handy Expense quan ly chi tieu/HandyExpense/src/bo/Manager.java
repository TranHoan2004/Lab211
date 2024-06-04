/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Expense;
import java.util.ArrayList;
import java.util.Iterator;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private ArrayList<Expense> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Expense> getList() {
        return list;
    }

    public boolean addExpense(Expense ex) {
        list.add(ex); 
        return true;
    }

    public boolean deleteExpense(int id) {
        Iterator<Expense> iterator = list.iterator();
        while (iterator.hasNext()) {
            Expense ex = iterator.next();
            if (Validation.checkIdExist(id, ex.getId())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
