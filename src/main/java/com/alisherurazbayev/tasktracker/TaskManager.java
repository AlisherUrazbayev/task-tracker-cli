package com.alisherurazbayev.tasktracker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskManager {

    List<Task> taskList = new ArrayList<>();

    public void addTask(String desc) {
        Task task = new Task(desc);
        taskList.add(task);
    }

    public void removeTask(int id) {
        for(Task task : taskList) {
            if(task.getId() == id) {
                taskList.remove(task);
            }
        }
    }

    public Task getTask(int id) {
        for(Task task : taskList) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public List<Task> getTasks() {
        return taskList;
    }


}
