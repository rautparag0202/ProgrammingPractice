package test;

import java.util.HashSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "hello world";
        String result = removeDuplicates(str);
        System.out.println("After removing duplicates, the string is: " + result);
    }
    
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

