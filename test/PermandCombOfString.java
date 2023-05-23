package test;

import java.util.ArrayList;
import java.util.List;

/*

To find the permutation and combination of a given string, we can use the following approach:

    Permutation: A permutation of a string is an arrangement of all its characters. 
    For example, the permutations of the string "abc" are "abc", "acb", "bac", "bca", "cab", and "cba". 
    We can find the permutations of a string using recursion. The algorithm can be summarized as follows:
        Base case: If the string has only one character, return a list containing that character.
        Recursive case: For each character in the string, remove it and find the permutations of the remaining characters. 
                  Add the removed character to the beginning of each permutation found in the previous step. 
                  Return the concatenation of all permutations found in this step.

    Here's the Java code to find the permutations of a string:
 
 */

public class PermandCombOfString {
	
	
	    public static List<String> findPermutations(String s) {
	        List<String> permutations = new ArrayList<>();
	        if (s.length() == 1) {
	            permutations.add(s);
	        } else {
	            for (int i = 0; i < s.length(); i++) {
	                char ch = s.charAt(i);
	                String substring = s.substring(0, i) + s.substring(i + 1);
	                List<String> subPermutations = findPermutations(substring);
	                for (String permutation : subPermutations) {
	                    permutations.add(ch + permutation);
	                }
	            }
	        }
	        return permutations;
	    }
	}

