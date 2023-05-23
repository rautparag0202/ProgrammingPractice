package test;

public class CamelCaseString {



	public static void main(String[] args) {

		String str = "This is a sample string with some duplicate words. This is a duplicate string with duplicate words.";
		System.out.println(toCamelCaseWithUnderscore(str));

	}

	public static String toCamelCaseWithUnderscore(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		StringBuilder result = new StringBuilder();
		String[] words = str.trim().split("[\\s_-]+");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			result.append(" ");
			result.append(Character.toUpperCase(word.charAt(0)));


			if (word.length() > 1) {
				result.append(word.substring(1).toLowerCase());
			}
		}
		return result.toString().trim();
	}

}


// Time and SPace - O(n)

/*

public static String setMyNewString(String s){

		StringBuffer sb = new StringBuffer();

		if(s.length() < 1 || s == null){
			return s;
		}

		sb.append(Character.toUpperCase(s.charAt(0)));

		for(int i=1;i<s.length();i++) {

			char prev = s.charAt(i-1) ;
			if(prev == ' ') {
				sb.append(Character.toUpperCase(s.charAt(i))); }

			else {
				sb.append(s.charAt(i));
			}
			}   

		return sb.toString().trim();
	}
	
*/