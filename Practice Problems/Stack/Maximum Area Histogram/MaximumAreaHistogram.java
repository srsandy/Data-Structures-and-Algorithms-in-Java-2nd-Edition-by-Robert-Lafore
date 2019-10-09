import java.util.*;
import java.io.*;

public class MaximumAreaHistogram {
    
    public static void main(String[] args){
        int hist[] = {2, 1, 4, 5, 1, 3, 3};
        int maximumArea = largestRectangleArea(hist);
        System.out.println(maximumArea);
    }
    
    public static int largestRectangleArea(int[] A) {
        Stack<Integer> st = new Stack<Integer>();
        int ans = 0;
        for (int i = 0 ; i < A.length || !st.isEmpty(); ){
            if (i >= A.length){
                ans = Math.max(ans, A[st.pop()] * (st.isEmpty() ? i : i - st.peek() - 1) );
                continue;
            }
            if (st.isEmpty() || A[st.peek()] <= A[i]){
                st.push(i++);
            }else if (A[st.peek()] > A[i]){
                ans = Math.max(ans, A[st.pop()] * (st.isEmpty() ? i : i - st.peek() - 1) );
            }
        }
        return ans;
    }
}

