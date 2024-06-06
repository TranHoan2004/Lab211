/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public final class Task {

    private String requirementName,
            assignee,
            reviewer,
            date;
    private double planFrom,
            planTo;
    private int taskTypeID,
            ID;

    public Task() {

    }

    public Task(String requirementName, String assignee, String reviewer, String date, double planFrom, double planTo, int taskTypeID) {
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.taskTypeID = taskTypeID;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public Type getTaskTypeID() {
        switch (taskTypeID) {
            case 1 -> {
                return Type.Code;
            }
            case 2 -> {
                return Type.Design;
            }
            case 3 -> {
                return Type.Review;
            }
            case 4 -> {
                return Type.Test;
            }
            default ->
                throw new AssertionError();
        }
    }

    public void setTaskTypeID(int taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public double getTime() {
        return getPlanTo() - getPlanFrom();
    }

    public enum Type {
        Code, Test, Design, Review
    }

    public String display() {
        return String.format("%-15d%-15s%-15s%-15s%-15.2f%-15s%s",
                this.getID(),
                this.getRequirementName(),
                this.getTaskTypeID(),
                this.getDate(),
                this.getTime(),
                this.getAssignee(),
                this.getReviewer());
    }
}
