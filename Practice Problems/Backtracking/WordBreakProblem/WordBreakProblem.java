import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreakProblem {
	
	public static void main(String args[]) {
		
		//HashSet will store our dictionary elements to provide O(1) lookup
		HashSet<String> set = new HashSet<>();
		
		//Given Dictionary
		String[] dict = {"mobile","samsung","sam","sung",
	            "man","mango", "icecream","and",
	            "go","love","ice","cream","we"};
		
		//Adding elements to HashSet
		for (String s : dict) {
			set.add(s);
		}
		
		String input = "weloveicecreamandmango";
		
		List<String> ans = new ArrayList<String>();
		
		//function call
		findPossibleStrings(set, input, "", ans);
		
		//print answers
		for (String s : ans) 
			System.out.println(s);
		
	}

	public static void findPossibleStrings(HashSet<String> set, String in, String result, List<String> ans) {
		
		if (in.length() == 0) {
			ans.add(result);
		}
		
		for (int i = 0; i < in.length(); i++) {
			String left = in.substring(0, i+1);
			if (set.contains(left)) {
				String right = in.substring(i+1);
				findPossibleStrings(set, right, result + left + " ", ans);
			}
		}
		
	}
	
}
