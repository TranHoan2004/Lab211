/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Course.CourseName;
import entity.Report;
import entity.Students;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Students> list;
    private Students student;

    public Manager() {
        this.list = new ArrayList<>();
        this.student = new Students();
    }

    public void addStudents(Students student) throws Exception {
        if (isExisted(student)) {
            throw new Exception("This student is already existed");
        }
        list.add(student);
    }

    public ArrayList<Students> findSortedListOfStudents(String name) {
        ArrayList<Students> result = new ArrayList<>();
        for (Students student : list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())
                    || student.getName().toUpperCase().contains(name.toUpperCase())) {
                result.add(student);
            }
        }
        return sort(result);
    }

    public boolean updateList(boolean type, Students std) {
        for (Students student : list) {
            if (student.getId().equalsIgnoreCase(this.student.getId())) {
                if (type) {
                    int index = list.indexOf(student);
                    list.set(index, std);
                    return true;
                } else {
                    return list.remove(student);
                }
            }
        }
        return false;
    }

    public boolean isIdOfStudentExisted(String id) {
        for (Students student : list) {
            if (student.getId().equalsIgnoreCase(id)) {
                this.student = student;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Report> getReport() {
        ArrayList<Report> report = new ArrayList<>();
        for (Students student : list) {
            for (CourseName course : student.getCourse()) {
                report.add(new Report(student, course));
            }
        }
        return report;
    }

    private ArrayList<Students> sort(ArrayList<Students> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getName().compareTo(list.get(j + 1).getName()) > 0) {
                    Students temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    private boolean isExisted(Students student) {
        for (Students std : list) {
            if (std == student) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Students> getList() {
        return list;
    }
}
