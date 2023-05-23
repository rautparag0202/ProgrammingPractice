package test;

import java.util.HashSet;

public class FirstRepeatedCharInString {
    public static void main(String[] args) {
        String str = "hello world";
        char firstRepeated = findFirstRepeated(str);
        System.out.println("The first repeated character in \"" + str + "\" is: " + firstRepeated);
    }
    
    public static char findFirstRepeated(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return '\0';
    }
}

