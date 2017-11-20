package edu.mum.domain;

import java.io.Serializable;
import java.sql.Date;


public class Task implements Serializable{
    private String id;
    private String name;
    private Date due;
    private String category;
    private String status;

    public Task(String name, Date due, String category, String status) {
        this.name = name;
        this.due = due;
        this.category = category;
        this.status = status;
    }

    public Task() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDue(Date due) {
        this.due = due;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Date getDue() {
        return due;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }
}
