package ru.x5;


import java.util.Scanner;

public class Main {
    private static int input;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        do {
            String message;
            Calculator calculator = new Calculator();
            message = String.valueOf(calculator.getResult());
            nextLine();
            LogFactory factory, factory1, factory2;
            factory = new ConsoleFactory();
            factory1 = new DbFactory();
            factory2 = new FileFactory();
            Log log = factory.createLog();
            Log log1 = factory1.createLog();
            Log log2 = factory2.createLog();
            log.log(message);
            log1.log(message);
            log2.log(message);
            nextLine();
            menuSelect();

        } while (input != 0);
        {
            System.out.println("Выходим....");

        }
    }

    private static void menuSelect() {
        System.out.println("Введите 1 для продожения или 0 для выхода");
        input = scanner.nextInt();
    }

    private static void nextLine() {
        System.out.println(" ");
    }
}
