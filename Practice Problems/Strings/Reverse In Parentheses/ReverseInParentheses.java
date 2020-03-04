import java.lang.StringBuilder;

class ReverseInParentheses {
    public static String reverseInParentheses(String s) {
        StringBuilder str = new StringBuilder("");

        int start = 0;
        int end = s.length() - 1;
    
        if (s.contains("(")) {
            start = s.lastIndexOf("(");
            end = s.indexOf(")", start);
            str.append(s, start+1, end);
            return reverseInParentheses(s.substring(0, start) + str.reverse().toString() + s.substring(end+1));
        }

        return s;
    }

    public static void main(String[] args) {
        
        String s = "foo(bar)baz";

        String solution = reverseInParentheses(s);

        System.out.println(solution);
    }
}
