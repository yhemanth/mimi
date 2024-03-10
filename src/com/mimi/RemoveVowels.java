package com.mimi;

public class RemoveVowels {
    public static void main(String[] args) {
        String input ="Remove all vowels from this.";
        char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        for (int i = 0; i < input.length(); i++) {
            int foundVowel = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (input.charAt(i)==vowels[j]) {
                    foundVowel = 1;
                    break;
                }
            }
            if (foundVowel != 1) {
                System.out.print(input.charAt(i));
            }
        }
        System.out.println();
    }
}
