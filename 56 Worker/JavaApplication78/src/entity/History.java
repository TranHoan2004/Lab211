/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public final class History extends Worker {

    private Status status;
    private LocalDate date;

    public enum Status {
        UP, DOWN;

        public static Status getStatusByInt(int type) {
            switch (type) {
                case 2 -> {
                    return UP;
                }
                case 3 -> {
                    return DOWN;
                }
                default ->
                    throw new AssertionError();
            }
        }
    }

    public History() {
    }

    public History(Status status, String id, String name, String workLocation, int age, double salary) {
        super(id, name, workLocation, age, salary);
        this.status = status;
        setDate();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        LocalDate date1 = LocalDate.now();
        this.date = date1;
    }

    public String displaySalaryInformation() {
        return String.format("%-15s%-15s%-15d%-15.2f%-15s%s", this.getId(), this.getName(), this.getAge(), this.getSalary(), this.getStatus(), this.getDate());
    }

}
