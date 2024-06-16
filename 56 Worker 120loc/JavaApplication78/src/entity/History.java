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
public final class History {

    private Worker worker;
    private Status status;
    private LocalDate date;

    public enum Status {
        UP, DOWN;
    }

    public History(Status status, Worker worker) {
        this.worker = worker;
        this.status = status;
        setDate();
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
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
        return String.format("%-15s%-15s%-15d%-15.2f%-15s%s", getWorker().getId(), getWorker().getName(), getWorker().getAge(), getWorker().getSalary(), this.getStatus(), this.getDate());
    }

}
