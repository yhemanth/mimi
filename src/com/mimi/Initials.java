package com.mimi;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "N  Kumar Dey";
        input = input.trim(); // remove any trailing whitespace characters
        int start = 0; // where to pick next word from.
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                String word = input.substring(start, i);
                start = i;
                word = word.trim();
                if (word.length()>0)
                    System.out.print(word.charAt(0));
            }
        }
        String lastWord = input.substring(start);
        lastWord = lastWord.trim();
        if (lastWord.length()>0)
            System.out.print(lastWord.charAt(0));
    }
}
