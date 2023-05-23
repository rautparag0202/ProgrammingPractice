package test;

public class PalindromeChecker {
	   public static boolean isPalindrome(String str) {
	      // Convert the string to lowercase and remove spaces and punctuation
	      str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
	      
	      // Create a new string by reversing the characters of the original string
	      String reversedStr = new StringBuilder(str).reverse().toString();
	      
	      // Compare the original string with the reversed string
	      return str.equals(reversedStr);
	   }
	   
	   public static void main(String[] args) {
	      String str = "A man, a plan, a canal, Panama!";
	      
	      if (isPalindrome(str)) {
	         System.out.println(str + " is a palindrome.");
	      } else {
	         System.out.println(str + " is not a palindrome.");
	      }
	   }
	}


/*

public class PalindromeChecker {
   public static boolean isPalindrome(String str) {
      // Convert the string to lowercase and remove spaces and punctuation
      str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
      
      // Compare the characters of the string from both ends
      int left = 0;
      int right = str.length() - 1;
      while (left < right) {
         if (str.charAt(left) != str.charAt(right)) {
            return false;
         }
         left++;
         right--;
      }
      
      return true;
   }
   
   public static void main(String[] args) {
      String str = "A man, a plan, a canal, Panama!";
      
      if (isPalindrome(str)) {
         System.out.println(str + " is a palindrome.");
      } else {
         System.out.println(str + " is not a palindrome.");
      }
   }
}

The time complexity of this algorithm is O(n), where n is the length of the input string.
 The space complexity is O(1), because we are only using a constant amount of 
 additional space to store the left and right pointers.

*/