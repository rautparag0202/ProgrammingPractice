package test;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedInteger {
    public static Integer findFirstRepeatedInt(Integer[] arr) {
    	
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return null; // return null if no repeated integer found
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 3, 5, 6, 4, 4, 7};
        Integer firstRepeatedInt = findFirstRepeatedInt(arr);
        if (firstRepeatedInt == null) {
            System.out.println("No repeated integer found");
        } else {
            System.out.println("First repeated integer is " + firstRepeatedInt);
        }
    }
}
/*

In this program, we use a HashSet to keep track of the integers we have encountered so far.
We iterate over the array of integers and check if the current integer is already in the set.
If it is, then we have found the first repeated integer and we return it. 
If not, we add the integer to the set and continue iterating. If no repeated integer is found, we return null.

The time complexity of this program is O(n),
where n is the length of the input array.
This is because we iterate over the array once and perform constant-time set operations.

The space complexity of this program is also O(n),
because in the worst case (when all integers in the array are unique),
we will need to store all n integers in the set.

*/




