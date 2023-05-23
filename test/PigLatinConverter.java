package test;


public class PigLatinConverter {
	public static void main(String[] args) {
		String str = "Hello world";
		String[] words = str.split(" ");
		String pigLatin = "";
		for (String word : words) {
			pigLatin += word.substring(1) + word.charAt(0) + "ay ";
		}
		System.out.println("Original string: " + str);
		System.out.println("Pig Latin string: " + pigLatin.trim());
	}
}


/*
 

Original string: Hello world
Pig Latin string: elloHay orldway

In this program, we first split the input string into individual words using the split() method. 
We then loop through each word in the input string and apply the pig latin transformation, 
which involves moving the first letter of the word to the end of the word and appending "ay" to the end. We then append the transformed word to the pigLatin string.

Finally, we print out both the original input string and the pig latin string.
The time complexity of this program is O(n), where n is the length of the input string. 
This is because we need to loop through each word in the input string once.
The space complexity of this program is also O(n), 
where n is the length of the input string. 
This is because we create a new string to store the pig latin transformation of each word in the input string.

 */