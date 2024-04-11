package com.marek.zmienka.devlaunch;
import java.util.Scanner;

public class Problem6 {

    public static void sumNumbers() {
        System.out.println("#### Sum numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("how many mumbers u want to sum?");
        int sum = 0;
        int length = s.nextInt();
        if (length < 0) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            for (int i = 1; i <= length; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
