/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Report;
import entity.Students;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Manager {
    private final List<Students> list;
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

    public List<Students> findSortedListOfStudents(String name) {
        ArrayList<Students> result = new ArrayList<>();
//        for (Students student : list) {
//            if (student.getName().toLowerCase().contains(name.toLowerCase())
//                || student.getName().toUpperCase().contains(name.toUpperCase())) {
//                result.add(student);
//            }
//        }
        // doan code tren co the thay the bang doan code duoi
        list
                .stream()
                .filter(st -> st.getName().toLowerCase().contains(name.toLowerCase()) || st.getName().toUpperCase().contains(name.toUpperCase()))
                .forEach(result::add);
        return sort(result);
    }

    public void updateList(boolean type, Students std) throws Exception {
//        for (Students student : list) {
//            if (student.getId().equalsIgnoreCase(this.student.getId())) {
//                if (type) {
//                    int index = list.indexOf(student);
//                    list.set(index, std);
//                    return true;
//                } else {
//                    return list.remove(student);
//                }
//            }
//        }
//        return false;
        // doan code tren co the thay the bang doan code duoi
        Students st1 = list.stream()
                .filter(st -> st.getId().equalsIgnoreCase(this.student.getId()))
                .findAny().orElseThrow(() -> new Exception("This student is not existing"));
        // cap nhat st1 thi hoan toan co the cap nhat doi tuong do trong list
        if (type) {
            list.remove(st1);
        } else {
            st1.setCourse(std.getCourse());
            st1.setId(std.getId());
            st1.setName(std.getName());
            st1.setSemester(std.getSemester());
        }
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

    public List<Report> getReport() {
        ArrayList<Report> report = new ArrayList<>();
//        for (Students student : list) {
//            for (CourseName course : student.getCourse()) {
//                report.add(new Report(student, course));
//            }
//        }
        // co the thay the doan code tren bang doan code duoi
        for (Students students : list) {
            students.getCourse().stream().map(course -> new Report(students, course)).forEach(report::add);
        }
        return report;
    }

    private List<Students> sort(ArrayList<Students> list) {
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
//        for (Students std : list) {
//            if (std == student) {
//                return true;
//            }
//        }
//        return false;
        return list.stream().anyMatch(std -> std == student);
    }

    public List<Students> getList() {
        return new ArrayList<>(list); // tao 1 ban sao de dam bao tinh toan ven du lieu
    }
}
