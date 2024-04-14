package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Problem8 {


    public static void run() {
        System.out.println("Program caluclates factorial of given integer");
        Scanner s = new Scanner(System.in);
        System.out.println("Pass the number: ");
        int number = s.nextInt();
        System.out.println(number + "! = " + calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        if (number > 0) {
            int temp = 1;
            for (int i = 1; i <= number; i++) {

                temp = temp * i;
            }
            return temp;
        } else {
            throw new IllegalArgumentException("Wrong number");
        }
    }
}
