package com.mimi;

import java.util.Scanner;

public class Surname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "Lala Mohendar Amarnath";
        input = input.trim(); // remove any trailing whitespace characters
        // get last word using substring and lastIndexOf
        int lastWhiteSpace = input.lastIndexOf(' ');
        if (lastWhiteSpace == -1) {
            System.out.println("Name: " + input); // only one word.
        } else {
            String surname = input.substring(lastWhiteSpace);
            String restOfName = input.substring(0, lastWhiteSpace);
            System.out.println("Modified name: " + surname + " " + restOfName);
        }

    }
}