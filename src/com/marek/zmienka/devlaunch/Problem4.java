package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Problem4 {


    public static void drawTriangle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Height of triangle: ");
        int height = s.nextInt();
        if (height <= 0) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            multiply("*", height);
        }
    }

    public static void multiply(String string, int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            stringBuilder.append(string);
            System.out.println(stringBuilder.toString());
        }
    }
}
