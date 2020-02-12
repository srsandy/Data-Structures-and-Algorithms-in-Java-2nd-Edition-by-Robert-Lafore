// Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.

 

// Example 1:

// Input: A = "ab", B = "ba"
// Output: true
// Example 2:

// Input: A = "ab", B = "ab"
// Output: false
// Example 3:

// Input: A = "aa", B = "aa"
// Output: true
// Example 4:

// Input: A = "aaaaaaabc", B = "aaaaaaacb"
// Output: true
// Example 5:

// Input: A = "", B = "aa"
// Output: false
 

// Note:

// 0 <= A.length <= 20000
// 0 <= B.length <= 20000
// A and B consist only of lowercase letters.


class Solution {
    public boolean buddyStrings(String A, String B) {

        if(str1.length() != str2.length()) {
            return false; 
        }
        
        int n = str1.length();
        
        int prev = -1;
        int next = -1;
        int count = 0;
        
        if(str1.equals(str2)) {
           HashSet<Character> set = new HashSet<>();
            for (char c : str1.toCharArray())
            {
                set.add(c);
            }
            return set.size() < n;  
        }
        
        for(int i=0; i <n; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                count++;
                
                if(count > 2) return false;
                
                prev = next;
                next = i;
            } 
            
        }
        
        return count == 2 && str1.charAt(prev) == str2.charAt(next) && str1.charAt(next) == str2.charAt(prev);
        
    }
}