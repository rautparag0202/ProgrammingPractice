package test;


/*
     Check if the length of both strings is equal. If not, return false.
    Append the first two characters of the original string to the end of it.
    Compare the resulting string with the rotated string. If they are equal, return true. Otherwise, return false.
    
        Time complexity: O(n)
    Space complexity: O(n)
    
 */
public class StringRotationChecking {

	    public static boolean isRotatedByTwo(String original, String rotated) {
	        if (original.length() != rotated.length()) {
	            return false;
	        }
	        String rotatedByTwo = original.substring(2) + original.substring(0, 2);
	        return rotatedByTwo.equals(rotated);
	    }
	    
	    public static void main(String[] args) {
	        String original = "abcdef";
	        String rotated = "cdefab";
	        if (isRotatedByTwo(original, rotated)) {
	            System.out.println(rotated + " is rotated by two places from " + original);
	        } else {
	            System.out.println(rotated + " is not rotated by two places from " + original);
	        }
	    }
	}


