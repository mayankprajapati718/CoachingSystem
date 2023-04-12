package com.example.coachingsystem.Coaching;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Coaching {
    private int id;
    @Size(min =4,message = "Enter atleast 10 characters")
    private String username;
    private String courseName;
    private LocalDate completionDate;
    private boolean done;

    @Override
    public String toString() {
        return "Coaching{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", courseName='" + courseName + '\'' +
                ", completionDate=" + completionDate +
                ", done=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Coaching(int id, String username, String courseName, LocalDate completionDate, boolean done) {
        this.id = id;
        this.username = username;
        this.courseName = courseName;
        this.completionDate = completionDate;
        this.done = done;
    }
}

