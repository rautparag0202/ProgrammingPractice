package test;

import java.util.HashMap;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String str = "hello world";
        char firstNonRepeated = findFirstNonRepeated(str);
        System.out.println("The first non-repeated character in \"" + str + "\" is: " + firstNonRepeated);
    }
    
    public static char findFirstNonRepeated(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }
}

/*

The time complexity of the findFirstNonRepeated method in the previous example is O(n),
where n is the length of the input string, because it iterates over the string twice. 
The space complexity is also O(n), because it uses a HashMap to store the count of each character in the string.
So, the time and space complexity of the findFirstNonRepeated method can be summarized in one line as:

Time complexity: O(n), Space complexity: O(n)

*/