package com.alisherurazbayev.tasktracker;

public class Main {

    public static void main(String[] args) {
        TaskCLI cli = new TaskCLIImpl();
        cli.run();
    }
}
