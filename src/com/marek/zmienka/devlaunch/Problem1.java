package com.marek.zmienka.devlaunch;
import java.util.Scanner;

public class Problem1 {


    public static void compareNumber() {

        System.out.println("##### Check whether given number is bigger than 0");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide number");
        int number = s.nextInt();
        if (number > 0) {
            System.out.println(number + " is bigger than 0.");
        } else if (number < 0) {
            System.out.println(number + " is less than 0.");
        } else {
            System.out.println(number + " is equal to 0.");
        }
    }
}
