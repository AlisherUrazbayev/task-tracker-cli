package com.alisherurazbayev.tasktracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {
//    id: A unique identifier for the task
//    description: A short description of the task
//    status: The status of the task (todo, in-progress, done)
//    createdAt: The date and time when the task was created
//    updatedAt: The date and time when the task was last updated
    private static int idIncrementor = 1;
    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String description) {
        //LocalDateTime now = LocalDateTime.now();
        this(description, "todo", LocalDateTime.now(), null);
    }

    public Task(String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = idIncrementor++;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(!Objects.equals(status, "todo") && !Objects.equals(status, "in-progress") && !Objects.equals(status, "done")) {
            throw new IllegalArgumentException("Invalid status: invalid-status");
        }
        this.status = status;
        update();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void update() {
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
