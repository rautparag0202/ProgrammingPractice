package test;

import java.util.Stack;

public class RemoveAdjacentDuplicatesFromString {

	public static String removeDuplicates(String s) {
	    Stack<Character> stack = new Stack<>();
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (!stack.isEmpty() && stack.peek() == c) {
	            stack.pop();
	        } else {
	            stack.push(c);
	        }
	    }
	    StringBuilder sb = new StringBuilder();
	    while (!stack.isEmpty()) {
	        sb.append(stack.pop());
	    }
	    return sb.reverse().toString();
	}
   public static void main(String[] args) {
	   System.out.println(removeDuplicates("aabbccdabcd"));
}
}


//Time and Space  - O(n)
