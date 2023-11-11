package com.example.assignment1doc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name= "Story")
@Table(name= "Story")
public class Story {
    private String department;

    @Id
    private String title;

    private String content;

    public Story(String department, String title, String content) {
        this.department = department;
        this.title = title;
        this.content = content;
    }

    public Story() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
