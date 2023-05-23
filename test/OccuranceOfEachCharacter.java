package test;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String str = "Hello, World!";
		int[] count = new int[256];

		for(char c:str.toCharArray()) {
			count[c]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				System.out.println((char)i+" "+count[i]);
			}
		}

	}
}

/*

The time complexity of this program is O(n), 
where n is the length of the input string. 
This is because we need to loop through each character in the input string once.

The space complexity of this program is O(1), 
because the size of the count array is fixed at 256 regardless of the length of the input string.

*/