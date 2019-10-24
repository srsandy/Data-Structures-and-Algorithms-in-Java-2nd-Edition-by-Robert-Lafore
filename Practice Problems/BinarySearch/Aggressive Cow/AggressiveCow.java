import java.io.*;
import java.util.*;

public class aggrCow {

    public static void main (String args[]) throws IOException {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T--!=0) {
            String inp[]=br.readLine().split(" ");
            int N=Integer.parseInt(inp[0]);
            int C=Integer.parseInt(inp[1]);
            int ar[]=new int[N];
            for(int i=0;i<N;i++) {
                ar[i]=Integer.parseInt(br.readLine());
            }
            Arrays.sort(ar);
            int low=0,high=ar[N-1],mid,max=-1;
            while(low<high) {
                mid=(low+high)/2;
                if(isPossible(ar,mid,C) ){
                    if(max<mid) {
                        max=mid;
                    }
                    low=mid+1;
                }
                else {
                    high=mid;
                }
            }
            System.out.println(max);
        }
    }
    
    public static boolean isPossible(int ar[],int d,int cows) {
        int pre=ar[0],c=1;
        for(int i=1; i<ar.length; i++) {
            if(ar[i]-pre>=d) {
                pre=ar[i];
                c++;
                if(c==cows){
                    return true;
                }
            }
        }
        return false;
    }    
}