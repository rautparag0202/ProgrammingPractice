package test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum{

public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
    		if(map.containsKey(target-nums[i])) {
    			System.out.println(i);
    			System.out.println(map.get(target-nums[i]));
    			return new int[] {i, map.get(target-nums[i])};
    		}
    		else {
    			map.put(nums[i], 1);
    		}
    }
    return new int[0];
}

public static void main(String[] args) {
	int[] arr = {7,8,1,4,6,7,4,9,0,5};
	System.out.println(twoSum(arr, 9));
}
}