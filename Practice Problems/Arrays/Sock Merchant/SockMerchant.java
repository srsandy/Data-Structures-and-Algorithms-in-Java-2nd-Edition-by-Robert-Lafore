import java.util.*;
class SockMerchant{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) 
        {
            ar[i] = scanner.nextInt();
        }
        int len = n;
        int i=0,j=0,k=0,count=0;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                    
                    for(k=i;k<len-1;k++)
                    {
                        ar[k]=ar[k+1];
                    }
                    for(k=j-1;k<len-1;k++)
                    {
                        ar[k]=ar[k+1];
                    }

                    len-=2;
                    i=0;
                    j=0;
                }
            }
        }
        System.out.println(count);
    }
}