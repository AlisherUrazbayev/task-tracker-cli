package com.alisherurazbayev.tasktracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
//    id: A unique identifier for the task
//    description: A short description of the task
//    status: The status of the task (todo, in-progress, done)
//    createdAt: The date and time when the task was created
//    updatedAt: The date and time when the task was last updated
    private UUID id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String description) {
        //LocalDateTime now = LocalDateTime.now();
        this(description, "todo", LocalDateTime.now(), null);
    }

    public Task(String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = UUID.randomUUID();
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
