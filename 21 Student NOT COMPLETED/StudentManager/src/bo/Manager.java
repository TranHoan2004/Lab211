/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Student;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Student> sList;
    private Student student;

    public Manager() {
        this.sList = new ArrayList<>();
        this.student = new Student();
    }

    public boolean addToList(Student st) throws Exception {
        if (!isIdDuplicated(st)) {
            if (!isExisted(st)) {
                return sList.add(st);
            }
            throw new Exception("This student is existed");
        }
        throw new Exception("This id of this student is existed");
    }
    public void sort() {
        
    }
    public void update() {
        
    }
    public ArrayList<Student> getList() {
        return sList;
    }
    private void findByName(String name) throws Exception {
        for (Student student : sList) {
            if (student.getName().toUpperCase().contains(name.toUpperCase()) 
                    || student.getName().toLowerCase().contains(name.toLowerCase())) {  
                this.student = student;
            }
        }
        throw new Exception("There is no student has that name");
    }
    private boolean isExisted(Student st) throws Exception {
        for (Student student : sList) {
            if (student == st) {
                return true;
            }
        }
        return false;
    }

    private boolean isIdDuplicated(Student student) {
        for (Student st : sList) {
            if (st.getId().equals(student.getId())
                    && st.getName().equalsIgnoreCase(student.getName())) {
                return true;
            }
        }
        return false;
    }
}
