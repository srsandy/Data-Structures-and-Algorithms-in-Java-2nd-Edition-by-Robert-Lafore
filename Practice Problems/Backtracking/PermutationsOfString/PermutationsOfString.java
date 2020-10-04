import java.util.HashSet;

public class PermutationsOfString {

	public static void main(String args[]) {

		String input = "ABC";
		HashSet<String> resultSet = new HashSet<String>();

		permutation(input, 0, resultSet);

		for (String str : resultSet) {
			System.out.println(str);
		}

	}

	public static void permutation(String input, int fixedIndex, HashSet<String> resultSet) {


		if (fixedIndex == input.length()-1) {
			resultSet.add(input);
			return;
		}

		for (int i = fixedIndex; i < input.length(); i++) {

			input = swap(input, fixedIndex, i);
			resultSet.add(input);
			permutation(input, fixedIndex+1, resultSet);
			input = swap(input, fixedIndex, i);

		}

	}

	public static String swap(String s, int i, int j) {

		char[] input = s.toCharArray();

		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;

		return String.valueOf(input);
	}

}
