package ru.x5;


public class Main {

    public static void main(String[] args) {
        LogFactory factory, factory1;
        factory = new ConsoleFactory();
        factory1 = new DbFactory();
        Log log = factory.createLog();
        Log log1 = factory1.createLog();
        log.log(" ебать");
        log1.log("еще ебать");
    }
}
