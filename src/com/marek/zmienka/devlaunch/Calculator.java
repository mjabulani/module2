package com.marek.zmienka.devlaunch;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    Scanner s = new Scanner(System.in);

    public void run() {

        start();
    }

    private void start() {
        Scanner s = new Scanner(System.in);
        System.out.println(printOperations());
        char operation = getOperationFromUser();
        if (isOperationValid(operation)) {
            System.out.println("A: ");
            int a = getNumberFromUser();
            System.out.println("B: ");
            int b = getNumberFromUser();
            switch (operation) {
                case '+':
                    System.out.println("A + B = " + add(a, b));
                    break;
                case '-':
                    System.out.println("A - B = " + subtract(a, b));
                    break;
                case '/':
                    if (a != 0 && b != 0) {
                        System.out.println("A / B = " + divide(a, b));
                        break;
                    }
                case '*':
                    System.out.println("A * B = " + multiply(a, b));
                    break;
            }
            System.out.println("Do you want to calculate sth else?");
            String quit = s.nextLine();
            if (quit.equalsIgnoreCase("y")) {
                start();
            }
        } else {
            System.out.println("Wrong choice! Start over again!");
            start();
        }
    }

    private String printOperations() {
        return "+ - add\n" +
                "- - substract\n" +
                "/ - divide\n" +
                "* - multiply";
    }

    private char getOperationFromUser() {
        System.out.println("Select operation: ");
        return s.nextLine().charAt(0);
    }

    private boolean isOperationValid(char operation) {
        ArrayList<Character> availableOperations = new ArrayList<Character>();
        availableOperations.add('+');
        availableOperations.add('-');
        availableOperations.add('*');
        availableOperations.add('/');

        return availableOperations.contains(operation);
    }

    private int getNumberFromUser() {
        return s.nextInt();
    }

    private boolean isMoreThan0(int number) {
        return (number > 0);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private double divide(int a, int b) {
        return (double) a / b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}