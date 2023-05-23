package test;

public class RemoveUncommoncharofTwoStr {
	
	public static String removeUncommonChars(String s1, String s2) {
		  StringBuilder commonChars = new StringBuilder();
		    for (char c : s1.toCharArray()) {
		        if (s2.indexOf(c) != -1 && commonChars.indexOf(Character.toString(c)) == -1) {
		            commonChars.append(c);
		        }
		    }
		    return commonChars.toString();
		    
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String result = removeUncommonChars(s1, s2);
        System.out.println(result); // Output: Strng
    }

}

/*
Input 1:
s1 = "Strong"
s2 = "String"
Output 1:
"Strng"

Input 2:
s1 = "Hello"
s2 = "World"
Output 2:
"Heloorld"
*/