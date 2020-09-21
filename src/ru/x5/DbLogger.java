package ru.x5;

public class DbLogger implements Log{
    @Override
    public void log(String message) {
        System.out.println("Log into DataBase: " + message);
    }
}
