package test;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";
        
        String result = str1 + str2;
        
        System.out.println(result);
    }
}

/*
n this example, we define two strings str1 and str2, and then concatenate them together using the + operator. 
The result is then stored in the result variable, which is printed to the console using the System.out.println() method.
The time complexity of string concatenation in Java depends on the size of the strings being concatenated. 

If the strings are relatively small, the time complexity will be O(n), where n is the total length of the strings.
However, if the strings are very large, the time complexity can become O(n^2), as each character in the second string must be copied individually 
to the end of the first string.

The space complexity of string concatenation in Java is also O(n), 
where n is the total length of the concatenated string. This is because a new string object is created to hold the concatenated result, 
which requires space proportional to the length of the result string.
*/