package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        Calculator calc = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Which program you want to run? Press 0 to see your options.");
        int problem = s.nextInt();
        switch (problem) {
            case 0:
                System.out.println(availableOptions());
                startProgram();
                break;
            case 1:
                Problem1.compareNumber();
                break;
            case 2:
                Problem2.calcAvg();
                break;
            case 3:
                Problem3.findMin();
                break;
            case 4:
                Problem4.drawTriangle();
                break;
            case 5:
                Problem5.printAllNumbers();
                break;
            case 6:
                Problem6.sumNumbers();
                break;
            case 7:
                Problem7.run();
                break;
            case 8:
                Problem8.run();
                break;
            case 9:
                Problem9.run();
                break;
            case 10:
                calc.run();

        }
    }

    public static String availableOptions() {
        return "0 - list of programs\n" +
                "1 - compare number\n" +
                "2 - calculate average of 3 given numbers\n" +
                "3 - find min value\n" +
                "4 - draw triangle\n" +
                "5 - print all numbers\n" +
                "6 - sum all numbers\n" +
                "7 - fibonacci\n" +
                "8 - calculate factorial\n" +
                "9 - palindrom tester\n" +
                "10 - calculator";
    }
}
