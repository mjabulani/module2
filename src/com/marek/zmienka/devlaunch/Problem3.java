package com.marek.zmienka.devlaunch;

import java.util.Scanner;
import java.util.TreeSet;

public class Problem3 {

    public static void findMin() {
        Scanner s = new Scanner(System.in);
        System.out.println("#### Find min from 3 given number");
        TreeSet<Integer> list = new TreeSet<Integer>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Provide " + i + " number:");
            int number = s.nextInt();
            list.add(number);
        }
        System.out.println("Min number is: " + list.first());

    }
}
