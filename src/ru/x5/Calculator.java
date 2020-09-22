package ru.x5;

import java.util.Scanner;

public class Calculator implements Log {

    @Override
    public void log(String message) {

    }

    public int getResult() {
        return result;
    }

    static Scanner scanner = new Scanner(System.in);
    int result;

    Calculator() {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public char getOperation() {
        System.out.println("Введите операцию(после знака операции может быть любой текст(он не важен)):");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}