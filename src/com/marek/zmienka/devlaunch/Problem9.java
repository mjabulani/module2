package com.marek.zmienka.devlaunch;

import java.util.Scanner;

public class Problem9 {

    public static void run() {

        System.out.println("Check if string is a palindrome");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " || " + reverseString(word) + " - ITS A PALINDROME");
    }   else {
            System.out.println(word + " || " + reverseString(word) + " - ITS NOT A PALINDROME");
        }

    }

    public static String reverseString(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return  sb.toString();
    }

    public static boolean isPalindrome(String word) {
        return (word.equalsIgnoreCase(reverseString(word)));
    }
}
