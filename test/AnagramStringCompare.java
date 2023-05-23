package test;

// take two strings and convert in lowecase
// create one integer array of 256 size
// coount frequ for each string count[s1[i]++]
// lop through count array if fre of count[i] != 0 then its not anagram
		

public class AnagramStringCompare {

		   public static boolean areAnagrams(String str1, String str2) {
		      // Convert both strings to lowercase and remove spaces and punctuation
		      str1 = str1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		      str2 = str2.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		      
		      // If the lengths of the two strings are different, they cannot be anagrams
		      if (str1.length() != str2.length()) {
		         return false;
		      }
		      
		      // Initialize an array to store the character count of each character in both strings
		      int[] charCount = new int[256];
		      
		      // Increment the character count for each character in the first string
		      for (int i = 0; i < str1.length(); i++) {
		         charCount[str1.charAt(i)]++;
		      }
		      
		      // Decrement the character count for each character in the second string
		      for (int i = 0; i < str2.length(); i++) {
		         charCount[str2.charAt(i)]--;
		      }
		      
		      // If the character count for each character is 0, then the strings are anagrams
		      for (int i = 0; i < charCount.length; i++) {
		         if (charCount[i] != 0) {
		            return false;
		         }
		      }
		      
		      return true;
		   }
		   
		   public static void main(String[] args) {
		      String str1 = "rail safety";
		      String str2 = "fairy tales";
		      
		      if (areAnagrams(str1, str2)) {
		         System.out.println(str1 + " and " + str2 + " are anagrams.");
		      } else {
		         System.out.println(str1 + " and " + str2 + " are not anagrams.");
		      }
		   }
		}




/*
import java.util.Arrays;

public class AnagramChecker {
   public static boolean areAnagrams(String str1, String str2) {
      // Convert both strings to lowercase and remove spaces and punctuation
      str1 = str1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
      str2 = str2.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
      
      // Sort the strings alphabetically
      char[] str1Array = str1.toCharArray();
      char[] str2Array = str2.toCharArray();
      Arrays.sort(str1Array);
      Arrays.sort(str2Array);
      
      // Compare the sorted strings
      return Arrays.equals(str1Array, str2Array);
   }
   
   public static void main(String[] args) {
      String str1 = "rail safety";
      String str2 = "fairy tales";
      
      if (areAnagrams(str1, str2)) {
         System.out.println(str1 + " and " + str2 + " are anagrams.");
      } else {
         System.out.println(str1 + " and " + str2 + " are not anagrams.");
      }
   }
}


*/