package com.mimi;

public class RecurringPatterns {

    public static void main(String[] args) {
	    //printLetters(3);
        //printNumbers(3);
        printAlphabetDiamond(4);
    }

    private static void printLetters(int n) {

        for (int i=1; i<=n; i++) {
            for (int j=i; j < n; j++)
                System.out.print(' ');
            for (int j=1; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--) {
            for (int j=n; j > i; j--)
                System.out.print(' ');
            for (int j=1; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.println();
        }
    }

    private static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=i; j < n; j++)
                System.out.print(' ');
            for (int j=1;j<=i;j++)
                System.out.print(j);
            for (int j=i-1;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j=n; j > i; j--)
                System.out.print(' ');
            for (int j=1;j<=i;j++)
                System.out.print(j);
            for (int j=i-1;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void printAlphabetDiamond(int n) {
        if (n < 1 || n > 26) {
            System.out.println("n should be between 1 and 26.");
            return;
        }

        // Upper half including the middle line
        for (int i = 0; i < n; i++) {
            // Print left side of the pyramid
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('a' + j));
            }
            // Print spaces in the middle
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            // Print right side of the pyramid, avoid double printing the middle character
            for (int j = n - i - 1; j >= 0; j--) {
                if (i == 0 && j == n - 1) {
                    // Skip the last character for the top row to avoid duplication
                    continue;
                }
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // Print left side of the pyramid
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('a' + j));
            }
            // Print spaces in the middle
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            // Print right side of the pyramid, avoid double printing the middle character
            for (int j = n - i - 1; j >= 0; j--) {
                if (i == 0 && j == n - 1) {
                    // Skip the last character to avoid duplication
                    continue;
                }
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }
    }
}
