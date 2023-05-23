package test;

public class DuplicateWordRemover {

	public static void main(String[] args) {
		String str = "This is a sample string with some duplicate words. This is a duplicate string with duplicate words.";
		String result = removeDuplicateWords(str);
		System.out.println(result);
	}


	public static String removeDuplicateWords(String str) {
		String[] words = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals("")) {
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equals(words[j])) {
						words[j] = "";
					}
				}
				sb.append(words[i]).append(" ");
			}
		}
		return sb.toString().trim();
	}
}

/*

he time complexity of the removeDuplicateWords method in the above program is O(n^2)
 because it contains two nested loops - one to iterate over each word in the input string, 
 and another to compare each word with every other word in the string.

The space complexity of the program is O(n) because it uses a StringBuilder object to store the output string, 
and the size of the StringBuilder object is proportional to the size of the input string. 
Additionally,the program creates a String array to store the words in the input string, which also contributes to the space complexity.

 ******************************************************************************************************************************


public static String removeDuplicateWords(String str) {

    String[] words = str.split("\\s+");

    Set<String> uniqueWords = new HashSet<>();

    StringBuilder sb = new StringBuilder();

    for (String word : words) {
        if (!word.equals("") && uniqueWords.add(word)) {
            sb.append(word).append(" ");
        }
    }
    return sb.toString().trim();
}


Space and time - O(n)
 ******************************************************************************************************************************


 */


