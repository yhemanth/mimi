package com.mimi;

public class BlueWithRed {
    public static void main(String[] args) {
        String input = "Blue bottle in a Blue bag lying on a Blue carpet.";
        input = input.trim();
        String output = "";
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                String word = input.substring(start, i);
                start = i;
                word = word.trim();
                if (word.length()>0) {
                    if (word.equals("Blue")) {
                        word = "Red";
                    }
                    output = output.concat(word).concat(" ");
                }
            }
        }
        String word = input.substring(start);
        word = word.trim();
        if (word.length()>0) {
            if (word.equals("Blue")) {
                word = "Red";
            }
            output = output.concat(word).concat(" ");
        }
        System.out.println(output);
    }
}
