package com.marek.zmienka.devlaunch;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    Scanner s = new Scanner(System.in);

    public void run() {

        System.out.println(printOperations());
        char operation = getOperationFromUser();
        if (isOperationValid(getOperationFromUser())) {
            System.out.println("First number: ");
            int a = getNumberFromUser();
            System.out.println("Second number: ");
            int b = getNumberFromUser();
            if (operation == '+') {
                add(a, b);
            }

            if ()
        }
         else {
            System.out.println("Operation does not exist!");
            run();
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
        return (double) a/b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

//    public void start() {
//
//        System.out.println("Podaj dwie liczby");
//        Scanner s = new Scanner(System.in);
//        System.out.println("A: ");
//        int firstNumber = s.nextInt();
//        System.out.println("B: ");
//        int secondNumber = s.nextInt();
//
//
//        ArrayList<Character> availableOperations = new ArrayList<Character>();
//        availableOperations = ['+', '-', '*', '/'];
//        System.out.println("Jaką operację chcesz wykonać? \n" +
//                "+ - dodawanie\n" +
//                "- - odejmowanie\n" +
//                "* - mnożenie\n" +
//                "/ - dzielenie");
//        String operation = s.nextLine();
//        if (availableOperations.contains(operation)) {
//
//        } else {
//            System.out.println("Niepoprawny wybór, spróbj ponownie wskazać operacje ");
//        }
//
//    }
}
