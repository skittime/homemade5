package ru.x5;

public class FileLogger implements Log{
    @Override
    public void log(String message) {
        System.out.println("Log into file: " + message);
    }
}
