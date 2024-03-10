package com.mimi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "This is  a test string.";
        input = input.trim(); // remove any leading and trailing whitespace characters
        int nWords = 0;
        int nLetters = 0;
        int start = 0; // from where to take the next word.
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                String word = input.substring(start, i);
                start = i; // next substring is from here.
                word = word.trim();
                if (word.length()>0)
                    nWords++;
                nLetters += word.length();
            }
        }
        // Take care of last word
        String lastWord = input.substring(start);
        lastWord = lastWord.trim();
        if (lastWord.length()>0)
            nWords++;
        nLetters += lastWord.length();
        System.out.println("Number of words: " + nWords);
        System.out.println("Number of letters: " + nLetters);
    }
}
