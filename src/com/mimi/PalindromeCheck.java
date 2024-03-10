package com.mimi;

public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "belevele";

        int isPalindrome = 1;
        for (int i = 0,j=word.length()-1; i <= word.length() / 2; i++,j--) {
            if (word.charAt(i)!=word.charAt(j)) {
                isPalindrome = 0;
                break;
            }
        }
        if (isPalindrome==1) {
            System.out.println("Word " + word + " is a palindrome.");
        }
    }
}
