package ru.x5;

public class DbFactory extends LogFactory {

    @Override
    public Log createLog() {
        return new DbLogger();
    }
}

