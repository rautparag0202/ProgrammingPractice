package test;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterinString {

	public static void main(String[] args) {

		String str = "Hello World";

		usingArray(str);
		usingHashMap(str);

	}
	
	

	public static void usingArray(String str) {  //space complexity is O(1) bcz of foxed length of array and Time complex - O(n)

		int[] charCount = new int[256];

		// Count the occurrence of each character in the string
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			charCount[c]++;
		}

		// Print the duplicate characters and their occurrence count
		System.out.println("Duplicate characters in solving using Array \"" + str + "\":");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 1) {
				System.out.println("'" + (char) i + "' - " + charCount[i] + " times");
			}
		}

	}


	public static void usingHashMap(String str) {  //space complexity is O(n) and Time complex - O(n)


		Map<Character, Integer> charCountMap = new HashMap<>();

		// Count the occurrence of each character in the string
		for (char c : str.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Print the duplicate characters and their occurrence count
		System.out.println("Duplicate characters in solving usinh HashMap \"" + str + "\":");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("'" + entry.getKey() + "' - " + entry.getValue() + " times");
			}
		}
	}


}

/*
The time complexity of this program is O(n), where n is the length of the input string. 
This is because we need to iterate through each character in the string exactly once to count their occurrence.

The space complexity of this program is also O(n), where n is the length of the input string. 
This is because we need to store each character in the string along with its occurrence count in the charCountMap HashMap, 
which requires space proportional to the length of the string.

 */