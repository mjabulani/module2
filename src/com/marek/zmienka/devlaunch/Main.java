package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    startProgram();

    }

    public static void startProgram() {
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

        }

    }

    public static String availableOptions() {
        return "0 - list of programs\n" +
                "1 - compare number\n" +
                "2 - asd";
    }
}
