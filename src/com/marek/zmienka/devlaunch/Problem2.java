package com.marek.zmienka.devlaunch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

    public static void calcAvg() {
        System.out.println("#### Calc average");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <=3; i++) {

            System.out.println("Provide " + i + " number: ");
            int number = s.nextInt();
            list.add(number);
        }
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        System.out.println(sum);
        double avg = ((double) sum)/ 3;
        System.out.println("Average of " + list + " is " + avg);
    }
}
