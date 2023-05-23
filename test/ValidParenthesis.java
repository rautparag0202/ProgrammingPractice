package test;

import java.util.*;

import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (Character.isLetterOrDigit(c) || c == ' ' || c == '-' || c == '+' || c == '*' || c == '/') {
                // ignore valid letters, digits, and some symbols
                continue;
            } else {
                return false; // invalid character found
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "(a+b)*[c-(d/e)]";
        String s2 = "{2*[5+(6-3)]}";
        String s3 = "(2+3)*4/[(5-2)+1]";
        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // true
        System.out.println(isValid(s3)); // false
    }
}
