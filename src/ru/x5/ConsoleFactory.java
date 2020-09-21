package ru.x5;

public class ConsoleFactory extends LogFactory {


    @Override
    public Log createLog() {
        return new ConsoleLogger();
    }
}
