package com.alisherurazbayev.tasktracker;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TaskCLIImpl implements TaskCLI{

    private static final Scanner scanner = new Scanner(System.in);
    private TaskManager taskManager;
    private String command;

    public TaskCLIImpl() {
        this.taskManager = new TaskManager();
    }

    //Run
    @Override
    public void run() {
        System.out.println("Task Manager App");

        while(!Objects.equals(command, "-1")) {
            System.out.print("Input: ");
            setCommand(scanner.nextLine());
            command = getCommand();
            handleCommand(command);
        }
    }

    @Override
    public void handleCommand(String command) {
        switch (command) {
            case "exit":
                setCommand("-1");
                break;
            case "/info":
                showMenu();
                break;
            case "add":
                System.out.println(command);
                String description = "A";
                taskManager.addTask(description);
                System.out.println("added");
                break;
            case "list":
                showTasks(taskManager.getTasks());
                break;
            default:
                System.out.println("No such command found.");
                break;
        }
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    private void showMenu() {
        String menu = "add - add task description\n" +
                "update - update id update description\n" +
                "delete - delete id\n" +
                "list - list all tasks\n" +
                "future commands\n";
        System.out.printf("%s", menu);
    }

    private void showTasks(List<Task> taskList) {
        for(Task task : taskList) {
            System.out.println(task.getId() + ")" + task.getDescription() + " status: " + task.getStatus());
        }
    }
}
