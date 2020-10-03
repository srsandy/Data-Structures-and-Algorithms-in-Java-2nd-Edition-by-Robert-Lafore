public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {

		//Given String
		String input = "abcabcbb";
		
		int startIndex = 0, i, j, tempLen = 0, resLen = 1;
		char[] inputArray = input.toCharArray();
		
		if (inputArray.length == 0) return;
		
		for (i = 1; i < inputArray.length; i++) {
			for (j = startIndex; j < i; j++) {
				//We found same character twice
				if (inputArray[i] == inputArray[j]) {
					//Move our startIndex such that the new substring doesn't contain repeating character
					startIndex = j + 1;
					break;
				}
			}
			tempLen = i - startIndex + 1;
			resLen = max(tempLen, resLen);
		}
		
		//Print the maximum length of the non-repeating subsequence
		System.out.println(resLen);
	}
	
	public static int max(int a, int b) {
		if (a > b) return a;
		else return b;
	}
	
}
