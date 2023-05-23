package test;

import java.util.*;

	public class SortHashMapBasedOnValues {
	    public static void main(String[] args) {
	        // Create a HashMap
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("A", 10);
	        hashMap.put("B", 20);
	        hashMap.put("C", 30);
	        hashMap.put("D", 15);
	        System.out.println("Original HashMap: " + hashMap);

	        // Create a List from the HashMap entries
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

	        // Sort the List based on values using a custom Comparator
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return o1.getValue().compareTo(o2.getValue());
	            }
	        });

	        // Create a new LinkedHashMap from the sorted List
	        Map<String, Integer> sortedHashMap = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedHashMap.put(entry.getKey(), entry.getValue());
	        }

	        System.out.println("Sorted HashMap by Value: " + sortedHashMap);
	    }
	}

