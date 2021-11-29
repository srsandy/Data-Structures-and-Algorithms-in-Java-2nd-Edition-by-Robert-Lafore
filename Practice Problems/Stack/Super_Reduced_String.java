/*Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length by doing a series of operations. 
In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string aab could be shortened to b in one operation.
Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print Empty String

Function Description
Complete the superReducedString function in the editor below. It should return the super reduced string or Empty String if the final string is empty.
superReducedString has the following parameter(s):a string to reduce

Input Format
A single string,s.

Output Format
If the final string is empty, print Empty String; otherwise, print the final non-reducible string.
*/


public class Solution {

    //superReducedString function below.
    static String superReducedString(String s) {
        String st1="";
        Stack<Character> stack = new Stack<>();
        int i=0;
        char ch;
        while(i<s.length()){
            char c=s.charAt(i);
            if(stack.empty()){
                stack.push(c);
                i++;}
            else if (stack.peek() == c){
                stack.pop();
                i++;} 
            else{
                stack.push(c);
                i++;}
                }
        if(!stack.empty()){
            while(!stack.empty()){
                ch = stack.pop();
                st1 = ch + st1;}
        return st1;
        }
        else{
            return"Empty String";
        }
    }
}
