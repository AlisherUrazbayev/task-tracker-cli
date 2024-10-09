package com.alisherurazbayev.tasktracker;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    //given_when_then
    @Test
    void testTaskCreation() {
        Task task = new Task("Test Task");
        assertNotNull(task.getId());
        assertEquals("Test Task", task.getDescription());
        assertEquals("todo", task.getStatus());
        assertNotNull(task.getCreatedAt());
        assertNull(task.getUpdatedAt());
    }

    @Test
    void testTaskStatusUpdate() {
        Task task = new Task("Test task");
        task.setStatus("in-progress");
        assertEquals("in-progress", task.getStatus());
        assertNotNull(task.getUpdatedAt());
    }

    @Test
    void testInvalidStatusUpdate() {
        Task task = new Task("Test task");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            task.setStatus("invalid-status");
        });
        assertEquals("Invalid status: invalid-status", exception.getMessage());
    }
}