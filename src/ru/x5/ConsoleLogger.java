package ru.x5;

public class ConsoleLogger implements Log {
    @Override
    public void log(String message) {
        System.out.println("Log into console: " + message);
    }
}
