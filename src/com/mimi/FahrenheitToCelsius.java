package com.mimi;

import java.util.Random;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        float[] temps = new float[20];
        temps[0] = 32.0f;
        for (int i = 1; i < 20; i++) {
            //temps[i] = sc.nextFloat();
            temps[i] = Math.abs(random.nextFloat()*100);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Temperature in Fahrenheit: " + temps[i] + ", temperature in Celsius: " +
                    (temps[i]-32)*(5.0/9.0));
        }
    }
}
