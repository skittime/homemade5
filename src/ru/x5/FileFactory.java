package ru.x5;

public class FileFactory extends LogFactory {


    @Override
    public Log createLog() {
        return new FileLogger();
    }
}

