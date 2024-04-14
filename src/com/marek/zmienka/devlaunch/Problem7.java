package com.marek.zmienka.devlaunch;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {


    public static void run() {

        Scanner s = new Scanner(System.in);
        System.out.println("Provide treshold number");
        System.out.println(printFibonnaci(s.nextInt()));
    }

    public static ArrayList<Integer> printFibonnaci(int length) {
        int a = 0;
        int b = 1;
        int c = 0;
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
        if (length < 0) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            if (length == 1) {
                fibonacciList.add(1);
            } else {
                fibonacciList.add(0);
                fibonacciList.add(1);
                for (int i = 0; i <= length; i++) {
                    c = a + b;
                    fibonacciList.add(c);
                    a = b;
                    b = c;
                }
            }
        }
        return fibonacciList;
    }
}


