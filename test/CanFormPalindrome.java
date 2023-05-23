package test;


/*
 	Create a HashSet to keep track of the characters in the input string.
    Iterate over each character in the input string.
    If the character is not in the HashSet, add it.
    If the character is already in the HashSet, remove it.
    If the length of the HashSet is 0 or 1, the characters can be rearranged to form a palindrome.

 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CanFormPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of characters: ");
        String input = scanner.nextLine();
        boolean canFormPalindrome = canFormPalindrome(input);
        if (canFormPalindrome) {
            System.out.println("The given characters can form a palindrome.");
        } else {
            System.out.println("The given characters cannot form a palindrome.");
        }
    }

    public static boolean canFormPalindrome(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        System.out.println(set.size());
        return set.size() <= 1;
    }
}

