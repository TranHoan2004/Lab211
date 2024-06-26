/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Expense;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Expense> list;
    private static int count;

    public Manager() {
        this.list = new ArrayList<>();
        Manager.count = 0;
    }

    public ArrayList<Expense> getList() throws Exception {        
        if (list.isEmpty()) {
            throw new Exception("List is empty, cannot be deleted");
        }
        return list;
    }

    public void setList(Expense ex) {
        ex.setId(++count);
        list.add(ex);
    }

    public void deleteExpense(int id) throws Exception {
        int index = getExpenseIndex(id);
        update(list.get(index));
        list.remove(index);
        setLastID();
    }

    private int getExpenseIndex(int id) throws Exception {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        throw new Exception("There is no expense that has this id");
    }

    private void update(Expense expense) {
        for (Expense ex : list) {
            if (ex.getId() > expense.getId()) {
                ex.setId(ex.getId() - 1);
            }
        }
    }

    private void setLastID() {
        count = 0;
        list.forEach((_item) -> {
            ++count;
        });
    }
}
