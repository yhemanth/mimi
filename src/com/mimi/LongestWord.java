package com.mimi;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "Sourav Ganguly is the president of BCCI.";
        input = input.trim(); // remove any trailing whitespace characters
        int start = 0; // where to pick next word from.
        String largestWord = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                String word = input.substring(start, i);
                start = i;
                word = word.trim();
                if (word.length() > largestWord.length()) {
                    largestWord = word;
                }
            }
        }
        //last word
        String word = input.substring(start);
        word = word.trim();
        if (word.length() > largestWord.length()) {
            largestWord = word;
        }
        System.out.println("Largest word: " + largestWord + ", largestWordLength: " + largestWord.length());
    }
}