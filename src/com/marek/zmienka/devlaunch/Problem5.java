package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Problem5 {


    public static void printAllNumbers() {
        System.out.println("#### Print numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("how many mumbers u want to print?");
        int length = s.nextInt();
        if (length < 0) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            for (int i = 1; i <= length; i++) {
                System.out.println(i);
            }
        }
    }
}
