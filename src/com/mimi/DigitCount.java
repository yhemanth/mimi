package com.mimi;

import java.util.Random;

public class DigitCount {
    public static void main(String[] args) {
        int[] digitCounts = new int[10];
        Random r = new Random();
        long num = r.nextLong();
        System.out.println("Number is " + num);
        while (num > 0) {
            int d = (int) (num % 10);
            digitCounts[d] += 1;
            num = num / 10;
        }
        for (int i = 0; i < digitCounts.length; i++) {
            if (digitCounts[i]>0) {
                System.out.println("Digit " + i + " appears " + digitCounts[i] + " times.");
            }
        }
    }
}
