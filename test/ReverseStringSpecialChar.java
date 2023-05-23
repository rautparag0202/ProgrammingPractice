package test;

public class ReverseStringSpecialChar {

	public static String reverseString(String str) {
	    char[] chars = str.toCharArray();
	    int left = 0;
	    int right = chars.length - 1;
	    while (left < right) {
	        if (!isSpecialChar(chars[left]) && !isSpecialChar(chars[right])) {
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;
	            left++;
	            right--;
	        } else if (isSpecialChar(chars[left])) {
	            left++;
	        } else if (isSpecialChar(chars[right])) {
	            right--;
	        }
	    }
	    return new String(chars);
	}

	private static boolean isSpecialChar(char c) {
	    return !Character.isLetterOrDigit(c);
	    
	}
	
	public static void main(String[] args) {
		
		String str = "abcd#123xyz@4";
		System.out.println(reverseString(str));
		
	}

}

//The time complexity of the given algorithm is O(n) and the space complexity is O(n).

