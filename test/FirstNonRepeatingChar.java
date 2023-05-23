package test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	public static Character firstNonRepeatingChar(char[] arr) {
	    // Create a hash table to keep track of the frequency of each character.
	    Map<Character, Integer> freq = new HashMap<>();
	    for (char c : arr) {
	        freq.put(c, freq.getOrDefault(c, 0) + 1);
	    }
	    // Traverse the array again from left to right.
	    for (char c : arr) {
	        // If the frequency is 1, return the character as the first non-repeating character.
	        if (freq.get(c) == 1) {
	            return c;
	        }
	    }
	    // If no character has a frequency of 1, return null to indicate that no non-repeating character exists in the array.
	    return null;
	}
	
	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'a', 'd', 'c', 'b'};
		Character result = firstNonRepeatingChar(arr);
		System.out.println(result); // Output: 'd'
	}

}
