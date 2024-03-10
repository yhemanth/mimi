package com.mimi;

import java.util.Random;
import java.util.Scanner;

public class SwapAdjacentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int elems = 6;
        int[] temps = new int[elems];
        for (int i = 0; i < elems; i++) {
            temps[i] = Math.abs(random.nextInt());
            System.out.println(temps[i]);
        }

        System.out.println("Swapping----");
        for (int i = 0; i < elems; i+=2) {
            int t = temps[i];
            temps[i] = temps[i+1];
            temps[i+1] = t;
        }

        for (int i = 0; i < elems; i++) {
            System.out.println(temps[i]);
        }
    }
}
